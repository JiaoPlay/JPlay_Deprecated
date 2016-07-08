package com.action;

import com.opensymphony.xwork2.ActionContext;
import com.pojo.Video;
import com.service.videoService;

import java.util.List;
import java.util.Map;

/**
 * Created by Admin on 2016/6/27.
 */
public class userAction extends baseAction {
    private videoService videoService;
    private List<Video> videoBeanList;

    @Override
    public String execute() throws Exception{
        Map Session = ActionContext.getContext().getSession();
        String username = (String)Session.get("username");
        videoBeanList = videoService.showVideoByUper(username);
        return SUCCESS;
    }

    public com.service.videoService getVideoService() {
        return videoService;
    }

    public void setVideoService(com.service.videoService videoService) {
        this.videoService = videoService;
    }

    public List<Video> getVideoBeanList() {
        return videoBeanList;
    }

    public void setVideoBeanList(List<Video> videoBeanList) {
        this.videoBeanList = videoBeanList;
    }
}
