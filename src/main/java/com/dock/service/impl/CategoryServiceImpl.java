package com.dock.service.impl;

import com.dock.entity.Category;
import com.dock.entity.Page;
import com.dock.mapper.CategoryMapper;
import com.dock.service.CategoryService;
import com.dock.utils.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/5 10:41
 * @version:1.0
 */
@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {
    @Resource
    private CategoryMapper categoryMapper;
    @Override
    public void addCategory(Category category) {
        categoryMapper.addCategory(category);
    }

    @Override
    public void deleteCategory(Integer categoryId) {
        categoryMapper.deleteCategory(categoryId);
    }

    @Override
    public void updateCategory(Category category) {
        categoryMapper.updateCategory(category);
    }

    @Override
    public Page showCategoryPage(Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Category> categoryList = categoryMapper.getCategoryList();
        PageInfo<Category> categoryPageInfo = new PageInfo<>(categoryList);
        return PageUtils.getPage(categoryPageInfo);
    }

    @Override
    public List<Category> showCategoryList() {
        return categoryMapper.getCategoryList();
    }
}
