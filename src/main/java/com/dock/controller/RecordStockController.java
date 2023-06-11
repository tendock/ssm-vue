package com.dock.controller;

import com.dock.dto.StockDto;
import com.dock.entity.EveryStock;
import com.dock.entity.Result;
import com.dock.service.RecordInService;
import com.dock.service.RecordOutService;
import com.dock.service.RecordStockService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/8 12:52
 * @version:1.0
 */
@Controller
@CrossOrigin
@ResponseBody
public class RecordStockController {
    @Resource
    private RecordStockService recordStockService;
    @Resource
    private RecordInService recordInService;
    @Resource
    private RecordOutService recordOutService;
    @RequestMapping(value = "resList")
    public Result resAll(Integer pageNo,Integer pageSize,String repoName,String productName){
        return new Result(recordStockService.showResPage(pageNo,pageSize,repoName,productName));
    }
    @RequestMapping(value = "resNum")
    public Result resNum(Integer repoId,Integer productId){
        if(recordStockService.showNum(repoId,productId) == null){
            return new Result(0);
        }
        return new Result(recordStockService.showNum(repoId,productId));
    }
    @RequestMapping(value = "todayStock")
    public Result todayStock(){
        return new Result(recordStockService.todayStock());
    }
    @RequestMapping(value = "everyStock")
    public Result everyStock(){
        return new Result(recordStockService.showStock());
    }
    @RequestMapping(value = "stockData")
    public Result stockData(){
        ArrayList<StockDto> stockDtos = new ArrayList<>();
        List<EveryStock> everyStocks = recordInService.everyMonth();
        List<EveryStock> everyStocks1 = recordOutService.everyMonth();
        for (int i = 0; i < everyStocks1.size(); i++) {
            StockDto stockDto = new StockDto();
            stockDto.setName(everyStocks.get(i).getName());
            stockDto.setIn(everyStocks.get(i).getValue());
            stockDto.setOut(everyStocks1.get(i).getValue());
            stockDtos.add(stockDto);
        }
        stockDtos.forEach(System.out::println);
        return new Result(stockDtos);
    }
}
