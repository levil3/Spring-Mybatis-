package org.example.dao;

import org.example.bean.User;

public interface UserDao {
    /*
        根据用户名查询用户信息
     */
    public User queryUserByName(String userName);
}
