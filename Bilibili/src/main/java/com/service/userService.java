package com.service;

import com.pojo.User;

/**
 * Created by Admin on 2016/6/27.
 */
public interface userService {
    public void createUser(User user);
    public void deleteUser(int userId);
    public void updateUser(User user);
    public User findUserById(int userId);
    public User findUserByUsername(String username);
    public boolean validateUser(String username,String password);
    public boolean validateRegister(String username,String password,String email);
    public void sendLetter(String sender,String sendee, String lettercontent);
    public void addInterestsproup(String username,int interestgroupId);
    public void subscribeSeries(String username, String seriesName);
    public void addFavouriteGroup(String username);
    public void addVideoToFavouriteGroup(int videoId,int groupId);
    public void giveUserRole(String username, int roleId);
}
