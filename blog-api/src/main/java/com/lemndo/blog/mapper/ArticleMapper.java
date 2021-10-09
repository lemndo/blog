package com.lemndo.blog.mapper;

import com.lemndo.blog.dao.dos.Archives;
import com.lemndo.blog.entity.Article;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lemndo
 * @since 2021-10-09
 */
@Repository
public interface ArticleMapper extends BaseMapper<Article> {

    List<Archives> listArchives();
}
