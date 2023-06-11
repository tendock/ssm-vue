package com.dock.service.impl;

import com.dock.entity.Department;
import com.dock.entity.Page;
import com.dock.mapper.DepartmentMapper;
import com.dock.service.DepartmentService;
import com.dock.utils.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/5 20:26
 * @version:1.0
 */
@Transactional
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Resource
    private DepartmentMapper departmentMapper;
    @Override
    public void addDept(Department department) {
        departmentMapper.addDept(department);
    }

    @Override
    public void deleteDept(Integer deptId) {
        departmentMapper.deleteDept(deptId);
    }

    @Override
    public void updateDept(Department department) {
        departmentMapper.updateDept(department);
    }
    @Override
    public Page showDeptPage(Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Department> deptList = departmentMapper.getDeptList();
        PageInfo<Department> departmentPageInfo = new PageInfo<>(deptList);
        return PageUtils.getPage(departmentPageInfo);
    }

    @Override
    public List<Department> showDeptList() {
        return departmentMapper.getDeptList();
    }
}
