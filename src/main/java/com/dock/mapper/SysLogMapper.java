package com.dock.mapper;

import com.dock.entity.SysLog;

import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/8 19:26
 * @version:1.0
 */
public interface SysLogMapper {
    /**
     * 插入日志
     */
    void addSysLog(SysLog sysLog);
    /**
     * 查询所有日志
     */
    List<SysLog> getSysLogList();
    /**
     * 删除所有
     */
    void deleteAll();
}
