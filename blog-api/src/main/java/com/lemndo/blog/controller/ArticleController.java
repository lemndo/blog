package com.lemndo.blog.controller;


import com.lemndo.blog.service.IArticleService;
import com.lemndo.blog.vo.ArticleVo;
import com.lemndo.blog.vo.Result;
import com.lemndo.blog.vo.params.PageParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lemndo
 * @since 2021-10-09
 */
//json数据进行交互
@RestController
@RequestMapping("/articles")
public class ArticleController {

    @Autowired
    private IArticleService articleService;

//    @PostMapping
//    public Result articles(@RequestBody PageParams pageParams) {
//        List<ArticleVo> articles = articleService.listArticlePage(pageParams);
//        return  Result.success(articles);
//    }

    /**
     * 首页 文章列表
     * @param pageParams
     */
    @PostMapping
    public Result listArticle(@RequestBody PageParams pageParams) {
        return articleService.listArticle(pageParams);
    }

    /**
     * 首页最热文章
     * @return
     */
    @PostMapping("hot")
    public Result hotArticle() {
        int limit = 5;
        return articleService.hotArticle(limit);
    }

    /**
     * 首页最新文章
     * @return
     */
    @PostMapping("new")
    public Result newArticles() {
        int limit = 5;
        return articleService.newArticle(limit);
    }

    @PostMapping("listArchives")
    public Result listArchives() {
        return articleService.listArchives();
    }

    @PostMapping("view/{id}")
    public Result findArticleById(@PathVariable("id") Long articleId) {
        return articleService.findArticleById(articleId);
    }
}
