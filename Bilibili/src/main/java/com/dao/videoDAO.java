package com.dao;


import com.pojo.Video;

/**
 * Created by frank_xiang on 2016/6/28.
 */
public interface videoDAO {
    public void createVideo(Video video);
    public void deleteVideo(int videoId);
    public void updateVideo(Video video);
    public Video findVideoById(int videoId);
}
