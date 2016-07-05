package com.action;

import com.opensymphony.xwork2.ActionContext;
import com.pojo.User;
import com.service.userService;
import java.util.Map;

/**
 * Created by frank_xiang on 2016/7/4.
 */
public class secretletteraction extends baseAction {
    private userService userService;
    private String slettercontent;
    private String sendee;

    public String execute(){
        Map Session = ActionContext.getContext().getSession();
        if(!Session.containsKey("username"))
            return ERROR;
        String sender = (String)Session.get("username");
        userService.sendletter(sender,sendee,slettercontent);
        return SUCCESS;
    }

    public String getSlettercontent() {
        return slettercontent;
    }

    public void setSlettercontent(String slettercontent) {
        this.slettercontent = slettercontent;
    }
}
