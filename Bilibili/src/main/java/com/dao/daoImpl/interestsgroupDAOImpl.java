package com.dao.daoImpl;

import com.dao.interestsgroupDAO;
import com.pojo.Interestsgroup;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created by frank_xiang on 2016/6/28.
 */
public class interestsgroupDAOImpl extends HibernateDaoSupport implements interestsgroupDAO {
    @Override
    public void createInterestsgroup(Interestsgroup interestsgroup) {
        getHibernateTemplate().save(interestsgroup);
//        getHibernateTemplate().flush();
    }

    @Override
    public void deleteInterestsgroup(int interestsgroupId) {
        getHibernateTemplate().delete(getHibernateTemplate().load(Interestsgroup.class,interestsgroupId));
//        getHibernateTemplate().flush();
    }

    @Override
    public void updateInterestsgroup(Interestsgroup interestsgroup) {
        getHibernateTemplate().merge(interestsgroup);
//        getHibernateTemplate().flush();
    }

    @Override
    public Interestsgroup findInterestsgroupById(int interestsgroupId) {
        return getHibernateTemplate().load(Interestsgroup.class,interestsgroupId);
    }
}
