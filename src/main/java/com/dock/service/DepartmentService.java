package com.dock.service;

import com.dock.entity.Department;
import com.dock.entity.Page;

import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/5 20:25
 * @version:1.0
 */
public interface DepartmentService {
    /**
     * 添加
     */
    void addDept(Department department);
    /**
     * 删除
     */
    void deleteDept(Integer deptId);
    /**
     * 修改
     */
    void updateDept(Department department);
    /**
     * 分页展示
     */
    Page showDeptPage(Integer pageNo,Integer pageSize);
    /**
     * 展示所有部门
     */
    List<Department> showDeptList();
}
