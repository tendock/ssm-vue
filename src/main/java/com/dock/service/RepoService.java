package com.dock.service;

import com.dock.dto.RepoDto;
import com.dock.entity.Page;
import com.dock.entity.Repository;

import java.util.Date;
import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/8 8:12
 * @version:1.0
 */
public interface RepoService {
    /**
     * 添加
     */
    void addRepo(RepoDto repoDto);
    /**
     * 删除
     */
    void deleteRepo(List repoIdList);
    /**
     * 更新
     */
    void updateRepo(RepoDto repoDto);
    /**
     * 分页
     */
    Page getRepoPage(Integer pageNo, Integer pageSize, String repoName, Date start,Date end);
    /**
     * 展示全部
     */
    List<Repository> showRepoList(String repoName);

}
