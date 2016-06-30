package com.service.serviceImpl;

import com.dao.userDAO;
import com.pojo.User;
import com.service.userService;

/**
 * Created by Admin on 2016/6/27.
 */
public class userServiceImpl implements userService {
    private userDAO userDAO;

    public void setUserDAO(userDAO userDAO) {
        this.userDAO = userDAO;
    }

    public userDAO getUserDAO() {
        return userDAO;
    }

    @Override
    public void createUser(User user) {
        userDAO.createUser(user);
    }

    @Override
    public void deleteUser(int userId) {
        userDAO.deleteUser(userId);
    }

    @Override
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }

    @Override
    public User findUserById(int userId) {
        return userDAO.findUserById(userId);
    }
}
