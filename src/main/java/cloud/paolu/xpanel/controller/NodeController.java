package cloud.paolu.xpanel.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cloud.paolu.xpanel.entity.CommonResult;
import cloud.paolu.xpanel.service.NodeService;
import cloud.paolu.xpanel.entity.Node;

import static cloud.paolu.xpanel.entity.CommonResult.ok;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ray
 * @since 2023-07-18
 */
@Controller
@RequestMapping("/node")
public class NodeController {


    @Resource
    private NodeService nodeService;

    @GetMapping(value = "/")
    public CommonResult<Page<Node>> list(@RequestParam(required = false) Integer current, @RequestParam(required = false) Integer pageSize) {
        if (current == null) {
            current = 1;
        }
        if (pageSize == null) {
            pageSize = 10;
        }
        Page<Node> aPage = nodeService.page(new Page<>(current, pageSize));
        return ok(aPage);
    }

    @GetMapping(value = "/{id}")
    public CommonResult<Node> getById(@PathVariable("id") String id) {
        return ok(nodeService.getById(id));
    }

    @PostMapping(value = "/create")
    public CommonResult<Object> create(@RequestBody Node params) {
        nodeService.save(params);
        return ok("created successfully");
    }

    @PostMapping(value = "/delete/{id}")
    public CommonResult<Object> delete(@PathVariable("id") String id) {
        nodeService.removeById(id);
        return ok("deleted successfully");
    }

    @PostMapping(value = "/update")
    public CommonResult<Object> update(@RequestBody Node params) {
        nodeService.updateById(params);
        return ok("updated successfully");
    }
}
