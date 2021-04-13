package life.liujs.community.model;

import lombok.Data;

/**
 * @author liujs
 * @version 1.0
 * @date 2021/4/13 0013 上午 10:16
 */

@Data
public class Question {
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

}
