package life.liujs.community.service;

import life.liujs.community.exception.CustomizeErrorCode;
import life.liujs.community.exception.CustomizeException;
import life.liujs.community.model.Comment;
import org.springframework.stereotype.Service;

/**
 * @author liujs
 * @version 1.0
 * @date 2021/4/24 0024 19:50
 */

@Service
public class CommentService {
    public void insert(Comment comment) {
        if (comment.getParentId() == null || comment.getParentId() == 0) {
            throw new CustomizeException(CustomizeErrorCode.TARGET_PARAM_NOT_FOND);

        }
    }
}
