package life.liujs.community.controller;

import life.liujs.community.dto.QuestionDTO;
import life.liujs.community.mapper.QuestionMapper;
import life.liujs.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author liujs
 * @version 1.0
 * @date 2021/4/18 0018 14:58
 */

@Controller
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/question/{id}")
    public String question(@PathVariable(name = "id") Integer id, Model model){

        QuestionDTO questionDTO = questionService.getById(id);
        //统计阅读数
        questionService.incView(id);
        model.addAttribute("question", questionDTO);
        return "question";
    }
}
