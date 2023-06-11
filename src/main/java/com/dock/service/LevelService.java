package com.dock.service;

import com.dock.entity.Level;
import com.dock.entity.Page;

import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/5 13:09
 * @version:1.0
 */
public interface LevelService {
    /**
     * 添加
     */
    void addLevel(Level level);
    /**
     * 删除
     */
    void deleteLevel(List levelIdList);
    /**
     * 更新
     */
    void updateLevel(Level level);
    /**
     * 分页展示
     */
    Page showLevelPage(Integer pageNo,Integer pageSize);
    /**
     * 展示所有
     */
    List<Level> getLevelList();
}
