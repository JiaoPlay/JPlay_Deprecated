package com.dao.daoImpl;

import com.dao.subscribeDAO;
import com.pojo.Subscribe;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created by frank_xiang on 2016/7/5.
 */
public class subscribeDAOImpl extends HibernateDaoSupport implements subscribeDAO {
    @Override
    public void createSubscribe(Subscribe subscribe) {
        getHibernateTemplate().save(subscribe);
        getHibernateTemplate().flush();
    }

    @Override
    public void deleteSubscribe(int userId, String seriesName) {
        getHibernateTemplate().delete(getHibernateTemplate().find("from Subscribe  where Subscribe .userId=? and Subscribe.seriesName=?",userId,seriesName).get(0));
    }
}
