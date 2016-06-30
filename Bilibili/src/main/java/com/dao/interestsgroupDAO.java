package com.dao;

import com.pojo.Interestsgroup;

/**
 * Created by frank_xiang on 2016/6/28.
 */
public interface interestsgroupDAO {
    public void createInterestsgroup(Interestsgroup interestsgroup);
    public void deleteInterestsgroup(int interestsgroupId);
    public void updateInterestsgroup(Interestsgroup interestsgroup);
    public Interestsgroup findInterestsgroupById(int interestsgroupId);

}
