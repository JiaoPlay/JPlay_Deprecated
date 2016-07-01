package com.pojo;

import java.util.Collection;

/**
 * Created by Admin on 2016/6/27.
 */

/**
 * Interestsgroup类 表达用户在社区中的兴趣小组的实体类（基于JavaBean概念）
 * <p>
 *     Interestsgroup私有成员<br>
 *     interestsGroupId     兴趣小组的ID，用于查找功能<br>
 *     interstGroupName     兴趣小组的名称，描述兴趣小组的基本属性<br>
 * </p>
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
