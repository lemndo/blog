package com.lemndo.blog.service;

import com.lemndo.blog.entity.Article;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lemndo.blog.vo.ArticleVo;
import com.lemndo.blog.vo.Result;
import com.lemndo.blog.vo.params.PageParams;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lemndo
 * @since 2021-10-09
 */
public interface IArticleService extends IService<Article> {

    List<ArticleVo> listArticlePage(PageParams pageParams);

    Result listArticle(PageParams pageParams);

    /**
     * 最热文章
     * @param limit
     * @return
     */
    Result hotArticle(int limit);

    Result newArticle(int limit);

    /**
     * 文章归档
     * @return
     */
    Result listArchives();

    /**
     * 查看文章详情
     * @param articleId
     * @return
     */
    Result findArticleById(Long articleId);
}
