package com.service.serviceImpl;

import com.dao.*;
import com.pojo.*;
import com.service.userService;

import java.util.Map;

/**
 * Created by Admin on 2016/6/27.
 */
public class userServiceImpl implements userService {
    private userDAO userDAO;
    private letterDAO letterDAO;
    private interestsgroupuserDAO interestsgroupuserDAO;
    private subscribeDAO subscribeDAO;
    private favouritegroupDAO favouritegroupDAO;
    private videofavouriteDAO videofavouriteDAO;
    private userroleDAO userroleDAO;
    @Override
    public void createUser(User user) {
        userDAO.createUser(user);
    }

    @Override
    public void deleteUser(int userId) {
        userDAO.deleteUser(userId);
    }

    @Override
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }

    @Override
    public User findUserById(int userId) {
        return userDAO.findUserById(userId);
    }

    @Override
    public User findUserByUsername(String username) {
        return userDAO.findUserByUsername(username);
    }

    @Override
    public boolean validateUser(String username, String password) {
        boolean result = true;
        User user;
        if ((user = findUserByUsername(username)) == null) {
            result = false;
            return result;
        }
        String pwd = new String(user.getPwdhash());
        if (!(pwd.equals(password)))
            result = false;
        return result;
    }

    @Override
    public boolean validateRegister(String username, String password, String email) {
        boolean result = true;
        User user;
        if (!((user = findUserByUsername(username)) == null))
            result = false;
        return result;
    }

    @Override
    public void sendLetter(String sender, String sendee, String lettercontent) {
        Letter letter = new Letter();
        letter.setLetterContent(lettercontent);
        letter.setSenderId(findUserByUsername(sender).getUserId());
        letter.setReveiverId(findUserByUsername(sendee).getUserId());
        letterDAO.createLetter(letter);
    }

    @Override
    public void addInterestsproup(String username, int interestgroupId) {
        int userId = findUserByUsername(username).getUserId();
        InterestgroupUser interestgroupUser = new InterestgroupUser();
        interestgroupUser.setInterestGroupId(interestgroupId);
        interestgroupUser.setUserId(userId);
        interestsgroupuserDAO.createInterestsGroupUser(interestgroupUser);
    }


    @Override
    public void subscribeSeries(String username, String seriesName) {
        int userId = userDAO.findUserByUsername(username).getUserId();
        Subscribe subscribe = new Subscribe();
        subscribe.setUserId(userId);
        subscribe.setSeriesName(seriesName);
        subscribeDAO.createSubscribe(subscribe);
    }

    @Override
    public void addFavouriteGroup(String username) {
        int userId = userDAO.findUserByUsername(username).getUserId();
        FavoriteGroup favoriteGroup = new FavoriteGroup();
        favoriteGroup.setUserId(userId);
        favouritegroupDAO.createFavouriteGroup(favoriteGroup);
    }

    @Override
    public void addVideoToFavouriteGroup(int videoId, int groupId) {
        VideoFavorite videoFavorite = new VideoFavorite();
        videoFavorite.setVideoId(videoId);
        videoFavorite.setGroupId(groupId);
        videofavouriteDAO.createVideoFavourite(videoFavorite);
    }

    @Override
    public void giveUserRole(String username, int roleId) {
        int userId = userDAO.findUserByUsername(username).getUserId();
        UserRole userRole = new UserRole();
        userRole.setUserId(userId);
        userRole.setRoleId(roleId);
        userroleDAO.createUserRole(userRole);
    }

    public void setLetterDAO(com.dao.letterDAO letterDAO) {
        this.letterDAO = letterDAO;
    }

    public void setInterestsgroupuserDAO(com.dao.interestsgroupuserDAO interestsgroupuserDAO) {
        this.interestsgroupuserDAO = interestsgroupuserDAO;
    }

    public void setUserDAO(userDAO userDAO) {
        this.userDAO = userDAO;
    }

    public userDAO getUserDAO() {
        return userDAO;
    }

    public com.dao.subscribeDAO getSubscribeDAO() {
        return subscribeDAO;
    }

    public void setSubscribeDAO(com.dao.subscribeDAO subscribeDAO) {
        this.subscribeDAO = subscribeDAO;
    }

    public void setFavouritegroupDAO(com.dao.favouritegroupDAO favouritegroupDAO) {
        this.favouritegroupDAO = favouritegroupDAO;
    }

    public void setVideofavouriteDAO(com.dao.videofavouriteDAO videofavouriteDAO) {
        this.videofavouriteDAO = videofavouriteDAO;
    }

    public com.dao.userroleDAO getUserroleDAO() {
        return userroleDAO;
    }

    public void setUserroleDAO(com.dao.userroleDAO userroleDAO) {
        this.userroleDAO = userroleDAO;
    }
}
