package life.liujs.community.dto;

import lombok.Data;

/**
 * @author liujs
 * @version 1.0
 * @date 2021/4/24 0024 18:26
 */

@Data
public class CommentDTO {
    private Long parentId;
    private String content;
    private Integer type;
}
