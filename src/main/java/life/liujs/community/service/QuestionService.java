package life.liujs.community.service;

import life.liujs.community.dto.PaginationDTO;
import life.liujs.community.dto.QuestionDTO;
import life.liujs.community.mapper.QuestionMapper;
import life.liujs.community.mapper.UserMapper;
import life.liujs.community.model.Question;
import life.liujs.community.model.User;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liujs
 * @version 1.0
 * @date 2021/4/14 0014 上午 11:03
 */

@Service
public class QuestionService {

    @Autowired
    QuestionMapper questionMapper;

    @Autowired
    UserMapper userMapper;

    public PaginationDTO list(Integer page, Integer size) {
        Integer offset = size*(page-1);

        List<Question> questions = questionMapper.list(offset, size);
        List<QuestionDTO> questionDTOList = new ArrayList<>();

        PaginationDTO paginationDTO = new PaginationDTO();
        for (Question question : questions) {
            User user = userMapper.findById(question.getCreator());
            QuestionDTO questionDTO = new QuestionDTO();
            BeanUtils.copyProperties(question, questionDTO);
            questionDTO.setUser(user);
            questionDTOList.add(questionDTO);
        }
        paginationDTO.setQuestions(questionDTOList);
        Integer total = questionMapper.count();
        paginationDTO.setPagination(total, page, size);
        return paginationDTO;
    }
}
