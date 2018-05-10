package com.blog.mapper;

import com.blog.entity.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by zhuping on 5/7/2018.
 */
@Repository
public interface UserMapper {
    @Select("SELECT * FROM userInfo WHERE username = #{username} and password = #{password}")
    UserInfo selectUser(@Param("username") String username, @Param("password") String password);
}
