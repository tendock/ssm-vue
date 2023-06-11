package com.dock.mapper;

import com.dock.entity.Level;

import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/5 12:56
 * @version:1.0
 */
public interface LevelMapper {
    /**
     * 添加
     */
    void levelAdd(Level level);
    /**
     * 删除
     */
    void levelDelete(List levelIdList);
    /**
     * 更新
     */
    void levelUpdate(Level level);
    /**
     * 查询
     */
    List<Level> levelList();
    /**
     * 根据id查询等级
     */
    Level getLevel(Integer levelId);
}
