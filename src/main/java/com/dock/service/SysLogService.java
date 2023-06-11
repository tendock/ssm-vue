package com.dock.service;

import com.dock.entity.Page;
import com.dock.entity.SysLog;

/**
 * @author:XuJianYuan
 * @date:2023/6/8 19:30
 * @version:1.0
 */
public interface SysLogService {
    /**
     * 添加
     */
    void addSysLog(SysLog sysLog);
    /**
     * 分页
     */
    Page showLogPage(Integer pageNo,Integer pageSize);
    /**
     * 删除所有
     */
    void deleteAll();
}
