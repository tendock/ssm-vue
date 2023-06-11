package com.dock.mapper;

import com.dock.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/6 11:12
 * @version:1.0
 */
public interface UserMapper {
    /**
     * 添加用户
     */
    Integer addUser(User user);
    /**
     * 删除用户
     */
    void deleteUser(List userIdList);
    /**
     * 更新用户
     */
    void updateUser(User user);
    /**
     * 查询所有用户
     */
    List<User> getUserList(@Param(value = "userName") String userName,@Param(value = "userTel") String userTel, @Param(value = "start")Date start, @Param(value = "end")Date end);
    /**
     * 根据邮箱，密码查询用户
     */
    User getUser(@Param(value = "userEmail") String userEmail,@Param(value = "password")String password);
    /**
     * 根据邮箱查询用户
     */
    User getUserByEmail(String userEmail);
}
