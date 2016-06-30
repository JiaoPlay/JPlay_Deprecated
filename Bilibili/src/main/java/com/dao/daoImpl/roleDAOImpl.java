package com.dao.daoImpl;

import com.dao.roleDAO;
import com.pojo.Role;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created by frank_xiang on 2016/6/28.
 */
public class roleDAOImpl extends HibernateDaoSupport implements roleDAO {
    @Override
    public void createRole(Role role) {
        getHibernateTemplate().save(role);
//        getHibernateTemplate().flush();
    }

    @Override
    public void deleteRole(int roleId) {
        getHibernateTemplate().delete(getHibernateTemplate().load(Role.class,roleId));
//        getHibernateTemplate().flush();
    }

    @Override
    public void updateRole(Role role) {
        getHibernateTemplate().merge(role);
//        getHibernateTemplate().flush();
    }

    @Override
    public Role findRoleById(int roleId) {
        return getHibernateTemplate().load(Role.class,roleId);
    }
}
