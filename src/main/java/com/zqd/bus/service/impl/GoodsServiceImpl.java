package com.zqd.bus.service.impl;

import com.zqd.bus.entity.Goods;
import com.zqd.bus.mapper.GoodsMapper;
import com.zqd.bus.service.IGoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Service
@Transactional
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {

    @Override
    public boolean save(Goods entity) {
        return super.save(entity);
    }

    @Override
    public boolean updateById(Goods entity) {
        return super.updateById(entity);
    }

    @Override
    public boolean removeById(Serializable id) {
        return super.removeById(id);
    }

    @Override
    public Goods getById(Serializable id) {
        return super.getById(id);
    }

    @Override
    public void deleteGoodsById(Integer id) {
        //根据货物id删除货物销售信息
        this.getBaseMapper().deleteSaleByGoodsId(id);
        //根据货物id删除货物销售退货信息
        this.getBaseMapper().deleteSaleBackByGoodsId(id);
        //根据货物id删除货物进货信息
        this.getBaseMapper().deleteInportByGoodsId(id);
        //根据货物id删除货物退货信息
        this.getBaseMapper().deleteOutportByGoodsId(id);
        //删除货物信息
        this.removeById(id);
    }

    /**
     * 查询所有库存预警货物
     * @return
     */
    @Override
    public List<Goods> loadAllWarning() {
        List<Goods> goods = baseMapper.loadAllWarning();
        return goods;
    }
}
