package com.dock.mapper;

import com.BaseTest;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @author:XuJianYuan
 * @date:2023/6/6 11:29
 * @version:1.0
 */
public class UserMapperTest extends BaseTest {
    @Resource
    private UserMapper userMapper;
    @Test
    public void addUser() {
    }

    @Test
    public void deleteUser() {
    }

    @Test
    public void updateUser() {
    }
    @Test
    public void getUser(){
        System.out.println(userMapper.getUser("1@com", "1"));
    }
    @Test
    public void getUserEmail(){
        System.out.println(userMapper.getUserByEmail("1@com"));
    }



    @Test
    public void getUserList() {
        userMapper.getUserList(null,"1",null,null).forEach(System.out::println);
    }
}
