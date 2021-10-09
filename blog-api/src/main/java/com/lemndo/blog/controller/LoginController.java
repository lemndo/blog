package com.lemndo.blog.controller;

import com.lemndo.blog.service.LoginService;
import com.lemndo.blog.vo.Result;
import com.lemndo.blog.vo.params.LoginParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping
    public Result login(@RequestBody LoginParam loginParam) {
        return loginService.login(loginParam);
    }
}
