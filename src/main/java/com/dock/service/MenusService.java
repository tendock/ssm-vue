package com.dock.service;

import com.dock.entity.Menus;
import com.dock.entity.Page;

import java.awt.*;
import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/6 10:14
 * @version:1.0
 */
public interface MenusService {
    /**
     * 添加
     */
    void addMenu(Menus menus);
    /**
     * 删除
     */
    void deleteMenu(List menuIdList);
    /**
     * 更新
     */
    void updateMenu(Menus menus);
    /**
     * 分页展示
     */
    Page showMenuPage(Integer pageNo,Integer pageSize);
}
