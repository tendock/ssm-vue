package com.dock.utils;

import com.dock.entity.Page;
import com.github.pagehelper.PageInfo;

/**
 * @author:XuJianYuan
 * @date:2023/6/2 19:08
 * @version:1.0
 */
public class PageUtils {
    public static Page getPage(PageInfo pageInfo){
        Page page = new Page();
        page.setPageSize(pageInfo.getPageSize());
        page.setPageNo(pageInfo.getPageNum());
        page.setCount(pageInfo.getTotal());
        page.setData(pageInfo.getList());
        page.setHasNext(pageInfo.isHasNextPage());
        page.setHasPre(pageInfo.isHasPreviousPage());
        page.setPageCount(pageInfo.getPages());
        return page;
    }
}
