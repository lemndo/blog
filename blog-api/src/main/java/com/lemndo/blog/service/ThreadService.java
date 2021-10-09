package com.lemndo.blog.service;

import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.lemndo.blog.entity.Article;
import com.lemndo.blog.mapper.ArticleMapper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class ThreadService {

    @Async("taskExecutor")
    public void updateArticleViewCount(ArticleMapper articleMapper, Article article) {
        int viewCounts = article.getViewCounts();
        Article articleUpdate = new Article();
        articleUpdate.setViewCounts(viewCounts + 1);
        LambdaUpdateWrapper<Article> updateWrapper = new LambdaUpdateWrapper<>();
        updateWrapper.eq(Article::getId, article.getId());
        /*再设置一个条件 为了在多线程下线程安全
            防止查询之后有其他线程修改了值，然后修改本次修改不匹配
        */
        updateWrapper.eq(Article::getViewCounts, article.getViewCounts());
        // update article set view_count=100 where view_count=99 and id=11
        articleMapper.update(articleUpdate, updateWrapper);
    }
}
