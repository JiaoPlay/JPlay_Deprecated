package com.dao;

import com.pojo.UserReply;

/**
 * Created by frank_xiang on 2016/7/6.
 */
public interface userreplyDAO {
    public void createUserReply(UserReply userReply);
    public void deleteUserReply(int userId, int replyId);
}
