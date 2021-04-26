package life.liujs.community.exception;

/**
 * @author liujs
 * @version 1.0
 * @date 2021/4/19 0019 19:16
 */
public enum CustomizeErrorCode implements ICustomizeErrorCode {

    QUESTION_NOT_FOUND("你找的问题已经不存在了，换个试试吧？", 2001),
    TARGET_PARAM_NOT_FOND("未选择任何问题或评论进行恢复", 2002),
    NO_LOGIN("请先登录", 2003),
    ;

    @Override
    public String getMessage() {
        return message;
    }

    public Integer getCode() {
        return code;
    }

    private String message;
    private Integer code;

    CustomizeErrorCode(String message, Integer code) {
        this.message = message;
        this.code = code;
    }

}
