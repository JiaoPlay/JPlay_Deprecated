package com.dao;

import com.pojo.Category;

/**
 * Created by frank_xiang on 2016/6/28.
 */
public interface categoryDAO {
    public void createCategory(Category category);
    public void deleteCategory(String categoryName);
    public void updateCategory(Category category);
    public Category findCategoryByName(String categoryName);
}
