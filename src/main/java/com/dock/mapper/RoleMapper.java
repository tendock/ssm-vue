package com.dock.mapper;

import com.dock.entity.Role;

import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/6 8:21
 * @version:1.0
 */
public interface RoleMapper {
    /**
     * 添加
     */
    void addRole(Role role);
    /**
     * 删除
     */
    void deleteRole(List roleIdList);
    /**
     * 更新
     */
    void updateRole(Role role);
    /**
     * 展示全部
     */
    List<Role> getRoleList();
}
