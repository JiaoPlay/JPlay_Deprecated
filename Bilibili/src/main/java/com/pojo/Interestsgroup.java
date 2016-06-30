package com.pojo;

import java.util.Collection;

/**
 * Created by Admin on 2016/6/27.
 */
public class Interestsgroup {
    private int interestGroupId;
    private String interstGroupName;
    private Collection<GroupPost> groupPostsByInterestGroupId;
    private Collection<InterestgroupUser> interestgroupUsersByInterestGroupId;

    public int getInterestGroupId() {
        return interestGroupId;
    }

    public void setInterestGroupId(int interestGroupId) {
        this.interestGroupId = interestGroupId;
    }

    public String getInterstGroupName() {
        return interstGroupName;
    }

    public void setInterstGroupName(String interstGroupName) {
        this.interstGroupName = interstGroupName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Interestsgroup that = (Interestsgroup) o;

        if (interestGroupId != that.interestGroupId) return false;
        if (interstGroupName != null ? !interstGroupName.equals(that.interstGroupName) : that.interstGroupName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = interestGroupId;
        result = 31 * result + (interstGroupName != null ? interstGroupName.hashCode() : 0);
        return result;
    }

    public Collection<GroupPost> getGroupPostsByInterestGroupId() {
        return groupPostsByInterestGroupId;
    }

    public void setGroupPostsByInterestGroupId(Collection<GroupPost> groupPostsByInterestGroupId) {
        this.groupPostsByInterestGroupId = groupPostsByInterestGroupId;
    }

    public Collection<InterestgroupUser> getInterestgroupUsersByInterestGroupId() {
        return interestgroupUsersByInterestGroupId;
    }

    public void setInterestgroupUsersByInterestGroupId(Collection<InterestgroupUser> interestgroupUsersByInterestGroupId) {
        this.interestgroupUsersByInterestGroupId = interestgroupUsersByInterestGroupId;
    }
}
