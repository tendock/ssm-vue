package com.dock.mapper;

import com.BaseTest;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @author:XuJianYuan
 * @date:2023/6/7 9:55
 * @version:1.0
 */
public class CustomerMapperTest extends BaseTest {
    @Resource
    private CustomerMapper customerMapper;

    @Test
    public void addCustomer() {
    }

    @Test
    public void deleteCustomer() {
    }

    @Test
    public void updateCustomer() {
    }

    @Test
    public void getCustomerList() {
    }

    @Test
    public void getCustomer() {
        System.out.println(customerMapper.getCustomer(1));
    }
}
