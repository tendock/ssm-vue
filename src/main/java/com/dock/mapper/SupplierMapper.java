package com.dock.mapper;

import com.dock.entity.Supplier;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/7 11:35
 * @version:1.0
 */
public interface SupplierMapper {
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
     * 查询
     */
    List<Supplier> getSupplierList(@Param(value = "supplierName") String supplierName);
    /**
     * 根据id查询
     */
    Supplier getSupplier(Integer supplierId);
}
