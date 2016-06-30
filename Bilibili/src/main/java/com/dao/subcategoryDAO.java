package com.dao;

import com.pojo.Subcategory;

/**
 * Created by frank_xiang on 2016/6/28.
 */
public interface subcategoryDAO {
    public void createSubcategory(Subcategory subcategory);
    public void deleteSubcategory(String subcategoryName);
    public void updateSubcategory(Subcategory subcategory);
    public Subcategory findSubcategoryByName(String subcategoryName);
}
