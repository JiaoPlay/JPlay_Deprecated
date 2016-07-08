package com.dao.daoImpl;

import com.dao.userreplyDAO;
import com.pojo.UserReply;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created by frank_xiang on 2016/7/6.
 */
public class userreplyDAOImpl extends HibernateDaoSupport implements userreplyDAO {
    @Override
    public void createUserReply(UserReply userReply) {
        getHibernateTemplate().save(userReply);
        getHibernateTemplate().flush();
    }

    @Override
    public void deleteUserReply(int userId, int replyId) {
        getHibernateTemplate().delete(getHibernateTemplate().find("from UserReply as userreply where userreply.userId = ? and userreply.replyId = ?",userId,replyId).get(0));
        getHibernateTemplate().flush();
    }
}
