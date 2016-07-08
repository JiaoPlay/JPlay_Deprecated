package com.action;

import com.opensymphony.xwork2.ActionContext;
import com.pojo.Interestsgroup;
import com.service.userService;

import java.util.Map;

/**
 * Created by Admin on 2016/6/27.
 */
public class interestGroupAction extends baseAction {
    private int interestGroupId;
    private userService userService;

    public String execute(){
        Map Session = ActionContext.getContext().getSession();
        String username = (String)Session.get("username");
        userService.addInterestsproup(username,interestGroupId);
        return SUCCESS;
    }

    public void setInterestGroupId(int interestGroupId) {
        this.interestGroupId = interestGroupId;
    }

    public int getInterestGroupId(){
        return interestGroupId;
    }

    public void setUserService(userService userService) {
        this.userService = userService;
    }

    public userService getUserService(){return userService;}
}
