package com.dock.service;

import com.dock.entity.Carrier;
import com.dock.entity.Page;

import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/7 14:12
 * @version:1.0
 */
public interface CarrierService {
    /**
     * 添加
     */
    void addCarrier(Carrier carrier);
    /**
     * 删除
     */
    void deleteCarrier(List carrierIdList);
    /**
     * 更新
     */
    void updateCarrier(Carrier carrier);
    /**
     * 分页展示
     */
    Page getCarrierPage(Integer pageNo,Integer pageSize);
}
