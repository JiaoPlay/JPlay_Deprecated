package com.dao;

import com.pojo.InterestgroupUser;
import com.pojo.Interestsgroup;

/**
 * Created by frank_xiang on 2016/7/5.
 */
public interface interestsgroupuserDAO {
    /**
     *
     * @param interestgroupUser
     */
    public void createInterestsGroupUser(InterestgroupUser interestgroupUser);

    public void deleteInterestsGroupUser(int userId,int interestsgroupId);

    public void updateInterestsGroupUser(InterestgroupUser interestgroupUser);

    public InterestgroupUser findInterestsGroupUserByKeys(int userId,int interestsgroupId);
}
