package com.dao.daoImpl;

import com.dao.userDAO;
import com.pojo.User;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created by Admin on 2016/6/27.
 */
public class userDAOImpl extends HibernateDaoSupport implements userDAO {
    @Override
    public void createUser(User user) {
        getHibernateTemplate().save(user);
//        getHibernateTemplate().flush();
    }

    @Override
    public void deleteUser(int userId) {
        getHibernateTemplate().delete(getHibernateTemplate().load(User.class, userId));
//        getHibernateTemplate().flush();
    }

    @Override
    public void updateUser(User user) {
        getHibernateTemplate().merge(user);
//        getHibernateTemplate().flush();
    }

    @Override
    public User findUserById(int userId) {
        return  getHibernateTemplate().load(User.class, userId);
    }
}