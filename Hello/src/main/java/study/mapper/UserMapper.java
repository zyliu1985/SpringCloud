package study.mapper;

import org.springframework.stereotype.Repository;
import study.Entity.User;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

/**
 * Created by banma-317 on 2017/11/14.
 */

public interface UserMapper {
    @Select("select * from user where name = #{name}")
    @Results(value = { @Result(id = true, column = "id", property = "id"),
            @Result(column = "name", property = "name") })
    User findUserByName(@Param("name")String name);

    @Select("select * from user where id = #{id}")
    @Results(value = { @Result(id = true, column = "id", property = "id"),
            @Result(column = "name", property = "name") })
    User findUserById(@org.apache.ibatis.annotations.Param("id")int id);
}
