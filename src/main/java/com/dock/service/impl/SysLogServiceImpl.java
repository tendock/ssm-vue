package com.dock.service.impl;

import com.dock.entity.Page;
import com.dock.entity.SysLog;
import com.dock.mapper.SysLogMapper;
import com.dock.service.SysLogService;
import com.dock.utils.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/8 19:31
 * @version:1.0
 */
@Transactional
@Service
public class SysLogServiceImpl implements SysLogService {
    @Resource
    private SysLogMapper sysLogMapper;
    @Override
    public void addSysLog(SysLog sysLog) {
        sysLogMapper.addSysLog(sysLog);
    }

    @Override
    public Page showLogPage(Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<SysLog> sysLogList = sysLogMapper.getSysLogList();
        PageInfo<SysLog> sysLogPageInfo = new PageInfo<>(sysLogList);
        return PageUtils.getPage(sysLogPageInfo);
    }

    @Override
    public void deleteAll() {
        sysLogMapper.deleteAll();
    }
}
