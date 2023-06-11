package com.dock.service.impl;

import com.dock.entity.Menus;
import com.dock.entity.Page;
import com.dock.mapper.MenusMapper;
import com.dock.service.MenusService;
import com.dock.utils.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/6 10:22
 * @version:1.0
 */
@Transactional
@Service
public class MenusServiceImpl implements MenusService {
    @Resource
    private MenusMapper menusMapper;
    @Override
    public void addMenu(Menus menus) {
        menusMapper.addMenus(menus);
    }

    @Override
    public void deleteMenu(List menuIdList) {
        menusMapper.deleteMenus(menuIdList);
    }

    @Override
    public void updateMenu(Menus menus) {
        if(menus.getMenuUrl()==null){
            menus.setMenuUrl("");
        }
        menusMapper.updateMenus(menus);
    }

    @Override
    public Page showMenuPage(Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Menus> menuList = menusMapper.getMenuList();
        PageInfo<Menus> menusPageInfo = new PageInfo<>(menuList);
        return PageUtils.getPage(menusPageInfo);
    }
}
