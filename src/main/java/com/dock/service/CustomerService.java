package com.dock.service;

import com.dock.entity.Customer;
import com.dock.entity.Page;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/7 9:58
 * @version:1.0
 */
public interface CustomerService {
    /**
     * 添加
     */
    void addCustomer(Customer customer);
    /**
     * 删除
     */
    void deleteCustomer(List customerIdList);
    /**
     * 更新
     */
    void updateCustomer(Customer customer);
    /**
     * 分页展示
     */
    Page showCustomerPage(Integer pageNo, Integer pageSize, String customerName, String customerTel, Date start,Date end);
    /**
     * 展示客户
     */
    List<Customer> showCustomerList(String customerName);
    /**
     * 根据id
     */
    Customer showCustomer(Integer customerId);
}
