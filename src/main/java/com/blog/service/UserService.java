package com.blog.service;

import com.blog.entity.UserInfo;
import com.blog.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhuping on 5/7/2018.
 */
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;
    public UserInfo selectUser(String userName){
        return userMapper.selectUser(userName);
    }
}
