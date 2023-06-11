package com.dock.service;

import com.dock.entity.Industry;
import com.dock.entity.Page;

import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/5 17:41
 * @version:1.0
 */
public interface IndustryService {
    /**
     * 添加
     */
    void addIndustry(Industry industry);
    /**
     * 删除
     */
    void deleteIndustry(List indutryIdList);
    /**
     * 修改
     */
    void updateIndustry(Industry industry);
    /**
     * 分页展示
     */
    Page getIndustryPage(Integer pageNo,Integer pageSize);
    /**
     * 查询所有行业
     */
    List<Industry> getIndustryList();
}
