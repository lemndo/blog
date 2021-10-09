package com.lemndo.blog.service;

import com.lemndo.blog.entity.Tag;
import com.baomidou.mybatisplus.extension.service.IService;
import com.lemndo.blog.vo.Result;
import com.lemndo.blog.vo.TagVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lemndo
 * @since 2021-10-09
 */
public interface ITagService extends IService<Tag> {
    List<TagVo> findTagsByArticleId(Long articleId);

    Result hots(int limit);
}
