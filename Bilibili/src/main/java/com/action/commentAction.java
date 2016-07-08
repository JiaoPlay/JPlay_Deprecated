package com.action;

import com.opensymphony.xwork2.ActionContext;
import com.pojo.Comment;
import com.util.timeUtil;

import java.util.Map;

/**
 * Created by Admin on 2016/6/27.
 */
public class commentAction extends baseAction {
    protected String commentContent;


    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }
}
