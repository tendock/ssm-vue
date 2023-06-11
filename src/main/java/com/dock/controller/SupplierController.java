package com.dock.controller;

import com.dock.entity.Result;
import com.dock.entity.Supplier;
import com.dock.service.SupplierService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/7 11:50
 * @version:1.0
 */
@Controller
@ResponseBody
@CrossOrigin
public class SupplierController {
    @Resource
    private SupplierService supplierService;
    @RequestMapping(value = "supplierList")
    public Result supplierList(Integer pageNo,Integer pageSize){
        return new Result(supplierService.showSupplierPage(pageNo,pageSize));
    }
    @RequestMapping(value = "supplierAdd")
    public Result suppplierAdd(@RequestBody Supplier supplier){
        supplierService.addSupplier(supplier);
        return new Result();
    }
    @RequestMapping(value = "supplierUpdate")
    public Result suppplierUpdate(@RequestBody Supplier supplier){
        supplierService.updateSupplier(supplier);
        return new Result();
    }
    @RequestMapping(value = "supplierDelete")
    public Result suppplierDelete(@RequestBody List<Integer> supplierIdList){
        supplierService.deleteSupplier(supplierIdList);
        return new Result();
    }
    @RequestMapping(value = "supplierAll")
    public Result supplierAll(String supplierName){
        List<Supplier> suppliers = supplierService.showSupplierList(supplierName);
        ArrayList<Supplier> suppliers1 = new ArrayList<>();
        for(Supplier s:suppliers){
            if(!s.getIsDelete().equals(0)){
                suppliers1.add(s);
            }
        }
        return new Result(suppliers1);
    }
    @RequestMapping(value = "supplierSingle")
    public Result supplierSingle(Integer supplierId){
        return new Result(supplierService.showSupplier(supplierId));
    }
}
