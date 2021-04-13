package life.liujs.community.dto;

import lombok.Data;

/**
 * @author liujs
 * @version 1.0
 * @date 2021/4/9 0009 下午 4:11
 */

@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatar_url;

}
