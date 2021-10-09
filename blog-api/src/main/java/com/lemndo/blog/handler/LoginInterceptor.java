package com.lemndo.blog.handler;

import com.alibaba.fastjson.JSON;
import com.lemndo.blog.entity.SysUser;
import com.lemndo.blog.service.LoginService;
import com.lemndo.blog.vo.ErrorCode;
import com.lemndo.blog.vo.Result;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.management.relation.RelationSupport;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
@Slf4j
public class LoginInterceptor implements HandlerInterceptor {

    @Autowired
    private LoginService loginService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //在执行方法之前调用
        /**
         * 1.需要判断请求的接口路径是否为 HandlerMethod(controller方法)
         * 2.判断token是否为空，如果为空 未登录
         * 3.如果token不为空，登录验证 loginService checkToken
         * 4.如果认证成功 放行即可
         */
        if (!(handler instanceof HandlerMethod)) {
            return true;
        }
        String token = request.getHeader("Authorization");

        log.info("=================request start===========================");
        String requestURI = request.getRequestURI();
        log.info("request uri:{}",requestURI);
        log.info("request method:{}",request.getMethod());
        log.info("token:{}", token);
        log.info("=================request end===========================");

        SysUser sysUser = loginService.checkToken(token);
        if (StringUtils.isBlank(token) || sysUser == null) {
            Result result = Result.fail(ErrorCode.NO_LOGIN.getCode(), ErrorCode.NO_LOGIN.getMsg());
            response.setContentType("application/json;charset=utf-8");
            response.getWriter().print(JSON.toJSONString(result));

            return false;
        }

        //登录验证成功，放行
        return true;
    }
}
