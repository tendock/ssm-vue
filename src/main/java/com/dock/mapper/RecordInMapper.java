package com.dock.mapper;

import com.dock.entity.EveryStock;
import com.dock.entity.RecordIn;

import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/8 9:16
 * @version:1.0
 */
public interface RecordInMapper {
    /**
     * 添加
     */
    void addRecordIn(RecordIn recordIn);
    /**
     * 查询当天库存
     */
    Integer todayIn();
    /**
     * 查询进一个月入库
     */
    List<EveryStock> showMonth();

}
