package com.dock.service;

import com.dock.dto.RepoInDto;
import com.dock.entity.EveryStock;
import com.dock.entity.RecordIn;

import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/8 10:14
 * @version:1.0
 */
public interface RecordInService {
    /**
     * 入库
     */
    void addRes(RepoInDto repo);
    /**
     * 当天入库
     */
    Integer todayIn();
    /**
     * 本月入库
     */
    List<EveryStock> everyMonth();
}
