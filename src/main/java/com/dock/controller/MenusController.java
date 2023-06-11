package com.dock.controller;

import com.dock.entity.Menus;
import com.dock.entity.Result;
import com.dock.service.MenusService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/6 10:27
 * @version:1.0
 */
@Controller
@CrossOrigin
@ResponseBody
public class MenusController {
    @Resource
    private MenusService menusService;
    @RequestMapping(value = "menuList")
    public Result menuList(Integer pageNo,Integer pageSize){
        return new Result(menusService.showMenuPage(pageNo,pageSize));
    }
    @RequestMapping(value = "menuAdd")
    public Result menuAdd(@RequestBody Menus menus){
        menusService.addMenu(menus);
        return new Result();
    }
    @RequestMapping(value = "menuUpdate")
    public Result menuUpdate(@RequestBody Menus menus){
        menusService.updateMenu(menus);
        return new Result();
    }
    @RequestMapping(value = "menuDelete")
    public Result menuDelete(@RequestBody List<Integer> menuIdList){
        menusService.deleteMenu(menuIdList);
        return new Result();
    }

}
