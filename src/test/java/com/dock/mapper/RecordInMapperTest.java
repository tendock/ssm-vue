package com.dock.mapper;

import com.BaseTest;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @author:XuJianYuan
 * @date:2023/6/8 20:26
 * @version:1.0
 */
public class RecordInMapperTest extends BaseTest {
    @Resource
    private RecordInMapper recordInMapper;

    @Test
    public void addRecordIn() {
    }
    @Test
    public void everyMonth(){
        recordInMapper.showMonth().forEach(System.out::println);
    }
    @Test
    public void todayIn() {
        System.out.println(recordInMapper.todayIn());
    }
}
