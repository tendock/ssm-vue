package com.dock.service;

import com.dock.dto.RepoOutDto;
import com.dock.entity.EveryStock;

import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/8 11:39
 * @version:1.0
 */
public interface RecordOutService {
    /**
     * 出库
     */
    Integer addResOut(RepoOutDto repoOutDto);
    /**
     * 当天出库
     */
    Integer todayOut();
    /**
     * 一个月内出库
     */
    List<EveryStock> everyMonth();
}
