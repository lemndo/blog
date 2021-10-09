package com.lemndo.blog.service;

import com.lemndo.blog.entity.ArticleBody;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lemndo.blog.vo.ArticleBodyVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lemndo
 * @since 2021-10-09
 */
public interface IArticleBodyService extends IService<ArticleBody> {


    ArticleBodyVo findArticleBodyById(Long articleBodyId);
}
