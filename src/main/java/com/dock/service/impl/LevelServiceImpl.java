package com.dock.service.impl;

import com.dock.entity.Level;
import com.dock.entity.Page;
import com.dock.mapper.LevelMapper;
import com.dock.service.LevelService;
import com.dock.utils.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/5 13:11
 * @version:1.0
 */
@Service
@Transactional
public class LevelServiceImpl implements LevelService {
    @Resource
    private LevelMapper levelMapper;
    @Override
    public void addLevel(Level level) {
        levelMapper.levelAdd(level);
    }

    @Override
    public void deleteLevel(List levelIdList) {
        levelMapper.levelDelete(levelIdList);
    }

    @Override
    public void updateLevel(Level level) {
        levelMapper.levelUpdate(level);
    }

    @Override
    public Page showLevelPage(Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Level> levels = levelMapper.levelList();
        PageInfo<Level> levelPageInfo = new PageInfo<>(levels);
        return PageUtils.getPage(levelPageInfo);
    }

    @Override
    public List<Level> getLevelList() {
        return levelMapper.levelList();
    }
}
