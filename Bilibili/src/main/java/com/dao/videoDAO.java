package com.dao;


import com.pojo.Video;

/**
 * Created by frank_xiang on 2016/6/28.
 */

/**
 * videoDAO接口 提供了对video进行增删改查功能的接口，将在daoImpl包中进行具体的实现。
 */
public interface videoDAO {
    public void createVideo(Video video);
    public void deleteVideo(int videoId);
    public void updateVideo(Video video);
    public Video findVideoById(int videoId);
}
