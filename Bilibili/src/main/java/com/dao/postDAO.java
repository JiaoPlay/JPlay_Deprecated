package com.dao;

import com.pojo.Post;

/**
 * Created by frank_xiang on 2016/6/28.
 */

/**
 * postDAO接口 提供了对post进行增删改查功能的接口，将在daoImpl包中进行具体的实现。
 */
public interface postDAO {
    public void createPost(Post post);
    public void deletePost(int postId);
    public void updatePost(Post post);
    public Post findPostById(int postId);
}
