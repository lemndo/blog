package com.lemndo.blog.service.impl;

import com.lemndo.blog.entity.Comment;
import com.lemndo.blog.mapper.CommentMapper;
import com.lemndo.blog.service.ICommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements ICommentService {

}
