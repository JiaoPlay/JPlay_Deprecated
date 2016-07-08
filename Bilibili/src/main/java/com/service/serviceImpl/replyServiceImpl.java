package com.service.serviceImpl;

import com.dao.commentreplyDAO;
import com.dao.replyDAO;
import com.dao.userDAO;
import com.dao.userreplyDAO;
import com.pojo.CommentReply;
import com.pojo.Reply;
import com.pojo.UserComment;
import com.pojo.UserReply;
import com.service.replyService;

/**
 * Created by frank_xiang on 2016/7/6.
 */
public class replyServiceImpl implements replyService {
    private replyDAO replyDAO;
    private commentreplyDAO commentreplyDAO;
    private userreplyDAO userreplyDAO;
    private userDAO userDAO;

    @Override
    public void createReply(Reply reply) {
        replyDAO.createReply(reply);
    }

    @Override
    public void deleteReply(int replyId) {
        replyDAO.deleteReply(replyId);
    }

    @Override
    public void updateReply(Reply reply) {
        replyDAO.updateReply(reply);
    }

    @Override
    public Reply findReplyById(int replyId) {
        return replyDAO.findReplyById(replyId);
    }

    @Override
    public int findMaxReplyId() {
        return replyDAO.findMaxReplyId();
    }

    @Override
    public void MakeReplyOnComment(int commentId, String username, Reply reply) {
        int userId = userDAO.findUserByUsername(username).getUserId();
        createReply(reply);
        CommentReply commentReply = new CommentReply();
        commentReply.setCommentId(commentId);
        commentReply.setReplyId(reply.getReplyId());
        commentreplyDAO.createCommentReply(commentReply);
        UserReply userReply = new UserReply();
        userReply.setUserId(userId);
        userReply.setReplyId(reply.getReplyId());
        userReply.setIsThumb(new Byte("0"));
        userreplyDAO.createUserReply(userReply);
    }

    public com.dao.replyDAO getReplyDAO() {
        return replyDAO;
    }

    public void setReplyDAO(com.dao.replyDAO replyDAO) {
        this.replyDAO = replyDAO;
    }

    public com.dao.commentreplyDAO getCommentreplyDAO() {
        return commentreplyDAO;
    }

    public void setCommentreplyDAO(com.dao.commentreplyDAO commentreplyDAO) {
        this.commentreplyDAO = commentreplyDAO;
    }

    public com.dao.userreplyDAO getUserreplyDAO() {
        return userreplyDAO;
    }

    public void setUserreplyDAO(com.dao.userreplyDAO userreplyDAO) {
        this.userreplyDAO = userreplyDAO;
    }

    public void setUserDAO(com.dao.userDAO userDAO) {
        this.userDAO = userDAO;
    }
}
