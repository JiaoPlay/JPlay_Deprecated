package com.dao.daoImpl;

import com.dao.seriesDAO;
import com.pojo.Series;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created by frank_xiang on 2016/6/28.
 */
public class seriesDAOImpl extends HibernateDaoSupport implements seriesDAO {

    @Override
    public void createSeries(Series series) {
        getHibernateTemplate().save(series);
//        getHibernateTemplate().flush();
    }

    @Override
    public void deleteSeries(String seriesName) {
        getHibernateTemplate().delete(getHibernateTemplate().load(Series.class,seriesName));
//        getHibernateTemplate().flush();
    }

    @Override
    public void updateSeries(Series series) {
        getHibernateTemplate().merge(series);
//        getHibernateTemplate().flush();
    }

    @Override
    public Series findSeriesByName(String seriesName) {
        return getHibernateTemplate().load(Series.class,seriesName);
    }
}
