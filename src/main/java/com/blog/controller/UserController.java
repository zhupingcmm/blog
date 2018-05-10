package com.blog.controller;

import com.blog.entity.UserInfo;
import com.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by zhuping on 5/7/2018.
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public UserInfo selectUser(@RequestParam ("username") String username, @RequestParam ("password") String password ){
        return userService.selectUser(username,password);
    }
}
