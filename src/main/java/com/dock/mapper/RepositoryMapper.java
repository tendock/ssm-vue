package com.dock.mapper;

import com.dock.entity.Repository;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/7 15:14
 * @version:1.0
 */
public interface RepositoryMapper {
    /**
     * 添加
     */
    void addRepository(Repository repository);
    /**
     * 删除
     */
    void deleteRepository(List RepositoryIdList);
    /**
     * 更新
     */
    void updateRepository(Repository repository);
    /**
     * 查询全部
     */
    List<Repository> getRepositoryList(@Param(value = "repoName") String repoName,@Param(value = "start") Date start, @Param(value = "end")Date end);
    /**
     * 根据id查询仓库
     */
    Repository getRepo(Integer repoId);
}
