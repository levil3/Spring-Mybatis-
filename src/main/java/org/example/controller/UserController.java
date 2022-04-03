package org.example.controller;

import org.example.bean.User;
import org.example.service.UserService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
@Controller
public class UserController {

    @Resource
    private UserService userService;

    public User queryUserByName(String userName) {
        return userService.queryUserByName(userName);
    }

}
