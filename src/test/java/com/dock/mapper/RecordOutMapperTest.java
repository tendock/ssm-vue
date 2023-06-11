package com.dock.mapper;

import com.BaseTest;
import org.junit.Test;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @author:XuJianYuan
 * @date:2023/6/9 10:16
 * @version:1.0
 */
public class RecordOutMapperTest extends BaseTest {
    @Resource
    private RecordOutMapper recordOutMapper;

    @Test
    public void addResOut() {
    }

    @Test
    public void todayOut() {
    }

    @Test
    public void everyMonth() {
        recordOutMapper.everyMonth().forEach(System.out::println);
    }
}
