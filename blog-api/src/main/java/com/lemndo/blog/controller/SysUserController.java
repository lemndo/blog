package com.lemndo.blog.controller;


import com.lemndo.blog.service.ISysUserService;
import com.lemndo.blog.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lemndo
 * @since 2021-10-09
 */
@RestController
@RequestMapping("/users")
public class SysUserController {

    @Autowired
    private ISysUserService sysUserService;

    @GetMapping("currentUser")
    public Result currentUser(@RequestHeader("Authorization") String token) {
        return sysUserService.findUserByToken(token);

    }
}
