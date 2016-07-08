package com.dao.daoImpl;

import com.dao.interestsgroupuserDAO;
import com.pojo.InterestgroupUser;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created by frank_xiang on 2016/7/5.
 */
public class interestsgroupuserDAOImpl extends HibernateDaoSupport implements interestsgroupuserDAO {
    @Override
    public void createInterestsGroupUser(InterestgroupUser interestgroupUser) {
        getHibernateTemplate().save(interestgroupUser);
        getHibernateTemplate().flush();
    }

    @Override
    public void deleteInterestsGroupUser(int userId, int interestsgroupId) {
        getHibernateTemplate().delete(getHibernateTemplate().find("from InterestgroupUser where InterestgroupUser.userId = ? and InterestgroupUser.interestGroupId = ?",userId,interestsgroupId));
        getHibernateTemplate().flush();
    }

    @Override
    public void updateInterestsGroupUser(InterestgroupUser interestgroupUser) {
        getHibernateTemplate().merge(interestgroupUser);
    }

    @Override
    public InterestgroupUser findInterestsGroupUserByKeys(int userId, int interestsgroupId) {
        if(getHibernateTemplate().find("from InterestgroupUser where InterestgroupUser.userId = ? and InterestgroupUser.interestGroupId = ?",userId,interestsgroupId).size()==0)
            return null;
        else
            return (InterestgroupUser)getHibernateTemplate().find("from InterestgroupUser where InterestgroupUser.userId = ? and InterestgroupUser.interestGroupId = ?",userId,interestsgroupId).get(0);
    }
}
