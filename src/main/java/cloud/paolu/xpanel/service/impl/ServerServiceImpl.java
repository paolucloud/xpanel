package cloud.paolu.xpanel.service.impl;

import cloud.paolu.xpanel.entity.Server;
import cloud.paolu.xpanel.mapper.ServerMapper;
import cloud.paolu.xpanel.service.ServerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ray
 * @since 2023-07-18
 */
@Service
public class ServerServiceImpl extends ServiceImpl<ServerMapper, Server> implements ServerService {

}
