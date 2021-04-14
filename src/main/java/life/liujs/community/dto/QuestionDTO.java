package life.liujs.community.dto;

import life.liujs.community.model.User;
import lombok.Data;

/**
 * @author liujs
 * @version 1.0
 * @date 2021/4/14 0014 上午 10:57
 */

@Data
public class QuestionDTO {
    private Integer id;
    private String title;
    private String description;
    private String tag;
    private long gmtCreate;
    private long modified;
    private Integer creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
    private User user;
}
