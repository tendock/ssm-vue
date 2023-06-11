package com.dock.mapper;

import com.dock.entity.EveryStock;
import com.dock.entity.RecordOut;
import com.dock.entity.RecordStock;

import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/8 11:31
 * @version:1.0
 */
public interface RecordOutMapper {
    /**
     * 新增出库记录
     */
    void addResOut(RecordOut recordOut);
    /**
     * 当天出库
     */
    Integer todayOut();
    /**
     * 一个月出库
     */
    List<EveryStock> everyMonth();
}
