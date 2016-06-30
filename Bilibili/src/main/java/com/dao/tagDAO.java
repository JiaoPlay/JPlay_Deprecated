package com.dao;

import com.pojo.Tag;

/**
 * Created by frank_xiang on 2016/6/28.
 */

/**
 * tagDAO接口 提供了对tag进行增删改查功能的接口，将在daoImpl包中进行具体的实现。
 */
public interface tagDAO {
    public void createTag(Tag tag);
    public void deleteTag(int tagId);
    public void updateTag(Tag tag);
    public Tag findTagById(int tagId);
}
