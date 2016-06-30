package com.dao.daoImpl;

import com.dao.commentDAO;
import com.pojo.Comment;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created by frank_xiang on 2016/6/28.
 */
public class commentDAOImpl extends HibernateDaoSupport implements commentDAO {
    @Override
    public void createComment(Comment comment) {
        getHibernateTemplate().save(comment);
//        getHibernateTemplate().flush();
    }

    @Override
    public void deleteComment(int commentId) {
        getHibernateTemplate().delete(getHibernateTemplate().load(Comment.class,commentId));
//        getHibernateTemplate().flush();
    }

    @Override
    public void updateComment(Comment comment) {
        getHibernateTemplate().merge(comment);
//        getHibernateTemplate().flush();
    }

    @Override
    public Comment findCommentById(int commentId) {
        return getHibernateTemplate().load(Comment.class,commentId);
    }
}
