package com.action;

/**
 * Created by Admin on 2016/6/27.
 */
public class logInOutAction extends baseAction {
//    private static final long serialVersionUID = 1L;
//    private UserService userService;
//    private String username;
//    private String password;
//
//    public UserService getUserService() {
//        return userService;
//    }
//
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String execute(){
//        if (username.equals("") || password.equals("")) {
//            return ERROR;
//        }
//        String ret = userService.validateUser(username, password);
//        if (ret == null) {
//            return ERROR;
//        }
//        Map session = ActionContext.getContext().getSession();
//        session.put("username", username);
//        if (ret.equals("N")){
//            return "user";
//        } else {
//            return "admin";
//        }
//    }
}
