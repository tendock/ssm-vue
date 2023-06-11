package com.dock.controller;

import com.dock.dto.RepoDto;
import com.dock.entity.Repository;
import com.dock.entity.Result;
import com.dock.service.RepoService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/8 8:23
 * @version:1.0
 */
@Controller
@CrossOrigin
@ResponseBody
public class RepoController {
    @Resource
    private RepoService repoService;
    @RequestMapping(value = "repoList")
    public Result repoList(Integer pageNo, Integer pageSize, String repoName, @DateTimeFormat(pattern = "yyyy-MM-dd") Date start,@DateTimeFormat(pattern = "yyyy-MM-dd") Date end){
        return new Result(repoService.getRepoPage(pageNo,pageSize,repoName,start,end));
    }
    @RequestMapping(value = "repoAdd")
    public Result repoAdd(@RequestBody RepoDto repoDto){
        repoService.addRepo(repoDto);
        return new Result();
    }
    @RequestMapping(value = "repoDelete")
    public Result repoDelete(@RequestBody List<Integer> repoIdList){
        repoService.deleteRepo(repoIdList);
        return new Result();
    }
    @RequestMapping(value = "repoUpdate")
    public Result repoUpdate(@RequestBody RepoDto repoDto){
        repoService.updateRepo(repoDto);
        return new Result();
    }
    @RequestMapping(value = "repoAll")
    public  Result repoAll(String repoName){
        List<Repository> repositories = repoService.showRepoList(repoName);
        ArrayList<Repository> repositories1 = new ArrayList<>();
        for(Repository r:repositories){
            if(!r.getIsDelete().equals(0)&&r.getRepoStatus().equals(1)){
                repositories1.add(r);
            }
        }
        return new Result(repositories1);
    }
}
