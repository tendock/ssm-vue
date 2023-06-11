package com.dock.service.impl;

import com.dock.entity.Page;
import com.dock.entity.Role;
import com.dock.mapper.RoleMapper;
import com.dock.service.RoleService;
import com.dock.utils.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/6 8:31
 * @version:1.0
 */
@Transactional
@Service
public class RoleServiceImpl implements RoleService {
    @Resource
    private RoleMapper roleMapper;
    @Override
    public void addRole(Role role) {
        roleMapper.addRole(role);
    }

    @Override
    public void deleteRole(List roleIdList) {
        roleMapper.deleteRole(roleIdList);
    }

    @Override
    public void updateRole(Role role) {
        roleMapper.updateRole(role);
    }

    @Override
    public Page showRolePage(Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Role> roleList = roleMapper.getRoleList();
        PageInfo<Role> rolePageInfo = new PageInfo<>(roleList);
        return PageUtils.getPage(rolePageInfo);
    }

    @Override
    public List<Role> showRoleList() {
        return roleMapper.getRoleList();
    }
}
