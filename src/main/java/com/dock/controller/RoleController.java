package com.dock.controller;

import com.dock.entity.Result;
import com.dock.entity.Role;
import com.dock.service.RoleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/6 8:34
 * @version:1.0
 */
@CrossOrigin
@Controller
@ResponseBody
public class RoleController {
    @Resource
    private RoleService roleService;
    @RequestMapping(value = "roleList")
    public Result roleList(Integer pageNo,Integer pageSize){
        return new Result(roleService.showRolePage(pageNo,pageSize));
    }
    @RequestMapping(value = "roleAdd")
    public Result roleAdd(@RequestBody Role role){
        roleService.addRole(role);
        return new Result();
    }
    @RequestMapping(value = "roleDelete")
    public Result roleDelete(@RequestBody List<Integer> roleIdList){
        roleService.deleteRole(roleIdList);
        return new Result();
    }
    @RequestMapping(value = "roleUpdate")
    public Result roleUpdate(@RequestBody Role role){
        roleService.updateRole(role);
        return new Result();
    }
    @RequestMapping(value = "roleAll")
    public Result roleAll(){
        List<Role> roles = roleService.showRoleList();
        ArrayList<Role> roles1 = new ArrayList<>();
        for(Role r:roles){
            if(!r.getIsDelete().equals(0)){
                roles1.add(r);
            }
        }
        return new Result(roles1);
    }
}
