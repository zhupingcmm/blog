package com.blog.controller;

import com.blog.entity.UserInfo;
import com.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhuping on 5/7/2018.
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/login/{userName}")
    public UserInfo selectUser(@PathVariable String userName){
        return userService.selectUser(userName);
    }
}
