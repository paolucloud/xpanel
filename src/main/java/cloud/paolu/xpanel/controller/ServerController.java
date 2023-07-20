package cloud.paolu.xpanel.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import cloud.paolu.xpanel.entity.CommonResult;
import cloud.paolu.xpanel.service.ServerService;
import cloud.paolu.xpanel.entity.Server;

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
@RequestMapping("/server")
public class ServerController {


    @Resource
    private ServerService serverService;

    @GetMapping(value = "/")
    public CommonResult<Page<Server>> list(@RequestParam(required = false) Integer current, @RequestParam(required = false) Integer pageSize) {
        if (current == null) {
            current = 1;
        }
        if (pageSize == null) {
            pageSize = 10;
        }
        Page<Server> aPage = serverService.page(new Page<>(current, pageSize));
        return ok(aPage);
    }

    @GetMapping(value = "/{id}")
    public CommonResult<Server> getById(@PathVariable("id") String id) {
        return ok(serverService.getById(id));
    }

    @PostMapping(value = "/create")
    public CommonResult<Object> create(@RequestBody Server params) {
        serverService.save(params);
        return ok("created successfully");
    }

    @PostMapping(value = "/delete/{id}")
    public CommonResult<Object> delete(@PathVariable("id") String id) {
        serverService.removeById(id);
        return ok("deleted successfully");
    }

    @PostMapping(value = "/update")
    public CommonResult<Object> update(@RequestBody Server params) {
        serverService.updateById(params);
        return ok("updated successfully");
    }
}
