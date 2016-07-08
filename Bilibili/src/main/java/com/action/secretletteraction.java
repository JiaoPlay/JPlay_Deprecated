package com.action;

import com.opensymphony.xwork2.ActionContext;
import com.pojo.User;
import com.service.userService;
import java.util.Map;

/**
 * Created by frank_xiang on 2016/7/4.
 */
public class secretletterAction extends baseAction {
    private userService userService;
    private String slettercontent;
    private String sendee;

    public String execute(){
        Map Session = ActionContext.getContext().getSession();
        String sender = (String)Session.get("username");
        userService.sendLetter(sender,sendee,slettercontent);
        return SUCCESS;
    }

    public String getSlettercontent() {
        return slettercontent;
    }

    public void setSlettercontent(String slettercontent) {
        this.slettercontent = slettercontent;
    }

    public String getSendee(){
        return sendee;
    }
    public void setSendee(String sendee) {
        this.sendee = sendee;
    }

    public void setUserService(userService userService) {
        this.userService = userService;
    }

    public userService getUserService(){
        return userService;
    }
}
