package com.dock.mapper;

import com.dock.entity.Role;
import com.dock.entity.UserRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/6 14:30
 * @version:1.0
 */
public interface UserRoleMapper {
    /**
     * 根据userid查询所有角色id
     */
    List<Integer> getRoleIdList(Integer userId);
    /**
     * 根据userId查询所有角色信息
     */
    List<Role> getRoleList(Integer userId);
    /**
     * 添加roleuser关联
     */
    void addUserRole(List<UserRole> userRoles);
    /**
     * 根据Userid删除
     */
    void deleteUserRoleList(List userIdList);
    /**
     * 根据userid，isdelete更新
     */
    void updateUserRoleList(@Param(value = "userId") Integer userId,@Param(value = "isDelete") Integer isDlete);
    /**
     * 根据useid删除记录
     */
    void deleteByUserId(Integer userId);
}
