package com.dao;

import com.pojo.Category;

/**
 * Created by frank_xiang on 2016/6/28.
 */

/**
 * categoryDAO接口 提供了对category进行增删改查功能的接口，将在daoImpl包中进行具体的实现。
 */
public interface categoryDAO {
    public void createCategory(Category category);
    public void deleteCategory(String categoryName);
    public void updateCategory(Category category);
    public Category findCategoryByName(String categoryName);
}
