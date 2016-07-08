package com.action;

import com.opensymphony.xwork2.ActionContext;
import com.service.userService;

import java.util.Map;

/**
 * Created by frank_xiang on 2016/7/6.
 */
public class seriessubscribeAction extends baseAction{
    private userService userService;
    private String seriesName;

    @Override
    public String execute() throws Exception{
        Map Session = ActionContext.getContext().getSession();
        String username = (String)Session.get("username");
        userService.subscribeSeries(username,seriesName);
        return SUCCESS;
    }

    public com.service.userService getUserService() {
        return userService;
    }

    public void setUserService(com.service.userService userService) {
        this.userService = userService;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }
}
