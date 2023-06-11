package com.dock.mapper;

import com.BaseTest;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @author:XuJianYuan
 * @date:2023/6/7 8:28
 * @version:1.0
 */
public class ProductMapperTest extends BaseTest {
    @Resource
    private ProductMapper productMapper;
    @Test
    public void addProduct() {
    }

    @Test
    public void deleteProduct() {
    }

    @Test
    public void updateProduct() {
    }
    @Test
    public void getProductListByName(){
        productMapper.getProductListByName(null).forEach(System.out::println);
    }
    @Test
    public void getProductList() {
        productMapper.getProductList(null,null,null,null).forEach(System.out::println);
    }
}
