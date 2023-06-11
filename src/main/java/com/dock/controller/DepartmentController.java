package com.dock.controller;

import com.dock.entity.Department;
import com.dock.entity.Result;
import com.dock.service.DepartmentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.annotation.Resource;

/**
 * @author:XuJianYuan
 * @date:2023/6/5 20:29
 * @version:1.0
 */
@CrossOrigin
@Controller
@ResponseBody
public class DepartmentController {
    @Resource
    private DepartmentService departmentService;
    @RequestMapping(value = "deptList")
    public Result deptList(Integer pageNo, Integer pageSize){
        return new Result(departmentService.showDeptPage(pageNo,pageSize));
    }
    @RequestMapping(value = "deptAdd")
    public Result deptAdd(@RequestBody Department department){
        departmentService.addDept(department);
        return new Result();
    }
    @RequestMapping(value = "deptDelete")
    public Result deptDelete(Integer deptId){
        departmentService.deleteDept(deptId);
        return new Result();
    }
    @RequestMapping(value = "deptUpdate")
    public Result deptUpdate(@RequestBody Department department){
        departmentService.updateDept(department);
        return new Result();
    }
    @RequestMapping(value = "deptAll")
    public Result deptAll(){
        return new Result(departmentService.showDeptList());
    }
}
