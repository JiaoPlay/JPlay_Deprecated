package com.dao.daoImpl;

import com.dao.commentDAO;
import com.pojo.Comment;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created by frank_xiang on 2016/6/28.
 */

/**
 * commentDAOImpl类对commentDAO接口的方法进行了实现。<br>
 * 主要包含对comment类的增删改查四个功能。
 */
public class commentDAOImpl extends HibernateDaoSupport implements commentDAO {
    /**
     * createComment方法实现了向数据库中增加一个comment的功能
     * @param comment 传入要增加的comment
     */
    @Override
    public void createComment(Comment comment) {
        getHibernateTemplate().save(comment);
//        getHibernateTemplate().flush();
    }

    /**
     * deleteComment方法实现了从数据库中删除一个comment的功能
     * @param commentId 传入commentId以根据commentId找到要删除的comment
     */
    @Override
    public void deleteComment(int commentId) {
        getHibernateTemplate().delete(getHibernateTemplate().load(Comment.class,commentId));
//        getHibernateTemplate().flush();
    }

    /**
     * updateComment方法实现了向数据库中修改一个comment属性的功能
     * @param comment 传入要修改的comment（包含修改属性）
     */
    @Override
    public void updateComment(Comment comment) {
        getHibernateTemplate().merge(comment);
//        getHibernateTemplate().flush();
    }


    /**
     * findCommentById方法实现了根据commentId找到一个comment信息的功能
     * @param commentId 传入commentId作为查找因子
     * @return 返回需要查找的Comment类的对象
     */
    @Override
    public Comment findCommentById(int commentId) {
        return getHibernateTemplate().load(Comment.class,commentId);
    }
}
