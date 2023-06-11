package com.dock.service.impl;

import com.dock.entity.Page;
import com.dock.entity.Source;
import com.dock.mapper.SourceMapper;
import com.dock.service.SourceService;
import com.dock.utils.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.Resource;
import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/5 16:15
 * @version:1.0
 */
@Transactional
@Service
public class SourceServiceImpl implements SourceService {
    @Resource
    private SourceMapper sourceMapper;
    @Override
    public void addSource(Source source) {
        sourceMapper.addSource(source);
    }

    @Override
    public void deleteSource(List sourceIdList) {
        sourceMapper.deleteSource(sourceIdList);
    }

    @Override
    public void updateSource(Source source) {
        sourceMapper.updateSource(source);
    }

    @Override
    public Page getSourcePage(Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Source> source = sourceMapper.getSource();
        PageInfo<Source> sourcePageInfo = new PageInfo<>(source);
        return PageUtils.getPage(sourcePageInfo);
    }

    @Override
    public List<Source> getSourceList() {
        return sourceMapper.getSource();
    }
}
