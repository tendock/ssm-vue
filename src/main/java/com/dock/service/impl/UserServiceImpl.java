package com.dock.service.impl;

import com.dock.dto.UserDto;
import com.dock.entity.Page;
import com.dock.entity.User;
import com.dock.entity.UserDepartment;
import com.dock.entity.UserRole;
import com.dock.mapper.UserDepartmentMapper;
import com.dock.mapper.UserMapper;
import com.dock.mapper.UserRoleMapper;
import com.dock.service.UserService;
import com.dock.utils.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/6 11:39
 * @version:1.0
 */
@Transactional
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Resource
    private UserDepartmentMapper userDepartmentMapper;
    @Resource
    private UserRoleMapper userRoleMapper;
    @Override
    public void addUser(UserDto userDto) {
        if(userDto.getAvatar()==null){
            userDto.setAvatar("666");
        }
        User user = new User();
        user.setUserName(userDto.getUserName());
        user.setPassword(userDto.getPassword());
        user.setUserEmail(userDto.getUserEmail());
        user.setUserNick(userDto.getUserNick());
        user.setUserTel(userDto.getUserTel());
        user.setCreateTime(userDto.getCreateTime());
        user.setAvatar(userDto.getAvatar());
        user.setIsDelete(userDto.getIsDelete());
        user.setSalt(userDto.getPassword());
        userMapper.addUser(user);
        System.out.println(user.getUserId());
        ArrayList<UserDepartment> userDepartments = new ArrayList<>();
        for(Integer a:userDto.getDeptIdList()){
            UserDepartment userDepartment = new UserDepartment();
            userDepartment.setUserId(user.getUserId());
            userDepartment.setCreateTime(userDto.getCreateTime());
            userDepartment.setIsDelete(userDto.getIsDelete());
            userDepartment.setDeptId(a);
            userDepartments.add(userDepartment);
        }
        userDepartmentMapper.addUserDept(userDepartments);
        ArrayList<UserRole> userRoles = new ArrayList<>();
        for(Integer a:userDto.getRoleIdList()){
            UserRole userRole = new UserRole();
            userRole.setRoleId(a);
            userRole.setCreateTime(userDto.getCreateTime());
            userRole.setIsDelete(userDto.getIsDelete());
            userRole.setUserId(user.getUserId());
            userRoles.add(userRole);
        }
        userRoleMapper.addUserRole(userRoles);
    }

    @Override
    public void deleteUser(List userIdList) {
        userMapper.deleteUser(userIdList);
        userDepartmentMapper.deleteUserDeptList(userIdList);
        userRoleMapper.deleteUserRoleList(userIdList);
    }

    @Override
    public void updateUser(UserDto userDto) {
        if(userDto.getAvatar()==null){
            userDto.setAvatar("666");
        }
        User user = new User();
        user.setUserId(userDto.getUserId());
        user.setUserName(userDto.getUserName());
        user.setPassword(userDto.getPassword());
        user.setUserEmail(userDto.getUserEmail());
        user.setUserNick(userDto.getUserNick());
        user.setUserTel(userDto.getUserTel());
        user.setCreateTime(userDto.getCreateTime());
        user.setAvatar(userDto.getAvatar());
        user.setIsDelete(userDto.getIsDelete());
        user.setSalt(userDto.getPassword());
        System.out.println(user);
        userMapper.updateUser(user);
/**
 * 将原来的删除掉
 */
        userDepartmentMapper.deleteByUserId(user.getUserId());
        userRoleMapper.deleteByUserId(user.getUserId());

        ArrayList<UserDepartment> userDepartments = new ArrayList<>();
        for(Integer a:userDto.getDeptIdList()){
            UserDepartment userDepartment = new UserDepartment();
            userDepartment.setUserId(user.getUserId());
            userDepartment.setCreateTime(userDto.getCreateTime());
            userDepartment.setIsDelete(userDto.getIsDelete());
            userDepartment.setDeptId(a);
            userDepartments.add(userDepartment);
        }
        userDepartmentMapper.addUserDept(userDepartments);
        ArrayList<UserRole> userRoles = new ArrayList<>();
        for(Integer a:userDto.getRoleIdList()){
            UserRole userRole = new UserRole();
            userRole.setRoleId(a);
            userRole.setCreateTime(userDto.getCreateTime());
            userRole.setIsDelete(userDto.getIsDelete());
            userRole.setUserId(user.getUserId());
            userRoles.add(userRole);
        }
        userRoleMapper.addUserRole(userRoles);
    }

    @Override
    public Page showUserPage(Integer pageNo, Integer pageSize, String userName, String userTel,  Date start, Date end) {
        PageHelper.startPage(pageNo,pageSize);
        List<User> userList = userMapper.getUserList(userName, userTel, start, end);
        PageInfo<User> userPageInfo = new PageInfo<>(userList);
        return PageUtils.getPage(userPageInfo);
    }

    @Override
    public User showUser(String userEmail, String password) {
        return userMapper.getUser(userEmail,password);
    }

    @Override
    public User getUserByEmail(String email) {
        return userMapper.getUserByEmail(email);
    }
}
