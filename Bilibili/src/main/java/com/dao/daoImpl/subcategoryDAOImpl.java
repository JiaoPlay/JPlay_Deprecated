package com.dao.daoImpl;

import com.dao.subcategoryDAO;
import com.pojo.Subcategory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created by frank_xiang on 2016/6/28.
 */
public class subcategoryDAOImpl extends HibernateDaoSupport implements subcategoryDAO {
    @Override
    public void createSubcategory(Subcategory subcategory) {
        getHibernateTemplate().save(subcategory);
//        getHibernateTemplate().flush();
    }

    @Override
    public void deleteSubcategory(String subcategoryName) {
        getHibernateTemplate().delete(getHibernateTemplate().load(Subcategory.class,subcategoryName));
//        getHibernateTemplate().flush();
    }

    @Override
    public void updateSubcategory(Subcategory subcategory) {
        getHibernateTemplate().merge(subcategory);
//        getHibernateTemplate().flush();
    }

    @Override
    public Subcategory findSubcategoryByName(String subcategoryName) {
        return getHibernateTemplate().load(Subcategory.class,subcategoryName);
    }
}
