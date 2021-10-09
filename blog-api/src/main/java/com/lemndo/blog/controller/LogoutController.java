package com.lemndo.blog.controller;

import com.lemndo.blog.service.LoginService;
import com.lemndo.blog.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("logout")
public class LogoutController {
    @Autowired
    private LoginService loginService;

    @GetMapping
    Result logout(@RequestHeader("Authorization") String token) {
        return loginService.logout(token);
    }
}
