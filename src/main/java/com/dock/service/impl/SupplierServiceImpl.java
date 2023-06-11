package com.dock.service.impl;

import com.dock.entity.Page;
import com.dock.entity.Supplier;
import com.dock.mapper.SupplierMapper;
import com.dock.service.SupplierService;
import com.dock.utils.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/7 11:47
 * @version:1.0
 */
@Transactional
@Service
public class SupplierServiceImpl implements SupplierService {
    @Resource
    private SupplierMapper supplierMapper;
    @Override
    public void addSupplier(Supplier supplier) {
        supplierMapper.addSupplier(supplier);
    }

    @Override
    public void deleteSupplier(List supplierIdList) {
        supplierMapper.deleteSupplier(supplierIdList);
    }

    @Override
    public void updateSupplier(Supplier supplier) {
        supplierMapper.updateSupplier(supplier);
    }

    @Override
    public Page showSupplierPage(Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Supplier> supplierList = supplierMapper.getSupplierList(null);
        PageInfo<Supplier> supplierPageInfo = new PageInfo<>(supplierList);
        return PageUtils.getPage(supplierPageInfo);
    }

    @Override
    public List<Supplier> showSupplierList(String supplierName) {
        return supplierMapper.getSupplierList(supplierName);
    }

    @Override
    public Supplier showSupplier(Integer supplierId) {
        return supplierMapper.getSupplier(supplierId);
    }
}
