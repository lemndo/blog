package com.lemndo.blog.service.impl;

import com.lemndo.blog.entity.ArticleBody;
import com.lemndo.blog.mapper.ArticleBodyMapper;
import com.lemndo.blog.service.IArticleBodyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lemndo.blog.vo.ArticleBodyVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lemndo
 * @since 2021-10-09
 */
@Service
public class ArticleBodyServiceImpl extends ServiceImpl<ArticleBodyMapper, ArticleBody> implements IArticleBodyService {

    @Autowired
    ArticleBodyMapper articleBodyMapper;

    @Override
    public ArticleBodyVo findArticleBodyById(Long articleBodyId) {
        ArticleBody articleBody = articleBodyMapper.selectById(articleBodyId);
        ArticleBodyVo articleBodyVo = new ArticleBodyVo();
        articleBodyVo.setContent(articleBody.getContent());
        return articleBodyVo;
    }
}
