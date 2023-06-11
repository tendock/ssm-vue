package com.dock.mapper;

import com.dock.entity.Carrier;

import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/7 14:02
 * @version:1.0
 */
public interface CarrierMapper {
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
     * 查询全部
     */
    List<Carrier> getCarrierList();
}
