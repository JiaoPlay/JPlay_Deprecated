package com.pojo;

/**
 * Created by Admin on 2016/6/27.
 */

/**
 * Follow类 表达用户关注用户的关系类（基于JavaBean概念）
 * <p>
 *     Follow私有成员<br>
 *     followerId          关注用户的Id<br>
 *     followeeId          被关注用户的Id<br>
 *     createTime          用户关注动作发生的时间<br>
 *     userByFollowerId    该关注用户Id下的用户<br>
 *     userByFolloweeId    该被关注用户Id下的用户<br>
 * </p>
 */
public class Follow {
    private int followerId;
    private int followeeId;
    private int createdTime;
    private User userByFollowerId;
    private User userByFolloweeId;

    public int getFollowerId() {
        return followerId;
    }

    public void setFollowerId(int followerId) {
        this.followerId = followerId;
    }

    public int getFolloweeId() {
        return followeeId;
    }

    public void setFolloweeId(int followeeId) {
        this.followeeId = followeeId;
    }

    public int getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(int createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Follow follow = (Follow) o;

        if (followerId != follow.followerId) return false;
        if (followeeId != follow.followeeId) return false;
        if (createdTime != follow.createdTime) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = followerId;
        result = 31 * result + followeeId;
        result = 31 * result + createdTime;
        return result;
    }

    public User getUserByFollowerId() {
        return userByFollowerId;
    }

    public void setUserByFollowerId(User userByFollowerId) {
        this.userByFollowerId = userByFollowerId;
    }

    public User getUserByFolloweeId() {
        return userByFolloweeId;
    }

    public void setUserByFolloweeId(User userByFolloweeId) {
        this.userByFolloweeId = userByFolloweeId;
    }
}
