package com.dao;

import com.pojo.User;

/**
 * Created by Admin on 2016/6/27.
 */

/**
 * userDAO接口 提供了对user进行增删改查功能的接口，将在daoImpl包中进行具体的实现。
 */
public interface userDAO {
    public void createUser(User user);
    public void deleteUser(int userId);
    public void updateUser(User user);
    public User findUserById(int userId);
}
