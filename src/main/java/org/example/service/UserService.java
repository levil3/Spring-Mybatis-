package org.example.service;

import org.example.bean.User;
import org.example.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserDao userDao;

    public User queryUserByName(String userName) {
        User user = userDao.queryUserByName(userName);
        return user;
    }


}
