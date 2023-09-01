package com.zqd.bus.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zqd.bus.entity.Goods;

import java.util.List;

public interface IGoodsService extends IService<Goods> {

    /**
     * 根据货物id删除货物
     * @param id
     */
    void deleteGoodsById(Integer id);

    /**
     * 加载所有的库存预警货物
     * @return
     */
    List<Goods> loadAllWarning();
}
