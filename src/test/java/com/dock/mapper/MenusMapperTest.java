package com.dock.mapper;

import com.BaseTest;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @author:XuJianYuan
 * @date:2023/6/6 10:12
 * @version:1.0
 */
public class MenusMapperTest extends BaseTest {
    @Resource
    private MenusMapper menusMapper;
    @Test
    public void addMenus() {
    }

    @Test
    public void deleteMenus() {
    }

    @Test
    public void updateMenus() {
    }

    @Test
    public void getMenuList() {
        menusMapper.getMenuList().forEach(System.out::println);
    }

    @Test
    public void getSubMenusList() {
    }
}
