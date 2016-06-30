package com.dao.daoImpl;

import com.dao.tagDAO;
import com.pojo.Tag;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created by frank_xiang on 2016/6/28.
 */
public class tagDAOImpl extends HibernateDaoSupport implements tagDAO {
    @Override
    public void createTag(Tag tag) {
        getHibernateTemplate().save(tag);
//        getHibernateTemplate().flush();
    }

    @Override
    public void deleteTag(int tagId) {
        getHibernateTemplate().delete(getHibernateTemplate().load(Tag.class,tagId));
//        getHibernateTemplate().flush();
    }

    @Override
    public void updateTag(Tag tag) {
        getHibernateTemplate().merge(tag);
//        getHibernateTemplate().flush();
    }

    @Override
    public Tag findTagById(int tagId) {
        return getHibernateTemplate().load(Tag.class,tagId);
    }
}
