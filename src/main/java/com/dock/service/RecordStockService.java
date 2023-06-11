package com.dock.service;

import com.dock.entity.EveryStock;
import com.dock.entity.Page;

import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/8 12:43
 * @version:1.0
 */
public interface RecordStockService {
    /**
     * 分页展示
     */
    Page showResPage(Integer pageNo,Integer pageSize,String repoName,String productName);
    /**
     * 展示当前仓库数量
     */
    Integer showNum(Integer repoId,Integer productId);
    /**
     * 当天库存
     */
    Integer todayStock();
    /**
     * 分组查询
     */
    List<EveryStock> showStock();
}
