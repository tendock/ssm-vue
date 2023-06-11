package com.dock.service.impl;

import com.dock.entity.Customer;
import com.dock.entity.Page;
import com.dock.mapper.CustomerMapper;
import com.dock.service.CustomerService;
import com.dock.utils.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/7 10:00
 * @version:1.0
 */
@Transactional
@Service
public class CustomerServiceImpl implements CustomerService {
    @Resource
    private CustomerMapper customerMapper;
    @Override
    public void addCustomer(Customer customer) {
        customerMapper.addCustomer(customer);
    }

    @Override
    public void deleteCustomer(List customerIdList) {
        customerMapper.deleteCustomer(customerIdList);
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerMapper.updateCustomer(customer);
    }

    @Override
    public Page showCustomerPage(Integer pageNo, Integer pageSize, String customerName, String customerTel, Date start, Date end) {
        PageHelper.startPage(pageNo,pageSize);
        List<Customer> customerList = customerMapper.getCustomerList(customerName, customerTel, start, end);
        PageInfo<Customer> customerPageInfo = new PageInfo<>(customerList);
        return PageUtils.getPage(customerPageInfo);
    }

    @Override
    public List<Customer> showCustomerList(String customerName) {
        return customerMapper.getCustomerByName(customerName);
    }

    @Override
    public Customer showCustomer(Integer customerId) {
        return customerMapper.getCustomer(customerId);
    }
}
