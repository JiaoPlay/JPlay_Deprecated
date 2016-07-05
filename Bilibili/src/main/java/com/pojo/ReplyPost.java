package com.pojo;

/**
 * Created by Admin on 2016/6/27.
 */
public class ReplyPost {
    private int postId;
    private int userId;
    private String reason;
    private User userByUserId;
    private Post postByPostId;

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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ReplyPost replyPost = (ReplyPost) o;

        if (postId != replyPost.postId) return false;
        if (userId != replyPost.userId) return false;
        if (reason != null ? !reason.equals(replyPost.reason) : replyPost.reason != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = postId;
        result = 31 * result + userId;
        result = 31 * result + (reason != null ? reason.hashCode() : 0);
        return result;
    }

    public User getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(User userByUserId) {
        this.userByUserId = userByUserId;
    }

    public Post getPostByPostId() {
        return postByPostId;
    }

    public void setPostByPostId(Post postByPostId) {
        this.postByPostId = postByPostId;
    }
}
