package com.dock.mapper;

import com.dock.entity.Product;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/6 21:11
 * @version:1.0
 */
public interface ProductMapper {
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
     * 查询全部
     */
    List<Product> getProductList(@Param(value = "productName")String productName, @Param(value = "productPrice")Double productPrice,@Param(value = "start") Date start,@Param(value = "end") Date end);
    /**
     * 根据id获取
     */
    Product getProduct(Integer productId);
    /**
     * 根据名称获取
     */
    List<Product> getProductListByName(@Param(value = "productName") String productName);
}
