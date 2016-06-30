package com.dao.daoImpl;

import com.dao.categoryDAO;
import com.pojo.Category;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created by frank_xiang on 2016/6/28.
 */
public class categoryDAOImpl extends HibernateDaoSupport implements categoryDAO {
    @Override
    public void createCategory(Category category) {
        getHibernateTemplate().save(category);
//        getHibernateTemplate().flush();
    }

    @Override
    public void deleteCategory(String categoryName) {
        getHibernateTemplate().delete(getHibernateTemplate().load(Category.class,categoryName));
//        getHibernateTemplate().flush();
    }

    @Override
    public void updateCategory(Category category) {
        getHibernateTemplate().merge(category);
//        getHibernateTemplate().flush();
    }

    @Override
    public Category findCategoryByName(String categoryName) {
        return getHibernateTemplate().load(Category.class,categoryName);
    }
}
