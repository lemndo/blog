package com.lemndo.blog.controller;

import com.lemndo.blog.entity.SysUser;
import com.lemndo.blog.utils.UserThreadLocal;
import com.lemndo.blog.vo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping
    public Result test(){
        SysUser sysUser = UserThreadLocal.get();
        System.out.println(sysUser);
        return Result.success(null);
    }
}
