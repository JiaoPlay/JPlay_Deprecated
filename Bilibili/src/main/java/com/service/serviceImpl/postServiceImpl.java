package com.service.serviceImpl;

import com.dao.grouppostDAO;
import com.dao.postDAO;
import com.dao.userDAO;
import com.dao.userpostDAO;
import com.pojo.GroupPost;
import com.pojo.Post;
import com.pojo.UserPost;
import com.service.postService;

/**
 * Created by frank_xiang on 2016/7/6.
 */
public class postServiceImpl implements postService {
    private postDAO postDAO;
    private userDAO userDAO;
    private grouppostDAO grouppostDAO;
    private userpostDAO userpostDAO;
    @Override
    public void createPost(Post post) {
        postDAO.createPost(post);
    }

    @Override
    public void deletePost(int postId) {
        postDAO.deletePost(postId);
    }

    @Override
    public void updatePost(Post post) {
        postDAO.updatePost(post);
    }

    @Override
    public Post findPostById(int postId) {
        return postDAO.findPostById(postId);
    }

    @Override
    public void postPublish(String username, int groupId, Post post) {
        int userId = userDAO.findUserByUsername(username).getUserId();
        createPost(post);
        GroupPost groupPost = new GroupPost();
        groupPost.setInterestGroupId(groupId);
        groupPost.setPostId(post.getPostId());
        grouppostDAO.createGroupPost(groupPost);
        UserPost userPost = new UserPost();
        userPost.setUserId(userId);
        userPost.setPostId(post.getPostId());
        userPost.setIsThumb(new Byte("0"));
        userpostDAO.createUserPost(userPost);
    }

    public com.dao.postDAO getPostDAO() {
        return postDAO;
    }

    public void setPostDAO(com.dao.postDAO postDAO) {
        this.postDAO = postDAO;
    }

    public com.dao.userDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(com.dao.userDAO userDAO) {
        this.userDAO = userDAO;
    }

    public com.dao.grouppostDAO getGrouppostDAO() {
        return grouppostDAO;
    }

    public void setGrouppostDAO(com.dao.grouppostDAO grouppostDAO) {
        this.grouppostDAO = grouppostDAO;
    }

    public com.dao.userpostDAO getUserpostDAO() {
        return userpostDAO;
    }

    public void setUserpostDAO(com.dao.userpostDAO userpostDAO) {
        this.userpostDAO = userpostDAO;
    }
}
