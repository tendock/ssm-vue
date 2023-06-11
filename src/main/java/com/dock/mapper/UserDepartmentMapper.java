package com.dock.mapper;

import com.dock.entity.Department;
import com.dock.entity.UserDepartment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/6 14:08
 * @version:1.0
 */
public interface UserDepartmentMapper {
    /**
     * 根据用户id查询部门id
     */
    List<Integer> getDeptIdList(Integer userId);
    /**
     * 查询所有员工所属部门集合
     */
    List<Department> getDeptList(Integer userId);
    /**
     * 添加部门员工关联
     */
    void addUserDept(List<UserDepartment> userDepartment);
    /**
     * 根据员工id删除
     */
    void deleteUserDeptList(List userIdList);
    /**
     * 根据员工id更新
     */
    void updateUserDeptList(@Param(value = "userId") Integer userId,@Param(value = "isDelete") Integer isDelete);
    /**
     * 根据员工id删除所有记录
     */
    void deleteByUserId(Integer userId);
}
