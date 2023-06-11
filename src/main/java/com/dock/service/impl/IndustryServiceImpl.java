package com.dock.service.impl;

import com.dock.entity.Industry;
import com.dock.entity.Page;
import com.dock.mapper.IndustryMapper;
import com.dock.service.IndustryService;
import com.dock.utils.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/5 17:43
 * @version:1.0
 */
@Transactional
@Service
public class IndustryServiceImpl implements IndustryService {
    @Resource
    private IndustryMapper industryMapper;
    @Override
    public void addIndustry(Industry industry) {
        industryMapper.addIndustry(industry);
    }

    @Override
    public void deleteIndustry(List indutryIdList) {
        industryMapper.deleteIndustry(indutryIdList);
    }

    @Override
    public void updateIndustry(Industry industry) {
        industryMapper.updateIndustry(industry);
    }

    @Override
    public Page getIndustryPage(Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Industry> industryList = industryMapper.getIndustryList();
        PageInfo<Industry> industryPageInfo = new PageInfo<>(industryList);
        return PageUtils.getPage(industryPageInfo);
    }

    @Override
    public List<Industry> getIndustryList() {
        return industryMapper.getIndustryList();
    }
}
