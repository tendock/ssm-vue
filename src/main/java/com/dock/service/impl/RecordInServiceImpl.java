package com.dock.service.impl;

import com.dock.dto.RepoInDto;
import com.dock.entity.EveryStock;
import com.dock.entity.RecordIn;
import com.dock.entity.RecordStock;
import com.dock.mapper.RecordInMapper;
import com.dock.mapper.RecordStockMapper;
import com.dock.service.RecordInService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/8 10:14
 * @version:1.0
 */
@Transactional
@Service
public class RecordInServiceImpl implements RecordInService {
    @Resource
    private RecordInMapper recordInMapper;
    @Resource
    private RecordStockMapper recordStockMapper;
    @Override
    public void addRes(RepoInDto repoInDto) {
        RecordIn recordIn = new RecordIn();
        recordIn.setRecordInNumber(repoInDto.getRecordInNumber());
        recordIn.setCreateTime(repoInDto.getCreateTime());
        recordIn.setIsDelete(repoInDto.getIsDelete());
        recordIn.setRemarks(repoInDto.getRemarks());
        recordIn.setProductId(repoInDto.getProductId());
        recordIn.setRepoId(repoInDto.getRepoId());
        recordIn.setUserId(repoInDto.getUserId());
        recordIn.setSupplierId(repoInDto.getSupplierId());
        recordInMapper.addRecordIn(recordIn);
        RecordStock recordStock = new RecordStock();
        RecordStock res = recordStockMapper.getRes(repoInDto.getRepoId(), repoInDto.getProductId());
        recordStock.setProductId(repoInDto.getProductId());
        recordStock.setRepoId(repoInDto.getRepoId());
        recordStock.setCreateTime(repoInDto.getCreateTime());
        recordStock.setIsDelete(repoInDto.getIsDelete());
        recordStock.setProductStock(repoInDto.getRecordInNumber());
        if(res==null){
//            新增库存
            recordStockMapper.addRes(recordStock);
        }else{
//            更新库存
            recordStockMapper.updateRes(recordStock);
        }
    }

    @Override
    public Integer todayIn() {
        return recordInMapper.todayIn();
    }

    @Override
    public List<EveryStock> everyMonth() {
        return recordInMapper.showMonth();
    }
}
