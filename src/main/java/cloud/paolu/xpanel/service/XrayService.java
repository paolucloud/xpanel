package cloud.paolu.xpanel.service;

import cloud.paolu.xpanel.constants.GlobalConstants;
import cloud.paolu.xray.app.proxyman.ReceiverConfig;
import cloud.paolu.xray.app.proxyman.SniffingConfig;
import cloud.paolu.xray.app.proxyman.command.*;
import cloud.paolu.xray.common.net.IPOrDomain;
import cloud.paolu.xray.common.net.PortList;
import cloud.paolu.xray.common.net.PortRange;
import cloud.paolu.xray.common.protocol.SecurityConfig;
import cloud.paolu.xray.common.protocol.SecurityType;
import cloud.paolu.xray.common.protocol.User;
import cloud.paolu.xray.common.serial.TypedMessage;
import cloud.paolu.xray.core.InboundHandlerConfig;
import cloud.paolu.xray.proxy.vmess.Account;
import cloud.paolu.xray.transport.internet.StreamConfig;
import com.google.protobuf.ByteString;
import com.google.protobuf.Message;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class XrayService {


    private ManagedChannel channelBuild(String endpoint) {
        return ManagedChannelBuilder.forTarget(endpoint).usePlaintext().build();
    }

    public synchronized HandlerServiceGrpc.HandlerServiceBlockingStub constructBlockingStub(String endpoint) {
        //同步调用stub
        return HandlerServiceGrpc.newBlockingStub(channelBuild(endpoint));
    }

    public synchronized HandlerServiceGrpc.HandlerServiceStub constructAsyncStub(String endpoint) {
        //异步调用stub
        return HandlerServiceGrpc.newStub(channelBuild(endpoint));
    }

    /**
     * @Description: 在一个入站代理中添加一个用户
     * v2RayCoreService.addUser ("proxy",
     * 0,
     * "test@gmail.com",
     * "4c4893c5-7c8f-03a0-0f86-afc800f2897a",
     * 5);
     */
    public AlterInboundRequest addUser(String inBoundTag, int userLevel, String userEmail,
                                       String uuid, int alterId) {

        SecurityConfig securityConfig = SecurityConfig.newBuilder()
                .setType(SecurityType.AUTO)
                .build();

        Account account = Account.newBuilder()
                .setId(uuid)
//                .setAlterId(alterId)
                .setSecuritySettings(securityConfig)
                .build();

        User user = User.newBuilder()
                .setLevel(userLevel)
                .setEmail(userEmail)
                .setAccount(toTypedMessage(account, "xray.proxy.vmess.Account"))
                .build();

        AddUserOperation addUserOperation = AddUserOperation.newBuilder()
                .setUser(user)
                .build();

        TypedMessage operation = toTypedMessage(addUserOperation, "xray.app.proxyman.command.AddUserOperation");

        return AlterInboundRequest.newBuilder()
                .setTag(inBoundTag)
                .setOperation(operation)
                .build();
    }

    /**
     * @Description: 在一个入站代理中删除一个用户
     * v2RayCoreService.removeUser ( "proxy",
     * "test@gmail.com")
     */
    public AlterInboundRequest removeUser(String inBoundTag, String email) {
        RemoveUserOperation removeUserOperation = RemoveUserOperation.newBuilder()
                .setEmail(email)
                .build();
        TypedMessage operation = toTypedMessage(removeUserOperation, "xray.app.proxyman.command.RemoveUserOperation");
        return AlterInboundRequest.newBuilder()
                .setTag(inBoundTag)
                .setOperation(operation)
                .build();
    }

    public AddInboundRequest addInbound(String inBoundTag, int port, String protocol) {
        PortRange portRange = PortRange.newBuilder().setFrom(port).setTo(port).build();
        PortList portList = PortList.newBuilder().addRange(portRange).build();
        IPOrDomain ipOrDomain = IPOrDomain.newBuilder().setIp(ByteString.copyFrom(GlobalConstants.ANY_IP)).build();
        SniffingConfig sniffingConfig = SniffingConfig.newBuilder().setEnabled(false).build();
        StreamConfig streamConfig = StreamConfig.newBuilder().setProtocolName(protocol).build();


        ReceiverConfig receiverConfig = ReceiverConfig.newBuilder()
                .setPortList(portList)
                .setListen(ipOrDomain)
                .setSniffingSettings(sniffingConfig)
                .setStreamSettings(streamConfig)
                .build();
        TypedMessage receiverSettings = toTypedMessage(receiverConfig, "xray.app.proxyman.ReceiverConfig");

        cloud.paolu.xray.proxy.vmess.inbound.Config vmessInboundConfig = cloud.paolu.xray.proxy.vmess.inbound.Config.newBuilder().build();
        TypedMessage proxySettings = toTypedMessage(vmessInboundConfig,"xray.proxy.vmess.inbound.Config");
        log.info(receiverConfig.getDescriptorForType().toString());

        InboundHandlerConfig inboundHandlerConfig = InboundHandlerConfig.newBuilder()
                .setTag(inBoundTag)
                .setReceiverSettings(receiverSettings)
                .setProxySettings(proxySettings)
                .build();

        return AddInboundRequest.newBuilder().setInbound(inboundHandlerConfig).build();
    }

    public AddInboundResponse addInboundBlocking(AddInboundRequest addInboundRequest, String endpoint) throws StatusRuntimeException {

        HandlerServiceGrpc.HandlerServiceBlockingStub stub = constructBlockingStub(endpoint);
        return stub.addInbound(addInboundRequest);
    }

    /**
     * 同步接口
     * 使用示例：添加用户
     * <p>
     * v2RayCoreService.alterInboudBlocking (
     * v2RayCoreService.addUser ("proxy",
     * 0,
     * "test@gmail.com",
     * "4c4893c5-7c8f-03a0-0f86-afc800f2897a",
     * 5)
     * );
     * 使用示例：删除用户
     * v2RayCoreService.alterInboudBlocking (
     * v2RayCoreService.removeUser ( "proxy",
     * "test@gmail.com")
     * );
     */
    public AlterInboundResponse alterInboudBlocking(AlterInboundRequest alterInboundRequest, String endpoint) throws StatusRuntimeException {
        return constructBlockingStub(endpoint).alterInbound(alterInboundRequest);
    }

    /**
     * 异步接口
     */
    public void alterInboundAsync(AlterInboundRequest alterInboundRequest, String endpoint) {
        constructAsyncStub(endpoint).alterInbound(alterInboundRequest, new StreamObserver<AlterInboundResponse>() {

            public void onNext(AlterInboundResponse alterInboundResponse) {
                log.info("async alter inbound onNext response {}", alterInboundResponse);
            }


            public void onError(Throwable throwable) {
                log.error("async alter inbound error ", throwable);
            }


            public void onCompleted() {
                log.info("async alter inbound completed");
            }
        });
    }

    private TypedMessage toTypedMessage(Message message, String type) {
        if (message == null) {
            return null;
        }
        return TypedMessage.newBuilder()
                .setType(type)
                .setValue(message.toByteString())
                .build();
    }
}
