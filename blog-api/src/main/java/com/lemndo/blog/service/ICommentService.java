package com.lemndo.blog.service;

import com.lemndo.blog.entity.Comment;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lemndo.blog.vo.Result;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lemndo
 * @since 2021-10-09
 */
public interface ICommentService extends IService<Comment> {

    /**
     * 根据文章id查询所有的评论列表
     * @param id
     * @return
     */
    Result commentsByArticleId(Long id);
}
