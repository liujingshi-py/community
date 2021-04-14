package life.liujs.community.dto;

import lombok.Data;

import java.util.List;

/**
 * @author liujs
 * @version 1.0
 * @date 2021/4/14 0014 下午 5:26
 */

@Data
public class PaginationDTO {
    private List<QuestionDTO> questions;
    private boolean showPrevious;
    private boolean showFirstPage;
    private boolean showNext;
    private boolean showEndPage;
    private Integer page;
    private List<Integer> pages;

    public void setPagination(Integer total, Integer page, Integer size) {
        Integer totalPage;
        if (total % size == 0){
            totalPage = total/size;
        }else {
            totalPage = total/size + 1;
        }
    }
}
