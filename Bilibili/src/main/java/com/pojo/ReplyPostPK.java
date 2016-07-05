package com.pojo;

import java.io.Serializable;

/**
 * Created by Admin on 2016/6/27.
 */
public class ReplyPostPK implements Serializable {
    private int postId;
    private int userId;

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReplyPostPK that = (ReplyPostPK) o;

        if (postId != that.postId) return false;
        if (userId != that.userId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = postId;
        result = 31 * result + userId;
        return result;
    }
}
