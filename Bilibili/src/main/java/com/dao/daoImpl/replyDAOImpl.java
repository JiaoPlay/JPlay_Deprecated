package com.dao.daoImpl;

import com.dao.replyDAO;
import com.pojo.Reply;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created by frank_xiang on 2016/6/28.
 */
public class replyDAOImpl extends HibernateDaoSupport implements replyDAO {
    @Override
    public void createReply(Reply reply) {
        getHibernateTemplate().save(reply);
//        getHibernateTemplate().flush();
    }

    @Override
    public void deleteReply(int replyId) {
        getHibernateTemplate().delete(getHibernateTemplate().load(Reply.class,replyId));
//        getHibernateTemplate().flush();
    }

    @Override
    public void updateReply(Reply reply) {
        getHibernateTemplate().merge(reply);
//        getHibernateTemplate().flush();
    }

    @Override
    public Reply findReplyById(int replyId) {
        return getHibernateTemplate().load(Reply.class,replyId);
    }
}
