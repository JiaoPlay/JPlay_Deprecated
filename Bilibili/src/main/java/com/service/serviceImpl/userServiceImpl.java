package com.service.serviceImpl;

import com.dao.daoImpl.userDAOImpl;
import com.service.userService;

/**
 * Created by Admin on 2016/6/27.
 */
public class userServiceImpl implements userService {
    private userDAOImpl userDAO;

    public void setUserDAO(userDAOImpl userDAO) {
        this.userDAO = userDAO;
    }

    public userDAOImpl getUserDAO() {
        return userDAO;
    }
}
