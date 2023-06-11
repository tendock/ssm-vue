package com.dock.controller;

import com.dock.entity.Result;
import com.dock.entity.Source;
import com.dock.service.SourceService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/5 16:18
 * @version:1.0
 */
@Controller
@CrossOrigin
@ResponseBody
public class SourceController {
    @Resource
    private SourceService sourceService;
    @RequestMapping(value = "sourceList")
    public Result sourceList(Integer pageNo,Integer pageSize){
        return new Result(sourceService.getSourcePage(pageNo,pageSize));
    }
    @RequestMapping(value = "sourceAdd")
    public Result sourceAdd(@RequestBody Source source){
        sourceService.addSource(source);
        return new Result();
    }
    @RequestMapping(value = "sourceUpdate")
    public Result sourceUpdate(@RequestBody Source source){
        sourceService.updateSource(source);
        return new Result();
    }
    @RequestMapping(value = "sourceDelete")
    public Result sourceDelete(@RequestBody List<Integer> sourceIdList){
        sourceService.deleteSource(sourceIdList);
        return new Result();
    }
    @RequestMapping(value = "sourceAll")
    public Result sourceDelete(){
        List<Source> sourceList = sourceService.getSourceList();
        ArrayList<Source> sources = new ArrayList<>();
        for(Source s:sourceList){
            if(!s.getIsDelete().equals(0)){
                sources.add(s);
            }
        }
        return new Result(sources);
    }
}
