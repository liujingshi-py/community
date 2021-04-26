package life.liujs.community.controller;

import life.liujs.community.dto.CommentDTO;
import life.liujs.community.dto.ResultDTO;
import life.liujs.community.exception.CustomizeErrorCode;
import life.liujs.community.mapper.CommentMapper;
import life.liujs.community.model.Comment;
import life.liujs.community.model.User;
import life.liujs.community.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

/**
 * @author liujs
 * @version 1.0
 * @date 2021/4/24 0024 18:17
 */

@SuppressWarnings("ALL")
@Controller
public class CommentController {

    @Autowired
    private CommentMapper commentMapper;

    @Autowired
    private CommentService commentService;

    @ResponseBody
    @RequestMapping(value = "/comment", method = RequestMethod.POST)
    public Object post(@RequestBody CommentDTO commentDTO,
                       HttpServletRequest request) {

        User user = (User) request.getSession().getAttribute("user");
        if (user == null) {
            return ResultDTO.errorOf(CustomizeErrorCode.NO_LOGIN);
        }
        Comment comment = new Comment();
        comment.setParentId(commentDTO.getParentId());
        comment.setContent(commentDTO.getContent());
        comment.setType(commentDTO.getType());
        comment.setGmtCreate(System.currentTimeMillis());
        comment.setGmtModified(System.currentTimeMillis());
        comment.setCommentator(1);
        comment.setLikeCount(0L);
        commentService.insert(comment);
        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("message", "成功");
        return ResultDTO.okOf();
    }
}
