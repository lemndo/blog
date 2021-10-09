package com.lemndo.blog.controller;


import com.lemndo.blog.entity.Category;
import com.lemndo.blog.service.ICategoryService;
import com.lemndo.blog.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.management.relation.RelationSupport;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lemndo
 * @since 2021-10-09
 */
@RestController
@RequestMapping("categorys")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    @GetMapping
    public Result categories() {
        return categoryService.findAll();
    }
}
