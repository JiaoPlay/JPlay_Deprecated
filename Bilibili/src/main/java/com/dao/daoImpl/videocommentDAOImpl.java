package com.dao.daoImpl;

import com.dao.videocommentDAO;
import com.pojo.VideoComment;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created by frank_xiang on 2016/7/5.
 */
public class videocommentDAOImpl extends HibernateDaoSupport implements videocommentDAO {
    @Override
    public void createVideoComment(VideoComment videoComment) {
        getHibernateTemplate().save(videoComment);
        getHibernateTemplate().flush();
    }

    @Override
    public void deleteVideoComment(int videoId, int commentId) {
        getHibernateTemplate().delete(getHibernateTemplate().find("from VideoComment as videocomment where videocomment.videoId = ? and videocomment.commentId = ?",videoId,commentId).get(0));
        getHibernateTemplate().flush();
    }
}
