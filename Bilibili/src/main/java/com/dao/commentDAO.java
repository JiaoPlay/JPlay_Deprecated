package com.dao;

import com.pojo.Comment;

/**
 * Created by frank_xiang on 2016/6/28.
 */
public interface commentDAO {
    public void createComment(Comment comment);
    public void deleteComment(int commentId);
    public void updateComment(Comment comment);
    public Comment findCommentById(int commentId);
}
