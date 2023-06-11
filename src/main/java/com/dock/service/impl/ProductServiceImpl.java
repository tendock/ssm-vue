package com.dock.service.impl;

import com.dock.entity.Page;
import com.dock.entity.Product;
import com.dock.mapper.ProductMapper;
import com.dock.service.ProductService;
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
 * @date:2023/6/6 21:34
 * @version:1.0
 */
@Service
@Transactional
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductMapper productMapper;
    @Override
    public void addProduct(Product product) {
        productMapper.addProduct(product);
    }

    @Override
    public void deleteProduct(List productIdList) {
        productMapper.deleteProduct(productIdList);
    }

    @Override
    public void updateProduct(Product product) {
        productMapper.updateProduct(product);
    }

    @Override
    public Page showProductPage(Integer pageNo, Integer pageSize, String productName, Double productPrice, Date start, Date end) {
        PageHelper.startPage(pageNo,pageSize);
        List<Product> productList = productMapper.getProductList(productName, productPrice, start, end);
        PageInfo<Product> productPageInfo = new PageInfo<>(productList);
        return PageUtils.getPage(productPageInfo);
    }

    @Override
    public List<Product> showProductList(String productName) {
        return productMapper.getProductListByName(productName);
    }

    @Override
    public Product showProduct(Integer productId) {
        return productMapper.getProduct(productId);
    }
}
