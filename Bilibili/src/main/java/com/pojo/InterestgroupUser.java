package com.pojo;

/**
 * Created by Admin on 2016/6/27.
 */
public class InterestgroupUser {
    private int userId;
    private int interestGroupId;
    private User userByUserId;
    private Interestsgroup interestsgroupByInterestGroupId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getInterestGroupId() {
        return interestGroupId;
    }

    public void setInterestGroupId(int interestGroupId) {
        this.interestGroupId = interestGroupId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        InterestgroupUser that = (InterestgroupUser) o;

        if (userId != that.userId) return false;
        if (interestGroupId != that.interestGroupId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + interestGroupId;
        return result;
    }

    public User getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(User userByUserId) {
        this.userByUserId = userByUserId;
    }

    public Interestsgroup getInterestsgroupByInterestGroupId() {
        return interestsgroupByInterestGroupId;
    }

    public void setInterestsgroupByInterestGroupId(Interestsgroup interestsgroupByInterestGroupId) {
        this.interestsgroupByInterestGroupId = interestsgroupByInterestGroupId;
    }
}
