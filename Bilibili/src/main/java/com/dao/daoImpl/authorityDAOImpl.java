package com.dao.daoImpl;

import com.dao.authorityDAO;
import com.pojo.Authority;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created by frank_xiang on 2016/6/28.
 */
public class authorityDAOImpl extends HibernateDaoSupport implements authorityDAO {
    @Override
    public void createAuthority(Authority authority) {
        getHibernateTemplate().save(authority);
//        getHibernateTemplate().flush();
    }

    @Override
    public void deleteAuthority(int authId) {
        getHibernateTemplate().delete(getHibernateTemplate().load(Authority.class,authId));
//        getHibernateTemplate().flush();
    }

    @Override
    public void updateAuthority(Authority authority) {
        getHibernateTemplate().merge(authority);
//        getHibernateTemplate().flush();
    }

    @Override
    public Authority findAuthorityById(int authId) {
        return getHibernateTemplate().load(Authority.class,authId);
    }
}
