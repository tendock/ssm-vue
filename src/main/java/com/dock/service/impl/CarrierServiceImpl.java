package com.dock.service.impl;

import com.dock.entity.Carrier;
import com.dock.entity.Page;
import com.dock.mapper.CarrierMapper;
import com.dock.service.CarrierService;
import com.dock.utils.PageUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/7 14:14
 * @version:1.0
 */
@Transactional
@Service
public class CarrierServiceImpl implements CarrierService {
    @Resource
    private CarrierMapper carrierMapper;
    @Override
    public void addCarrier(Carrier carrier) {
        carrierMapper.addCarrier(carrier);
    }

    @Override
    public void deleteCarrier(List carrierIdList) {
        carrierMapper.deleteCarrier(carrierIdList);
    }

    @Override
    public void updateCarrier(Carrier carrier) {
        carrierMapper.updateCarrier(carrier);
    }

    @Override
    public Page getCarrierPage(Integer pageNo, Integer pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Carrier> carrierList = carrierMapper.getCarrierList();
        PageInfo<Carrier> carrierPageInfo = new PageInfo<>(carrierList);
        return PageUtils.getPage(carrierPageInfo);
    }
}
