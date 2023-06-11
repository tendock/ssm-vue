package com.dock.utils;

import com.dock.entity.Category;

import java.util.ArrayList;
import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/8 17:08
 * @version:1.0
 */
public class ListUtils {
    public static List<Category> getCategoryList(List<Category> list){
        ArrayList<Category> categories = new ArrayList<>();
        for(Category category:list){
            if(!category.getIsDelete().equals(0)){
                categories.add(category);
                if(category.getSubCategory().size()>0){
                    getCategoryList(category.getSubCategory());
                }
            }

        }
        return categories;
    }
}
