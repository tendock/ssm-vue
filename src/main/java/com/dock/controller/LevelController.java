package com.dock.controller;

import com.dock.entity.Level;
import com.dock.entity.Result;
import com.dock.service.LevelService;
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
 * @date:2023/6/5 13:14
 * @version:1.0
 */
@Controller
@CrossOrigin
@ResponseBody
public class LevelController {
    @Resource
    private LevelService levelService;
    @RequestMapping(value = "levelList")
    public Result levelList(Integer pageNo,Integer pageSize){
        return new Result(levelService.showLevelPage(pageNo,pageSize));
    }
    @RequestMapping(value = "levelAdd")
    public Result levelAdd(@RequestBody Level level){
        levelService.addLevel(level);
        return new Result();
    }
    @RequestMapping(value = "levelDelete")
    public Result levelList(@RequestBody List<Integer> levelIdList){
        levelService.deleteLevel(levelIdList);
        return new Result();
    }
    @RequestMapping(value = "levelUpdate")
    public Result levelList(@RequestBody Level level){
        levelService.updateLevel(level);
        return new Result();
    }
    @RequestMapping(value = "levelAll")
    public Result levelAll(){
        List<Level> levelList = levelService.getLevelList();
        ArrayList<Level> levels = new ArrayList<>();
        for(Level l:levelList){
            if(!l.getIsDelete().equals(0)){
                levels.add(l);
            }
        }
        return new Result(levels);
    }

}
