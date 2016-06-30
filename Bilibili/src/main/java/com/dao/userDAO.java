package com.dao;

import com.pojo.User;
import org.hibernate.criterion.DetachedCriteria;

/**
 * Created by Admin on 2016/6/27.
 */
public interface userDAO {
    public void createUser(User user);
    public void deleteUser(int userId);
    public void updateUser(User user);
    public User findUserById(int userId);
    public boolean validateUser(DetachedCriteria criteria);
}
