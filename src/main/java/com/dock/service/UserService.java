package com.dock.service;

import com.dock.dto.UserDto;
import com.dock.entity.Page;
import com.dock.entity.User;

import java.util.Date;
import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/6 11:36
 * @version:1.0
 */
public interface UserService {
    /**
     * 添加
     */
    void addUser(UserDto userDto);
    /**
     * 删除
     */
    void deleteUser(List userIdList);
    /**
     * 更新
     */
    void updateUser(UserDto userDto);
    /**
     * 分页展示
     */
    Page showUserPage(Integer pageNo, Integer pageSize, String userName, String userTel, Date start, Date end);
    /**
     * 登录
     */
    User showUser(String userEmail,String password);
    /**
     * 根据邮箱获取用户
     */
    User getUserByEmail(String email);
}
