package com.dao;

import com.pojo.Reply;

/**
 * Created by frank_xiang on 2016/6/28.
 */
public interface replyDAO {
    public void createReply(Reply reply);
    public void deleteReply(int replyId);
    public void updateReply(Reply reply);
    public Reply findReplyById(int replyId);
}
