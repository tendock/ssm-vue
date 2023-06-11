package com.dock.mapper;

import com.dock.entity.EveryStock;
import com.dock.entity.RecordStock;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/8 9:45
 * @version:1.0
 */
public interface RecordStockMapper {
    /**
     * 入库已有
     */
    void updateRes(RecordStock recordStock);
    /**
     * 入库新品
     */
    void addRes(RecordStock recordStock);
    /**
     * 查询所有库存
     */
    List<RecordStock> getResList(@Param(value = "repoName") String repoName, @Param(value = "productName")String productName);
    /**
     * 查询当前库存是否存在
     */
    RecordStock getRes(@Param(value = "repoId") Integer repoId,@Param(value = "productId")Integer productId);
    /**
     * 根据仓库id 物品id查询数量
     */
    Integer getNums(@Param(value = "repoId") Integer repoId,@Param(value = "productId")Integer productId);
    /**
     * 查询当天库存
     */
    Integer todayStock();
    /**
     * 分组查询
     */
    List<EveryStock> getEveryStock();
}
