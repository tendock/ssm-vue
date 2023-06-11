package com.dock.controller;

import com.dock.entity.Customer;
import com.dock.entity.Result;
import com.dock.service.CategoryService;
import com.dock.service.CustomerService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/7 10:03
 * @version:1.0
 */
@Controller
@CrossOrigin
@ResponseBody
public class CustomerController {
    @Resource
    private CustomerService customerService;
    @RequestMapping(value = "customerList")
    public Result customerList(Integer pageNo, Integer pageSize, String customerName, String customerTel, @DateTimeFormat(pattern = "yyyy-MM-dd") Date start, @DateTimeFormat(pattern = "yyyy-MM-dd")Date end){
      return new Result(customerService.showCustomerPage(pageNo,pageSize,customerName,customerTel,start,end));
    }
    @RequestMapping(value = "customerAdd")
    public Result customerAdd(@RequestBody Customer customer){
        customerService.addCustomer(customer);
        return new Result();
    }
    @RequestMapping(value = "customerDelete")
    public Result customerDelete(@RequestBody List<Integer> customerIdList){
        customerService.deleteCustomer(customerIdList);
        return new Result();
    }
    @RequestMapping(value = "customerUpdate")
    public Result customerUpdate(@RequestBody Customer customer){
        customerService.updateCustomer(customer);
        return new Result();
    }
    @RequestMapping(value = "customerAll")
    public Result customerAll(String customerName){
        List<Customer> customers = customerService.showCustomerList(customerName);
        ArrayList<Customer> customers1 = new ArrayList<>();
        for (Customer c:customers){
            if(!c.getIsDelete().equals(0)){
                customers1.add(c);
            }
        }
        return new Result(customers1);
    }
    @RequestMapping(value = "customerSingle")
    public Result customerAll(Integer customerId){
        return new Result(customerService.showCustomer(customerId));
    }
}
