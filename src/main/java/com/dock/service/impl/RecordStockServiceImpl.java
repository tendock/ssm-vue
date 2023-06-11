package com.dock.service.impl;

import com.dock.entity.EveryStock;
import com.dock.entity.Page;
import com.dock.entity.RecordStock;
import com.dock.mapper.RecordStockMapper;
import com.dock.service.RecordStockService;
import com.dock.utils.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/8 12:50
 * @version:1.0
 */
@Transactional
@Service
public class RecordStockServiceImpl implements RecordStockService {
    @Resource
    private RecordStockMapper recordStockMapper;
    @Override
    public Page showResPage(Integer pageNo, Integer pageSize, String repoName, String productName) {
        PageHelper.startPage(pageNo,pageSize);
        List<RecordStock> resList = recordStockMapper.getResList(repoName, productName);
        PageInfo<RecordStock> recordStockPageInfo = new PageInfo<>(resList);
        return PageUtils.getPage(recordStockPageInfo);
    }

    @Override
    public Integer showNum(Integer repoId, Integer productId) {
        return recordStockMapper.getNums(repoId,productId);
    }

    @Override
    public Integer todayStock() {
        return recordStockMapper.todayStock();
    }

    @Override
    public List<EveryStock> showStock() {
        return recordStockMapper.getEveryStock();
    }
}
