package com.dao;

import com.pojo.Interestsgroup;

/**
 * Created by frank_xiang on 2016/6/28.
 */

/**
 * interestgroupDAO接口 提供了对interestgroup进行增删改查功能的接口，将在daoImpl包中进行具体的实现。
 */
public interface interestsgroupDAO {
    /**
     * createInterestsgroup方法实现了向数据库中增加一个interestsgroup的功能
     * @param interestsgroup 传入要增加的interestsgroup
     */
    public void createInterestsgroup(Interestsgroup interestsgroup);

    /**
     * deleteInterestsgroup方法实现了从数据库中删除一个interestsgroup的功能
     * @param interestsgroupId 传入commentId以根据interestsgroupId找到要删除的interestsgroup
     */
    public void deleteInterestsgroup(int interestsgroupId);

    /**
     * updateInterestsgroup方法实现了向数据库中修改一个interestsgroup属性的功能
     * @param interestsgroup 传入要修改的interestsgroup（包含修改属性）
     */
    public void updateInterestsgroup(Interestsgroup interestsgroup);

    /**
     * findInterestsgroupById方法实现了根据interestsgroupId找到一个interestsgroup信息的功能
     * @param interestsgroupId 传入interestsgroupId作为查找因子
     * @return 返回需要查找的Interestsgroup类的对象
     */
    public Interestsgroup findInterestsgroupById(int interestsgroupId);
}
