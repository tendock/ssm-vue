package com.dock.mapper;

import com.BaseTest;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @author:XuJianYuan
 * @date:2023/6/5 20:21
 * @version:1.0
 */
public class DepartmentMapperTest extends BaseTest {
    @Resource
    private DepartmentMapper departmentMapper;
    @Test
    public void addDept() {
    }

    @Test
    public void deleteDept() {
    }

    @Test
    public void updateDept() {
    }

    @Test
    public void getDeptList() {
        departmentMapper.getDeptList().forEach(System.out::println);
    }

    @Test
    public void getDeptListByPid() {
    }
}
