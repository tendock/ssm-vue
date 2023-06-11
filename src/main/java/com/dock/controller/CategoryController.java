package com.dock.controller;

import com.dock.entity.Category;
import com.dock.entity.Result;
import com.dock.service.CategoryService;
import com.dock.utils.ListUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/5 10:44
 * @version:1.0
 */
@CrossOrigin
@Controller
@ResponseBody
public class CategoryController {
    @Resource
    private CategoryService categoryService;
    @RequestMapping(value = "categoryList")
    public Result categoryList(Integer pageNo,Integer pageSize){
        Result result = new Result();
        result.setData(categoryService.showCategoryPage(pageNo,pageSize));
        return result;
    }
    @RequestMapping(value = "categoryAdd")
    public Result categoryAdd(@RequestBody Category category){
        System.out.println(category);
        categoryService.addCategory(category);
        return new Result();
    }
    @RequestMapping(value = "categoryDelete")
    public Result categoryDelete(Integer categoryId){
        categoryService.deleteCategory(categoryId);
        return new Result();
    }
    @RequestMapping(value = "categoryUpdate")
    public Result categoryUpdate(@RequestBody Category category){
        categoryService.updateCategory(category);
        return new Result();
    }
    @RequestMapping(value = "categoryAll")
    public Result categoryAll(){
//        return new Result(ListUtils.getCategoryList(categoryService.showCategoryList()));
        return new Result(categoryService.showCategoryList());
    }
}
