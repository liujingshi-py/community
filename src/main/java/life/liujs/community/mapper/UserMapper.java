package life.liujs.community.mapper;

import life.liujs.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author liujs
 * @version 1.0
 * @date 2021/4/11 0011 13:32
 */

@Mapper
public interface UserMapper {

    @Insert("insert into user (name,account_id,token,gmt_create,modified) values (#{name},#{accountId},#{token},#{gmtCreate},#{modified})")
    void insert(User user);
}
