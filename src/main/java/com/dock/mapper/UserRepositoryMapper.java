package com.dock.mapper;

import com.dock.entity.UserRepository;

import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/8 8:07
 * @version:1.0
 */
public interface UserRepositoryMapper {
    /**
     * 添加
     */
    void addUserRepo(UserRepository userRepo);
    /**
     * 根据仓库id删除
     */
    void deleteUserRepo(Integer repoId);
    /**
     * 根据userid查询
     */
    List<UserRepository> getUserRepoList(Integer userId);
}
