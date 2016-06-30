package com.dao;

import com.pojo.Series;

/**
 * Created by frank_xiang on 2016/6/28.
 */
public interface seriesDAO {
    public void createSeries(Series series);
    public void deleteSeries(String seriesName);
    public void updateSeries(Series series);
    public Series findSeriesByName(String seriesName);
}
