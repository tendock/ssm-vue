package com.dock.mapper;

import com.dock.entity.Menus;

import java.awt.*;
import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/6 9:57
 * @version:1.0
 */
public interface MenusMapper {
    /**
     * 添加
     */
    void addMenus(Menus menus);
    /**
     * 删除
     */
    void deleteMenus(List menusIdList);
    /**
     * 更新
     */
    void updateMenus(Menus menus);
    /**
     * 查询所有
     */
    List<Menus> getMenuList();
    /**
     * 查询子菜单
     */
    List<Menus> getSubMenusList(Integer menuId);

}
