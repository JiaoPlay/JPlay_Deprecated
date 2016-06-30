package com.service;

import com.pojo.User;

/**
 * Created by Admin on 2016/6/27.
 */
public interface userService {
    public void createUser(User user);
    public void deleteUser(int userId);
    public void updateUser(User user);
    public User findUserById(int userId);
    public String validateUser(int userId, byte[] pwdhash);
}
