package com.dao;

import com.pojo.Reply;

/**
 * Created by frank_xiang on 2016/6/28.
 */

/**
 * replyDAO接口 提供了对reply进行增删改查功能的接口，将在daoImpl包中进行具体的实现。
 */
public interface replyDAO {
    public void createReply(Reply reply);
    public void deleteReply(int replyId);
    public void updateReply(Reply reply);
    public Reply findReplyById(int replyId);
}
