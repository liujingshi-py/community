package life.liujs.community.mapper;

import life.liujs.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author liujs
 * @version 1.0
 * @date 2021/4/13 0013 上午 10:19
 */
@Mapper
public interface QuestionMapper {
    @Insert("insert into question (title,description,gmt_create,modified,creator,tag) values (#{title},#{description},#{gmtCreate},#{modified},#{creator},#{tag})")
    void create(Question question);
}
