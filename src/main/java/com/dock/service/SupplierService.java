package com.dock.service;

import com.dock.entity.Page;
import com.dock.entity.Supplier;

import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/7 11:45
 * @version:1.0
 */
public interface SupplierService {
    /**
     * 添加
     */
    void addSupplier(Supplier supplier);
    /**
     * 删除
     */
    void deleteSupplier(List supplierIdList);
    /**
     * 更新
     */
    void updateSupplier(Supplier supplier);
    /**
     * 分页展示
     */
    Page showSupplierPage(Integer pageNo,Integer pageSize);
    /**
     * 展示所有供应商
     */
    List<Supplier> showSupplierList(String supplierName);
    /**
     * 根据id展示
     */
    Supplier showSupplier(Integer supplierId);
}
