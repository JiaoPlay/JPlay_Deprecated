package com.action;

import com.opensymphony.xwork2.ActionContext;
import com.service.userService;

import java.util.Map;

/**
 * Created by Admin on 2016/6/27.
 */
public class logInOutAction extends baseAction {
    private static final long serialVersionUID = 1L;
    private userService userService;
    private int userId;
    private byte[] pwdhash;

    public userService getUserService() {
        return userService;
    }

    public void setUserService(userService userService) {
        this.userService = userService;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public byte[] getPwdhash() {
        return pwdhash;
    }

    public void setPwdhash(byte[] pwdhash) {
        this.pwdhash = pwdhash;
    }

    public String logIn() throws Exception {
        /* Judge whether username or password is empty in the frontend */
        String ret = userService.validateUser(userId, pwdhash);
        if (ret == null) {
            return ERROR;
        }
        Map session = ActionContext.getContext().getSession();
        session.put("userId", userId);
        if (ret.equals("N")){
            return "user";
        } else {
            return "admin";
        }
    }

    public String logOut() throws Exception {
        Map<String, Object> session = ActionContext.getContext().getSession();
        session.clear();
        return SUCCESS;
    }
}
