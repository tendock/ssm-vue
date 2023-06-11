package com.dock.controller;

import com.dock.entity.Carrier;
import com.dock.entity.Result;
import com.dock.service.CarrierService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/7 14:16
 * @version:1.0
 */
@Controller
@ResponseBody
@CrossOrigin
public class CarrierController {
    @Resource
    private CarrierService carrierService;
    @RequestMapping(value = "carrierList")
    public Result carrierList(Integer pageNo,Integer pageSize){
        return new Result(carrierService.getCarrierPage(pageNo,pageSize));
    }
    @RequestMapping(value = "carrierAdd")
    public Result carrierAdd(@RequestBody Carrier carrier){
        carrierService.addCarrier(carrier);
        return new Result();
    }
    @RequestMapping(value = "carrierDelete")
    public Result carrierDelete(@RequestBody List<Integer> carrierIdList){
        carrierService.deleteCarrier(carrierIdList);
        return new Result();
    }
    @RequestMapping(value = "carrierUpdate")
    public Result carrierUpdate(@RequestBody Carrier carrier){
        carrierService.updateCarrier(carrier);
        return new Result();
    }
}
