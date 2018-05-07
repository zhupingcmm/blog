package com.blog.mapper;

import com.blog.entity.UserInfo;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by zhuping on 5/7/2018.
 */
@Repository
public interface UserMapper {
    @Select("SELECT * FROM userInfo WHERE username = #{userName}")
    UserInfo selectUser(String userName);
}
