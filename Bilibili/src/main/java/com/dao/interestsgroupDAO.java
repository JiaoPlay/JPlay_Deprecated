package com.dao;

import com.pojo.Interestsgroup;

/**
 * Created by frank_xiang on 2016/6/28.
 */

/**
 * interestgroupDAO接口 提供了对interestgroup进行增删改查功能的接口，将在daoImpl包中进行具体的实现。
 */
public interface interestsgroupDAO {
    public void createInterestsgroup(Interestsgroup interestsgroup);
    public void deleteInterestsgroup(int interestsgroupId);
    public void updateInterestsgroup(Interestsgroup interestsgroup);
    public Interestsgroup findInterestsgroupById(int interestsgroupId);
}
