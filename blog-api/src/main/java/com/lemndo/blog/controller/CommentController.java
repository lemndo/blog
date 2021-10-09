package com.lemndo.blog.controller;


import com.lemndo.blog.service.ICommentService;
import com.lemndo.blog.vo.Result;
import com.lemndo.blog.vo.params.CommentParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lemndo
 * @since 2021-10-09
 */
@RestController
@RequestMapping("/comments")
public class CommentController {

    @Autowired
    private ICommentService commentService;

    @GetMapping("article/{id}")
    public Result comments(@PathVariable("id") Long id) {
        return commentService.commentsByArticleId(id);
    }

    @PostMapping("create/change")
    public Result comment(@RequestBody CommentParam commentParam) {
        return commentService.comment(commentParam);
    }
}
