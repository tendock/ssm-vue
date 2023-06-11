package com.dock.service.impl;

import com.dock.dto.RepoOutDto;
import com.dock.entity.EveryStock;
import com.dock.entity.RecordOut;
import com.dock.entity.RecordStock;
import com.dock.mapper.RecordOutMapper;
import com.dock.mapper.RecordStockMapper;
import com.dock.service.RecordOutService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/8 11:41
 * @version:1.0
 */
@Transactional
@Service
public class RecordOutServiceImpl implements RecordOutService {
    @Resource
    private RecordOutMapper recordOutMapper;
    @Resource
    private RecordStockMapper recordStockMapper;
    @Override
    public Integer addResOut(RepoOutDto repoOutDto) {
        if(recordStockMapper.getNums(repoOutDto.getRepoId(),repoOutDto.getProductId())==null||recordStockMapper.getNums(repoOutDto.getRepoId(),repoOutDto.getProductId())<repoOutDto.getRecordOutNumber()){
            return -1;
        }else{
            RecordOut recordOut = new RecordOut();
            recordOut.setRecordOutNumber(repoOutDto.getRecordOutNumber());
            recordOut.setCustomerId(repoOutDto.getCustomerId());
            recordOut.setProductId(repoOutDto.getProductId());
            recordOut.setRemarks(repoOutDto.getRemarks());
            recordOut.setUserId(repoOutDto.getUserId());
            recordOut.setRepoId(repoOutDto.getRepoId());
            recordOutMapper.addResOut(recordOut);
            RecordStock recordStock = new RecordStock();
            recordStock.setProductStock(repoOutDto.getRecordOutNumber()*-1);
            recordStock.setProductId(repoOutDto.getProductId());
            recordStock.setRepoId(repoOutDto.getRepoId());
            recordStockMapper.updateRes(recordStock);
            return 0;
        }
    }

    @Override
    public Integer todayOut() {
        return recordOutMapper.todayOut();
    }

    @Override
    public List<EveryStock> everyMonth() {
        return recordOutMapper.everyMonth();
    }
}
