package com.pojo;

import java.io.Serializable;

/**
 * Created by Admin on 2016/6/27.
 */
public class SubscribePK implements Serializable {
    private int userId;
    private String seriesName;

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

        SubscribePK that = (SubscribePK) o;

        if (userId != that.userId) return false;
        if (seriesName != that.seriesName) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + seriesName.hashCode();
        return result;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }
}
