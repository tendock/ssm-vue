package com.dock.controller;

import com.dock.entity.Product;
import com.dock.entity.Result;
import com.dock.service.ProductService;
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
 * @date:2023/6/6 21:37
 * @version:1.0
 */
@Controller
@CrossOrigin
@ResponseBody
public class ProductController {
    @Resource
    private ProductService productService;
    @RequestMapping(value = "productList")
    public Result productList(Integer pageNo, Integer pageSize, String productName, Double productPrice, @DateTimeFormat(pattern = "yyyy-MM-dd") Date start,@DateTimeFormat(pattern = "yyyy-MM-dd") Date end){
        System.out.println(start+"-----------"+end);
        return new Result(productService.showProductPage(pageNo,pageSize,productName,productPrice,start,end));
    }
    @RequestMapping(value = "productAdd")
    public Result productAdd(@RequestBody Product product){
        productService.addProduct(product);
        return new Result();
    }
    @RequestMapping(value = "productDelete")
    public Result productDelete(@RequestBody List<Integer> productIdList){
        productService.deleteProduct(productIdList);
        return new Result();
    }
    @RequestMapping(value = "productUpdate")
    public Result productUpdate(@RequestBody Product product){
        productService.updateProduct(product);
        return new Result();
    }
    @RequestMapping(value = "productAll")
    public Result productUpdate(String productName){
        List<Product> products = productService.showProductList(productName);
        ArrayList<Product> products1 = new ArrayList<>();
        for(Product p:products){
            if(!p.getIsDelete().equals(0)){
                products1.add(p);
            }
        }
        return new Result(products1);
    }
    @RequestMapping(value = "productSingle")
    public Result productSingle(Integer productId){
        return new Result( productService.showProduct(productId));
    }
}
