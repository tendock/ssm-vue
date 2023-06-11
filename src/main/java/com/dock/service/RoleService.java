package com.dock.service;

import com.dock.entity.Page;
import com.dock.entity.Role;

import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/6 8:29
 * @version:1.0
 */
public interface RoleService {
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
     * 分页展示
     */
    Page showRolePage(Integer pageNo,Integer pageSize);
    /**
     * 展示所有角色
     */
    List<Role> showRoleList();
}
