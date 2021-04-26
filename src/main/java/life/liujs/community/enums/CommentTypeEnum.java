package life.liujs.community.enums;

import java.lang.reflect.Type;

/**
 * @author liujs
 * @version 1.0
 * @date 2021/4/24 0024 19:45
 */
public enum CommentTypeEnum {
    QUESTION(1),
    COMMENT(2);
    private Integer type;

    public Integer getType() {
        return type;
    }

    CommentTypeEnum(Integer type) {
        this.type = type;
    }

}
