package com.zqd.bus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zqd.bus.entity.Goods;
import com.zqd.bus.entity.Sales;
import com.zqd.bus.mapper.GoodsMapper;
import com.zqd.bus.mapper.SalesMapper;
import com.zqd.bus.service.ISalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class SalesServiceImpl extends ServiceImpl<SalesMapper, Sales> implements ISalesService {

    @Autowired
    private GoodsMapper goodsMapper;

    /**
     * 添加货物销售
     * @param entity    货物销售实体类
     * @return
     */
    @Override
    public boolean save(Sales entity) {
        Goods goods = goodsMapper.selectById(entity.getGoodsid());
        goods.setNumber(goods.getNumber()-entity.getNumber());
        //更新货物的库存信息
        goodsMapper.updateById(goods);
        return super.save(entity);
    }

    /**
     * 更新货物销售
     * @param entity    货物销售实体类
     * @return
     */
    @Override
    public boolean updateById(Sales entity) {
        //根据销售单ID查询销售单信息
        Sales sales = baseMapper.selectById(entity.getId());
        Goods goods = goodsMapper.selectById(entity.getGoodsid());
        //仓库货物数量=原库存-销售单修改之前的数量+修改之后的数量
        //     80  +40 -  50     30
        goods.setNumber(goods.getNumber()+sales.getNumber()-entity.getNumber());
        //更新货物
        goodsMapper.updateById(goods);
        return super.updateById(entity);
    }

    /**
     * 删除货物销售信息
     * @param id    货物销售单ID
     * @return
     */
    @Override
    public boolean removeById(Serializable id) {
        //根据货物销售单ID查询出销售单数据
        Sales sales = baseMapper.selectById(id);
        Goods goods = goodsMapper.selectById(sales.getGoodsid());
        //仓库货物数量=原库存+删除货物销售单的数量
        goods.setNumber(goods.getNumber()+sales.getNumber());
        goodsMapper.updateById(goods);
        return super.removeById(id);
    }
}
