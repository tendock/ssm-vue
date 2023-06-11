package com.dock.controller;

import com.dock.entity.Result;
import com.dock.service.SysLogService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author:XuJianYuan
 * @date:2023/6/8 19:33
 * @version:1.0
 */
@Controller
@CrossOrigin
@ResponseBody
public class SysLogController {
    @Resource
    private SysLogService sysLogService;
    @RequestMapping(value = "sysLogList")
    public Result sysLogList(Integer pageNo,Integer pageSize){
        return new Result(sysLogService.showLogPage(pageNo,pageSize));
    }
    @RequestMapping(value = "sysLogDelete")
    public Result sysLogDelete(){
        sysLogService.deleteAll();
        return new Result();
    }
}
