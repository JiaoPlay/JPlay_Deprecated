package com.pojo;

/**
 * Created by Admin on 2016/6/27.
 */
public class Subscribe {
    private int userId;
    private User userByUserId;
    private Series seriesBySeriesName;
    private String seriesName;

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public Series getSeriesBySeriesName() {
        return seriesBySeriesName;
    }

    public void setSeriesBySeriesName(Series seriesBySeriesName) {
        this.seriesBySeriesName = seriesBySeriesName;
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

        Subscribe subscribe = (Subscribe) o;

        if (userId != subscribe.userId) return false;
        if (seriesName != subscribe.seriesName) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + seriesName.hashCode();
        return result;
    }

    public User getUserByUserId() {
        return userByUserId;
    }

    public void setUserByUserId(User userByUserId) {
        this.userByUserId = userByUserId;
    }


}
