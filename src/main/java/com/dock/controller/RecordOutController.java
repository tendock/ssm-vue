package com.dock.controller;

import com.dock.dto.RepoOutDto;
import com.dock.entity.Result;
import com.dock.service.RecordOutService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author:XuJianYuan
 * @date:2023/6/8 11:49
 * @version:1.0
 */
@Controller
@ResponseBody
@CrossOrigin
public class RecordOutController {
    @Resource
    private RecordOutService recordOutService;
    @RequestMapping(value = "recordOut")
    public Result recordOut(@RequestBody RepoOutDto repoOutDto){
        System.out.println(repoOutDto);
        Result result = new Result();
        if((recordOutService.addResOut(repoOutDto))==-1){
            result.setCode(-1);
            result.setMsg("error");
        }return result;
    }
    @RequestMapping(value = "todayOut")
    public Result todayOut(){
        return new Result(recordOutService.todayOut());
    }
    @RequestMapping(value = "everyMonthOut")
    public Result everyMonthOut(){
        return new Result(recordOutService.everyMonth());
    }
}
