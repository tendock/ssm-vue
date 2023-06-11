package com.dock.controller;

import com.dock.entity.Industry;
import com.dock.entity.Result;
import com.dock.service.IndustryService;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.persistence.SqlResultSetMapping;
import java.util.ArrayList;
import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/5 17:45
 * @version:1.0
 */
@CrossOrigin
@Controller
@ResponseBody
public class IndustryController {
    @Resource
    private IndustryService industryService;
    @RequestMapping(value = "industryList")
    public Result industryList(Integer pageNo,Integer pageSize){
        return new Result(industryService.getIndustryPage(pageNo,pageSize));
    }
    @RequestMapping(value = "industryAdd")
    public Result industryAdd(@RequestBody Industry industry){
        industryService.addIndustry(industry);
        return new Result();
    }
    @RequestMapping(value = "industryDelete")
    public Result industryDelete(@RequestBody List<Integer> industryIdList){
        industryService.deleteIndustry(industryIdList);
        return new Result();
    }
    @RequestMapping(value = "industryUpdate")
    public Result industryUpdate(@RequestBody Industry industry){
        industryService.updateIndustry(industry);
        return new Result();
    }
    @RequestMapping(value = "industryAll")
    public Result industryAll(){
        List<Industry> industryList = industryService.getIndustryList();
        ArrayList<Industry> industries = new ArrayList<>();
        for(Industry  i:industryList){
            if(!i.getIsDelete().equals(0)){
                industries.add(i);            }
        }
        return new Result(industries);
    }
}
