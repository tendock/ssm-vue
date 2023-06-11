package com.dock.mapper;

import com.dock.entity.Category;

import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/5 9:46
 * @version:1.0
 */
public interface CategoryMapper {
    /**
     * 根据id查询子级分类
     */
    List<Category> getCategory(Integer categoryId);
    /**
     * 查询所有类别
     */
    List<Category> getCategoryList();
    /**
     * 添加分类
     */
    void addCategory(Category category);
    /**
     * 删除分类
     */
    void deleteCategory(Integer categoryId);
    /**
     * 更新
     */
    void updateCategory(Category category);
    /**
     * 根据id查询分类
     */
    Category getCategoryById(Integer categoryId);
}
