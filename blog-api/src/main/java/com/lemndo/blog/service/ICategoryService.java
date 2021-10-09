package com.lemndo.blog.service;

import com.lemndo.blog.entity.Category;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lemndo.blog.vo.CategoryVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lemndo
 * @since 2021-10-09
 */
public interface ICategoryService extends IService<Category> {

    CategoryVo findCategoryById(Long categoryId);
}
