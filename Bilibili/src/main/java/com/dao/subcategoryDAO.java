package com.dao;

import com.pojo.Subcategory;

/**
 * Created by frank_xiang on 2016/6/28.
 */

/**
 * subcategoryDAO接口 提供了对subcategory进行增删改查功能的接口，将在daoImpl包中进行具体的实现。
 */
public interface subcategoryDAO {
    public void createSubcategory(Subcategory subcategory);
    public void deleteSubcategory(String subcategoryName);
    public void updateSubcategory(Subcategory subcategory);
    public Subcategory findSubcategoryByName(String subcategoryName);
}
