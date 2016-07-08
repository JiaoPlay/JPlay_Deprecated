package com.dao.daoImpl;

import com.dao.interestsgroupDAO;
import com.pojo.Interestsgroup;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created by frank_xiang on 2016/6/28.
 */

/**
 * interestsgroupDAOImpl类对interestsgroupDAO接口的方法进行了实现。<br>
 * 主要包含对interestsgroup类的增删改查四个功能。
 */
public class interestsgroupDAOImpl extends HibernateDaoSupport implements interestsgroupDAO {
    /**
     * createInterestsgroup方法实现了向数据库中增加一个interestsgroup的功能
     * @param interestsgroup 传入要增加的interestsgroup
     */
    @Override
    public void createInterestsgroup(Interestsgroup interestsgroup) {
        getHibernateTemplate().save(interestsgroup);
        getHibernateTemplate().flush();
    }

    /**
     * deleteInterestsgroup方法实现了从数据库中删除一个interestsgroup的功能
     * @param interestsgroupId 传入commentId以根据interestsgroupId找到要删除的interestsgroup
     */
    @Override
    public void deleteInterestsgroup(int interestsgroupId) {
        getHibernateTemplate().delete(getHibernateTemplate().load(Interestsgroup.class,interestsgroupId));
        getHibernateTemplate().flush();
    }

    /**
     * updateInterestsgroup方法实现了向数据库中修改一个interestsgroup属性的功能
     * @param interestsgroup 传入要修改的interestsgroup（包含修改属性）
     */
    @Override
    public void updateInterestsgroup(Interestsgroup interestsgroup) {
        getHibernateTemplate().merge(interestsgroup);
        getHibernateTemplate().flush();
    }

    /**
     * findInterestsgroupById方法实现了根据interestsgroupId找到一个interestsgroup信息的功能
     * @param interestsgroupId 传入interestsgroupId作为查找因子
     * @return 返回需要查找的Interestsgroup类的对象
     */
    @Override
    public Interestsgroup findInterestsgroupById(int interestsgroupId) {
        return getHibernateTemplate().load(Interestsgroup.class,interestsgroupId);
    }
}
