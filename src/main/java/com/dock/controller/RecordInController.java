package com.dock.controller;

import com.dock.dto.RepoInDto;
import com.dock.entity.Result;
import com.dock.service.RecordInService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author:XuJianYuan
 * @date:2023/6/8 10:28
 * @version:1.0
 */
@Controller
@CrossOrigin
@ResponseBody
public class RecordInController {
    @Resource
    private RecordInService recordInService;
    @RequestMapping(value = "recordIn")
    public Result recordIn(@RequestBody RepoInDto repoInDto){
        recordInService.addRes(repoInDto);
        return new Result();
    }
    @RequestMapping(value = "todayIn")
    public Result todayIn(){
        return new Result(recordInService.todayIn());
    }
    @RequestMapping(value = "everyMonthIn")
    public Result everyMonth(){
        return new Result(recordInService.everyMonth());
    }
}
