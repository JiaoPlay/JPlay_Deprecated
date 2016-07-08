package com.service.serviceImpl;

import com.dao.commentDAO;
import com.dao.usercommentDAO;
import com.dao.videocommentDAO;
import com.dao.userDAO;
import com.pojo.Comment;
import com.pojo.UserComment;
import com.pojo.VideoComment;
import com.service.commentService;

/**
 * Created by frank_xiang on 2016/7/5.
 */
public class commentServiceImpl implements commentService {
    private commentDAO commentDAO;
    private usercommentDAO usercommentDAO;
    private videocommentDAO videocommentDAO;
    private userDAO userDAO;

    @Override
    public void createComment(Comment comment) {
        commentDAO.createComment(comment);
    }

    @Override
    public void deleteComment(int commentId) {
        commentDAO.deleteComment(commentId);
    }

    @Override
    public void updateComment(Comment comment) {
        commentDAO.updateComment(comment);
    }

    @Override
    public Comment findCommentById(int commentId) {
        return commentDAO.findCommentById(commentId);
    }

    @Override
    public int getAllCommentCount() {
        return commentDAO.getAllCommentCount();
    }

    @Override
    public int findMaxCommentId() {
        return commentDAO.findMaxCommentId();
    }

    @Override
    public void MakeCommentOnVideo(int videoId, String username, Comment comment) {
        int userId = userDAO.findUserByUsername(username).getUserId();
        createComment(comment);
        UserComment userComment = new UserComment();
        userComment.setCommentId(comment.getCommentId());
        userComment.setUserId(userId);
        userComment.setIsThumb(new Byte("0"));
        usercommentDAO.createUserComment(userComment);
        VideoComment videoComment = new VideoComment();
        videoComment.setCommentId(comment.getCommentId());
        videoComment.setVideoId(videoId);
        videocommentDAO.createVideoComment(videoComment);
    }

    public com.dao.commentDAO getCommentDAO() {
        return commentDAO;
    }

    public void setCommentDAO(commentDAO commentDAO) {
        this.commentDAO = commentDAO;
    }

    public com.dao.usercommentDAO getUsercommentDAO() {
        return usercommentDAO;
    }

    public void setUsercommentDAO(usercommentDAO usercommentDAO) {
        this.usercommentDAO = usercommentDAO;
    }

    public com.dao.videocommentDAO getVideocommentDAO() {
        return videocommentDAO;
    }

    public void setVideocommentDAO(videocommentDAO videocommentDAO) {
        this.videocommentDAO = videocommentDAO;
    }

    public void setUserDAO(com.dao.userDAO userDAO) {
        this.userDAO = userDAO;
    }
}
