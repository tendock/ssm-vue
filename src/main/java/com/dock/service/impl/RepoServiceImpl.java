package com.dock.service.impl;

import com.dock.dto.RepoDto;
import com.dock.entity.Page;
import com.dock.entity.Repository;
import com.dock.entity.User;
import com.dock.entity.UserRepository;
import com.dock.mapper.RepositoryMapper;
import com.dock.mapper.UserRepositoryMapper;
import com.dock.service.RepoService;
import com.dock.utils.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/8 8:15
 * @version:1.0
 */
@Transactional
@Service
public class RepoServiceImpl implements RepoService {
    @Resource
    private RepositoryMapper repositoryMapper;
    @Resource
    private UserRepositoryMapper userRepositoryMapper;
    @Override
    public void addRepo(RepoDto repoDto) {
        Repository repository = new Repository();
        repository.setRepoAddress(repoDto.getRepoAddress());
        repository.setRepoArea(repoDto.getRepoArea());
        repository.setRepoDesc(repoDto.getRepoDesc());
        repository.setRepoName(repoDto.getRepoName());
        repository.setRepoStatus(repoDto.getRepoStatus());
        repository.setCreateTime(repoDto.getCreateTime());
        repository.setIsDelete(repoDto.getIsDelete());
        repositoryMapper.addRepository(repository);
        UserRepository userRepository = new UserRepository();
        userRepository.setRepoId(repository.getRepoId());
        userRepository.setUserId(repoDto.getUserId());
        userRepository.setCreateTime(repoDto.getCreateTime());
        userRepository.setIsDelete(repoDto.getIsDelete());
        userRepositoryMapper.addUserRepo(userRepository);
    }

    @Override
    public void deleteRepo(List repoIdList) {
        repositoryMapper.deleteRepository(repoIdList);
    }

    @Override
    public void updateRepo(RepoDto repoDto) {
        Repository repository = new Repository();
        repository.setRepoAddress(repoDto.getRepoAddress());
        repository.setRepoArea(repoDto.getRepoArea());
        repository.setRepoDesc(repoDto.getRepoDesc());
        repository.setRepoName(repoDto.getRepoName());
        repository.setRepoStatus(repoDto.getRepoStatus());
        repository.setCreateTime(repoDto.getCreateTime());
        repository.setIsDelete(repoDto.getIsDelete());
        repository.setRepoId(repoDto.getRepoId());
        repositoryMapper.updateRepository(repository);
    }

    @Override
    public Page getRepoPage(Integer pageNo, Integer pageSize, String repoName, Date start, Date end) {
        PageHelper.startPage(pageNo,pageSize);
        List<Repository> repositoryList = repositoryMapper.getRepositoryList(repoName, start, end);
        PageInfo<Repository> repositoryPageInfo = new PageInfo<>(repositoryList);
        return PageUtils.getPage(repositoryPageInfo);
    }

    @Override
    public List<Repository> showRepoList(String repoName) {
        return repositoryMapper.getRepositoryList(repoName,null,null);
    }
}
