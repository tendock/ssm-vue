package com.dock.mapper;

import com.dock.entity.Source;

import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/5 16:02
 * @version:1.0
 */
public interface SourceMapper {
    /**
     * 添加来源
     */
    void addSource(Source source);
    /**
     * 删除来源
     */
    void deleteSource(List sourceIdList);
    /**
     * 更新来源
     */
    void updateSource(Source source);
    /**
     * 查询全部
     */
    List<Source> getSource();
    /**
     * 根据id查询来源
     */
    Source getSourceById(Integer sourceId);
}
