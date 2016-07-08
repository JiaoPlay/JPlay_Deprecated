package com.action;

import com.service.commentService;
import com.opensymphony.xwork2.ActionContext;
import com.pojo.Comment;
import com.util.timeUtil;

import java.util.Map;

/**
 * Created by Admin on 2016/6/27.
 */
public class videoCommentAction extends commentAction {
    private commentService commentService;
    private int videoId;
    protected String commentContent;

    public String execute(){
        Map Session = ActionContext.getContext().getSession();
        String username = (String)Session.get("username");
        Comment comment = new Comment();
        comment.setCommentId(commentService.findMaxCommentId()+1);
        comment.setContent(commentContent);
        comment.setThumbCount(0);
        comment.setCreateTime(timeUtil.GetCurrentDatetime());
        commentService.MakeCommentOnVideo(videoId,username,comment);
        return SUCCESS;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

    public com.service.commentService getCommentService() {
        return commentService;
    }

    public void setCommentService(com.service.commentService commentService) {
        this.commentService = commentService;
    }
}
