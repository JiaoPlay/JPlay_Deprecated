package com.dao.daoImpl;

import com.dao.userroleDAO;
import com.pojo.UserRole;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created by frank_xiang on 2016/7/7.
 */
public class userroleDAOImpl extends HibernateDaoSupport implements userroleDAO {
    @Override
    public void createUserRole(UserRole userRole) {
        getHibernateTemplate().save(userRole);
        getHibernateTemplate().flush();
    }

    @Override
    public void deleteUserRole(int userId, int roleId) {
        getHibernateTemplate().delete(getHibernateTemplate().find("from UserRole as userrole where userrole.userId = ? and userrole.roleId = ?",userId,roleId).get(0));
        getHibernateTemplate().flush();
    }
}
