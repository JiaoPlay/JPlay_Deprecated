package com.dao;

import com.pojo.Post;

/**
 * Created by frank_xiang on 2016/6/28.
 */
public interface postDAO {
    public void createPost(Post post);
    public void deletePost(int postId);
    public void updatePost(Post post);
    public Post findPostById(int postId);
}
