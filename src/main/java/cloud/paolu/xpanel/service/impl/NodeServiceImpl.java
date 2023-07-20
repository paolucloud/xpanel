package cloud.paolu.xpanel.service.impl;

import cloud.paolu.xpanel.entity.Node;
import cloud.paolu.xpanel.mapper.NodeMapper;
import cloud.paolu.xpanel.service.NodeService;
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
public class NodeServiceImpl extends ServiceImpl<NodeMapper, Node> implements NodeService {

}
