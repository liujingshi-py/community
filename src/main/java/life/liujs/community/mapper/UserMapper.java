package life.liujs.community.mapper;

import life.liujs.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author liujs
 * @version 1.0
 * @date 2021/4/11 0011 13:32
 */

@Mapper
public interface UserMapper {

    @Insert("insert into user (name,account_id,token,gmt_create,modified,avatar_url) values (#{name},#{accountId},#{token},#{gmtCreate},#{modified},#{avatar_url})")
    void insert(User user);

    @Select("select * from user where token = #{token}")
    User findByToken(@Param("token") String token);
}
