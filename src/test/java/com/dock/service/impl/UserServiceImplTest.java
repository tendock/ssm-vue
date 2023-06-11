package com.dock.service.impl;

import com.BaseTest;
import com.dock.dto.UserDto;
import com.dock.service.UserService;
import org.junit.Test;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * @author:XuJianYuan
 * @date:2023/6/6 18:55
 * @version:1.0
 */
public class UserServiceImplTest extends BaseTest {
    @Resource
    private UserService userService;
    @Test
    public void addUser() {
        UserDto userDto = new UserDto();
        userDto.setAvatar("88");
        userDto.setUserEmail("1@com");
        userDto.setUserName("龙");
        userDto.setUserNick("小龙人");
        userDto.setUserTel("780273");
        userDto.setCreateTime(new Date());
        userDto.setPassword("1");
        userDto.setSalt("78");
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        ArrayList<Integer> integers1 = new ArrayList<>();
        integers1.add(1);
        integers1.add(3);
        userDto.setRoleIdList(integers);
        userDto.setDeptIdList(integers1);
        userService.addUser(userDto);
    }

    @Test
    public void deleteUser() {
    }

    @Test
    public void updateUser() {
    }

    @Test
    public void showUserPage() {
    }
}
