package cloud.paolu.xpanel.controller;

import cloud.paolu.xpanel.entity.Link;
import cloud.paolu.xpanel.service.LinkService;
import cloud.paolu.xpanel.service.NodeService;
import cloud.paolu.xpanel.util.XrayUrlUtil;
import cn.hutool.core.codec.Base64;
import cn.hutool.core.util.StrUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.casbin.casdoor.entity.CasdoorUser;
import org.casbin.casdoor.service.CasdoorUserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author ray
 * @since 2023-07-19
 */

@Slf4j
@RestController
@RequestMapping("/link")
public class LinkController {


    @Resource
    private LinkService linkService;

    @Resource
    private NodeService nodeService;

    @Resource
    private CasdoorUserService casdoorUserService;

    @GetMapping("{token}")
    public String link(@PathVariable String token) {
        QueryWrapper<Link> wrapper = new QueryWrapper<>();
        wrapper.eq("token", token);
        Link link = linkService.getOne(wrapper);
        if (link == null) {
            return "";
        }
        StringBuilder builder = new StringBuilder();
        try {
            CasdoorUser user = casdoorUserService.getUser(link.getUserid());
            nodeService.list().forEach(node -> builder.append(XrayUrlUtil.jsonUrl(node, user)).append(StrUtil.C_LF));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String s = Base64.encode(builder.toString());
        log.info(s);
        return s;
    }

    @GetMapping(value = "/")
    public ResponseEntity<Page<Link>> list(@RequestParam(required = false) Integer current, @RequestParam(required = false) Integer pageSize) {
        if (current == null) {
            current = 1;
        }
        if (pageSize == null) {
            pageSize = 10;
        }
        Page<Link> aPage = linkService.page(new Page<>(current, pageSize));
        return new ResponseEntity<>(aPage, HttpStatus.OK);
    }

//    @GetMapping(value = "/{id}")
//    public ResponseEntity<Link> getById(@PathVariable("id") String id) {
//        return new ResponseEntity<>(linkService.getById(id), HttpStatus.OK);
//    }

    @PostMapping(value = "/create")
    public ResponseEntity<Object> create(@RequestBody Link params) {
        linkService.save(params);
        return new ResponseEntity<>("created successfully", HttpStatus.OK);
    }

    @PostMapping(value = "/delete/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") String id) {
        linkService.removeById(id);
        return new ResponseEntity<>("deleted successfully", HttpStatus.OK);
    }

    @PostMapping(value = "/update")
    public ResponseEntity<Object> update(@RequestBody Link params) {
        linkService.updateById(params);
        return new ResponseEntity<>("updated successfully", HttpStatus.OK);
    }
}
