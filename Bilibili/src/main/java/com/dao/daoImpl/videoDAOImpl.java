package com.dao.daoImpl;

import com.dao.videoDAO;
import com.pojo.Video;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created by frank_xiang on 2016/6/28.
 */
public class videoDAOImpl extends HibernateDaoSupport implements videoDAO {
    @Override
    public void createVideo(Video video) {
        getHibernateTemplate().save(video);
//        getHibernateTemplate().flush();
    }

    @Override
    public void deleteVideo(int videoId) {
        getHibernateTemplate().delete(getHibernateTemplate().load(Video.class, videoId));
//        getHibernateTemplate().flush();
    }

    @Override
    public void updateVideo(Video video) {
        getHibernateTemplate().merge(video);
//        getHibernateTemplate().flush();
    }

    @Override
    public Video findVideoById(int videoId) {
        return  getHibernateTemplate().load(Video.class, videoId);
    }
}
