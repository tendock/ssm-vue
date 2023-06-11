package com.dock.mapper;

import com.BaseTest;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @author:XuJianYuan
 * @date:2023/6/8 12:23
 * @version:1.0
 */
public class RecordStockMapperTest extends BaseTest {
    @Resource
    private RecordStockMapper recordStockMapper;
    @Test
    public void updateRes() {
    }

    @Test
    public void addRes() {
    }

    @Test
    public void getResList() {
        recordStockMapper.getResList("南",null).forEach(System.out::println);
    }

    @Test
    public void getRes() {
    }
    @Test
    public void todayStock(){
        System.out.println(recordStockMapper.todayStock());
    }
    @Test
    public void every(){
        recordStockMapper.getEveryStock().forEach(System.out::println);
    }

    @Test
    public void getNums() {
        Integer nums = recordStockMapper.getNums(1, 1);
        System.out.println(nums);
    }
}
