package com.service.serviceImpl;

import com.dao.userDAO;
import com.dao.letterDAO;
import com.pojo.Letter;
import com.pojo.User;
import com.service.userService;

import java.util.Map;

/**
 * Created by Admin on 2016/6/27.
 */
public class userServiceImpl implements userService {
    private userDAO userDAO;
    private letterDAO letterDAO;

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

    @Override
    public User findUserByUsername(String username) {
        return userDAO.findUserByUsername(username);
    }

    @Override
    public boolean validateUser(String username, String password) {
        boolean result = false;
        User user;
        if(!((user = findUserByUsername(username))==null)){
            result = true;
        }
        return result;
    }

    @Override
    public void sendletter(String sender, String sendee, String lettercontent) {
        Letter letter = new Letter();
        letter.setLetterContent(lettercontent);
        letter.setSenderId(findUserByUsername(sender).getUserId());
        letter.setReveiverId(findUserByUsername(sendee).getUserId());
        letterDAO.createLetter(letter);
    }
}
