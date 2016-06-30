package com.dao;

import com.pojo.Comment;

/**
 * Created by frank_xiang on 2016/6/28.
 */

/**
 * commentDAO接口 提供了对comment进行增删改查功能的接口，将在daoImpl包中进行具体的实现。
 */
public interface commentDAO {
    public void createComment(Comment comment);
    public void deleteComment(int commentId);
    public void updateComment(Comment comment);
    public Comment findCommentById(int commentId);
}
