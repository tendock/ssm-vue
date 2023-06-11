package com.dock.utils;

import com.BaseTest;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author:XuJianYuan
 * @date:2023/6/10 10:52
 * @version:1.0
 */
public class ReflectionUtilsTest extends BaseTest {

    @Test
    public void getHttpServletRequest() {
        System.out.println(ReflectionUtils.getHttpServletRequest());
    }
}
