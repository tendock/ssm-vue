package com.dock.mapper;

import com.dock.entity.Industry;

import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/5 17:32
 * @version:1.0
 */
public interface IndustryMapper {
    /**
     * 添加
     */
    void addIndustry(Industry industry);
    /**
     * 删除
     */
    void deleteIndustry(List industryIdList);
    /**
     * 更新
     */
    void updateIndustry(Industry industry);
    /**
     * 查询所有
     */
    List<Industry> getIndustryList();
    /**
     * 根据id查询行业
     */
    Industry getIndustryById(Integer industryId);
}
