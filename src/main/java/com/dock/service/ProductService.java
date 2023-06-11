package com.dock.service;

import com.dock.entity.Page;
import com.dock.entity.Product;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/6 21:31
 * @version:1.0
 */
public interface ProductService {
    /**
     * 添加
     */
    void addProduct(Product product);
    /**
     * 删除
     */
    void deleteProduct(List productIdList);
    /**
     * 更新
     */
    void updateProduct(Product product);
    /**
     * 分页展示
     */
    Page showProductPage(Integer pageNo, Integer pageSize, String productName, Double productPrice, Date start, Date end);
    /**
     * 展示全部
     */
    List<Product> showProductList(String productName);
    /**
     * 展示单个
     */
    Product showProduct(Integer productId);
}
