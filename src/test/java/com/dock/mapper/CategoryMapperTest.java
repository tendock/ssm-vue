package com.dock.mapper;

import com.BaseTest;
import com.dock.entity.Category;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * @author:XuJianYuan
 * @date:2023/6/5 10:03
 * @version:1.0
 */
public class CategoryMapperTest extends BaseTest {
    @Resource
    private CategoryMapper categoryMapper;

    @Test
    public void getCategory() {
    }

    @Test
    public void getCategoryList() {
        categoryMapper.getCategoryList().forEach(System.out::println);
    }
    @Test
    public void addCategory(){
        Category category = new Category();
        category.setCategoryName("摩托");
        category.setLevel(1);
        category.setParentId(0);
        category.setCreateTime(new Date());
        category.setIsDelete(1);
        categoryMapper.addCategory(category);
    }
    /**
     * 删除分类
     */
    @Test
    public void deleteCategory(){
        categoryMapper.deleteCategory(11);
    }

    /**
     * 更新
     */
    @Test
    public void updateCategory(){
        Category category = new Category();
        category.setCategoryName("摩托");
        category.setCreateTime(new Date());
        category.setCategoryId(10);
        categoryMapper.updateCategory(category);
    }
}
