package com.lemndo.blog.controller;


import com.lemndo.blog.service.ITagService;
import com.lemndo.blog.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lemndo
 * @since 2021-10-09
 */
@RestController
@RequestMapping("tags")
public class TagController {
    @Autowired
    private ITagService tagService;

    @GetMapping("/hot")
    public Result hot() {
        int limit = 6;
        return tagService.hots(limit);
    }

    @GetMapping
    public Result findAll() {
        return tagService.findAll();
    }
}
