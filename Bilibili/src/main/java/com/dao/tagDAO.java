package com.dao;

import com.pojo.Tag;

/**
 * Created by frank_xiang on 2016/6/28.
 */
public interface tagDAO {
    public void createTag(Tag tag);
    public void deleteTag(int tagId);
    public void updateTag(Tag tag);
    public Tag findTagById(int tagId);
}
