package com.dock.mapper;

import com.dock.entity.Department;

import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/5 20:07
 * @version:1.0
 */
public interface DepartmentMapper {
    /**
     * 添加一级部门
     */
    void addDept(Department department);
    /**
     * 删除
     */
    void deleteDept(Integer deptId);
    /**
     * 更新
     */
    void updateDept(Department department);
    /**
     * 查询所有部门
     */
    List<Department> getDeptList();
    /**
     * 根据parentid查询子菜单
     */
    List<Department> getDeptListByPid(Integer deptId);
}
