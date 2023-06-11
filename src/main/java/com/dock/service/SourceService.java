package com.dock.service;

import com.dock.entity.Page;
import com.dock.entity.Source;

import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/5 16:13
 * @version:1.0
 */
public interface SourceService {
    /**
     * 添加
     */
    void addSource(Source source);
    /**
     * 删除
     */
    void deleteSource(List sourceIdList);
    /**
     * 更新
     */
    void updateSource(Source source);
    /**
     * 查询
     */
    Page getSourcePage(Integer pageNo,Integer pageSize);
    /**
     * 展示所有
     */
    List<Source> getSourceList();
}
