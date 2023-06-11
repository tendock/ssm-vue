package com.dock.service;

import com.dock.entity.Category;
import com.dock.entity.Page;

import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/5 10:36
 * @version:1.0
 */
public interface CategoryService {
    /**
     * 添加
     */
    void addCategory(Category category);
    /**
     * 删除
     */
    void deleteCategory(Integer categoryId);
    /**
     * 更新
     */
    void updateCategory(Category category);
    /**
     * 展示列表
     */
    Page showCategoryPage(Integer pageNo,Integer pageSize);
    /**
     * 展示列表
     */
    List<Category> showCategoryList();
}
