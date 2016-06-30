package com.dao.daoImpl;

import com.dao.postDAO;
import com.pojo.Post;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created by frank_xiang on 2016/6/28.
 */
public class postDAOImpl extends HibernateDaoSupport implements postDAO{
    @Override
    public void createPost(Post post) {
        getHibernateTemplate().save(post);
//        getHibernateTemplate().flush();
    }

    @Override
    public void deletePost(int postId) {
        getHibernateTemplate().delete(getHibernateTemplate().load(Post.class, postId));
//        getHibernateTemplate().flush();
    }

    @Override
    public void updatePost(Post post) {
        getHibernateTemplate().merge(post);
//        getHibernateTemplate().flush();
    }

    @Override
    public Post findPostById(int postId) {
        return  getHibernateTemplate().load(Post.class, postId);
    }
}
