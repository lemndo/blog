package com.lemndo.blog.service;

import com.lemndo.blog.entity.SysUser;
import com.lemndo.blog.vo.Result;
import com.lemndo.blog.vo.params.LoginParam;

public interface LoginService {

    /**
     * 登录功能
     * @param loginParam
     * @return
     */
    Result login(LoginParam loginParam);

    SysUser checkToken(String token);

    Result logout(String token);
}
