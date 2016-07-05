package com.pojo;

/**
 * Created by Admin on 2016/6/27.
 */
public class Subscribe {
    private int userId;
    private int videoId;
    private User userByUserId;
    private Video videoByVideoId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Subscribe subscribe = (Subscribe) o;

        if (userId != subscribe.userId) return false;
        if (videoId != subscribe.videoId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + videoId;
        return result;
    }

    public User getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(User userByUserId) {
        this.userByUserId = userByUserId;
    }

    public Video getVideoByVideoId() {
        return videoByVideoId;
    }

    public void setVideoByVideoId(Video videoByVideoId) {
        this.videoByVideoId = videoByVideoId;
    }
}
