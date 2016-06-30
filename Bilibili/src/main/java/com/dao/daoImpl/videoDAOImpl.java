package com.dao.daoImpl;

import com.dao.videoDAO;
import com.pojo.Video;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created by frank_xiang on 2016/6/28.
 */

/**
 * videoDAOImpl类对videoDAO接口的方法进行了实现。<br>
 * 主要包含对video类的增删改查四个功能。
 */
public class videoDAOImpl extends HibernateDaoSupport implements videoDAO {
    /**
     * createVideo方法实现了向数据库中增加一个video的功能
     * @param video 传入要增加的video
     */
    @Override
    public void createVideo(Video video) {
        getHibernateTemplate().save(video);
//        getHibernateTemplate().flush();
    }

    /**
     * deleteVideo方法实现了从数据库中删除一个video的功能
     * @param videoId 传入videoId以根据videoId找到要删除的video
     */
    @Override
    public void deleteVideo(int videoId) {
        getHibernateTemplate().delete(getHibernateTemplate().load(Video.class, videoId));
//        getHibernateTemplate().flush();
    }

    /**
     * updateVideo方法实现了向数据库中修改一个video属性的功能
     * @param video 传入要修改的video（包含修改属性）
     */
    @Override
    public void updateVideo(Video video) {
        getHibernateTemplate().merge(video);
//        getHibernateTemplate().flush();
    }

    /**
     * findVideoById方法实现了根据videoId找到一个video信息的功能
     * @param videoId 传入videoId作为查找因子
     * @return 返回需要查找的Video类的对象
     */
    @Override
    public Video findVideoById(int videoId) {
        return  getHibernateTemplate().load(Video.class, videoId);
    }
}
