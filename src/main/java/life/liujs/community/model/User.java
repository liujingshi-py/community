package life.liujs.community.model;

import lombok.Data;

/**
 * @author liujs
 * @version 1.0
 * @date 2021/4/11 0011 13:33
 */

@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private long gmtCreate;
    private long modified;
    private String avatarUrl;

}
