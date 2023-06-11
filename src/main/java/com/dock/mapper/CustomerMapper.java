package com.dock.mapper;

import com.dock.entity.Customer;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/7 9:33
 * @version:1.0
 */
public interface CustomerMapper {
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
     * 查询全部
     */
    List<Customer> getCustomerList(@Param(value = "customerName") String customerName, @Param(value = "customerTel")String customerTel,@Param(value = "start") Date start,@Param(value = "end") Date end);
    /**
     * 根据id查询
     */
    Customer getCustomer(Integer customerId);
    /**
     * 根据名字模糊查询
     */
    List<Customer> getCustomerByName(@Param(value = "customerName") String customerName);

}
