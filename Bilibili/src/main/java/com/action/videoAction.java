package com.action;


import com.opensymphony.xwork2.ActionContext;
import com.pojo.Video;
import com.service.videoService;
import com.util.timeUtil;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.io.File;

import static org.apache.struts2.ServletActionContext.getServletContext;

/**
 * Created by Admin on 2016/6/27.
 */
public class videoAction extends baseAction {
    private videoService videoService;
    private String title;
    private String content;
    private String message;

    @Override
    public String execute() throws Exception  {
        System.out.println("Start uploading...");
        try {
            java.util.Map<String,Object> Session = ActionContext.getContext().getSession();
            if(!Session.containsKey("videoName")) {
                message = "100";
                return ERROR;
            }
            Video video = new Video();
            video.setTitle(title);
            video.setContent(content);
            //转码成功与否的标记
            boolean flag = false;

            //获得保存文件的路径
            ServletContext sctx = getServletContext();
            //获得文件名
            String basePath = getServletContext().getRealPath("videos");
            //待转码的文件
            String serialName = String.valueOf(System.currentTimeMillis());
            //设置转换为flv格式后文件的保存路径
            String codcFilePath = basePath + "\\" + serialName + ".flv";
            //设置上传视频截图的保存路径
            String mediaPicPath = basePath + "\\images" + File.separator + serialName + ".jpg";


            // 获取配置的转换工具（ffmpeg.exe）的存放路径
            String ffmpegPath = getServletContext().getRealPath("/tools/ffmpeg.exe");

            //设置video初始属性
            video.setVideoId(Integer.parseInt(String.valueOf(videoService.getAllVideoCount())));
            video.setLink("videos/"+serialName + ".flv");
            video.setIsPass(new Byte("0"));
            video.setTopic("unknown");
            video.setCreateTime(timeUtil.GetCurrentTime());
            video.setLastUpdate(timeUtil.GetCurrentTime());
            //video.setPicture("videos/images/" + serialName + ".jpg");

            //转码
            flag = videoService.executeCodecs(ffmpegPath,(String)Session.get("videoName") , codcFilePath, mediaPicPath);

            if (flag) {
                //转码成功,向数据表中添加该视频信息
                videoService.createVideo(video);
                Session.remove("videoName");
                message = "上传成功!";
                return SUCCESS;
            }
            message = "上传失败";
            return ERROR;
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServletException(e);
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setVideoService(com.service.videoService videoService) {
        this.videoService = videoService;
    }
}
