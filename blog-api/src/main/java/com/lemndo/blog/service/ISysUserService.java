package com.lemndo.blog.service;

import com.lemndo.blog.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lemndo
 * @since 2021-10-09
 */
public interface ISysUserService extends IService<SysUser> {
    SysUser findUserById(Long id);
}
