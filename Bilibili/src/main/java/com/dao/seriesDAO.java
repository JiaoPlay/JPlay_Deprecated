package com.dao;

import com.pojo.Series;

/**
 * Created by frank_xiang on 2016/6/28.
 */

/**
 * seriesDAO接口 提供了对series进行增删改查功能的接口，将在daoImpl包中进行具体的实现。
 */
public interface seriesDAO {
    public void createSeries(Series series);
    public void deleteSeries(String seriesName);
    public void updateSeries(Series series);
    public Series findSeriesByName(String seriesName);
}
