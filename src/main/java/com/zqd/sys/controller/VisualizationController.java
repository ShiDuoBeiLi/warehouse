package com.zqd.sys.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zqd.bus.entity.Goods;
import com.zqd.bus.entity.InportAggr;
import com.zqd.bus.entity.SalesAggr;
import com.zqd.bus.service.IGoodsService;
import com.zqd.bus.service.IInportVisualizationService;
import com.zqd.bus.service.ISalesVisualizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("visualization")
public class VisualizationController {

    @Autowired
    private IInportVisualizationService inportVisualizationService;
    @Autowired
    private ISalesVisualizationService salesVisualizationService;
    @Autowired
    private IGoodsService goodsService;

    /**
     * 入库货物统计
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping("delivery")
    public List<InportAggr> v1(){
        QueryWrapper<InportAggr> queryWrapper = new QueryWrapper<InportAggr>();
        queryWrapper.select("goodsid, sum(number) as sum")
                .groupBy("goodsid");
        List<Map<String, Object>> mapList = inportVisualizationService.listMaps(queryWrapper);
        System.out.println(mapList);
        List<InportAggr> aggrList = new ArrayList<>();
        for (Map<String, Object> map : mapList){
            InportAggr inportAggr = new InportAggr();

            int goodsid = (int)map.get("goodsid");
            int sum = Integer.parseInt(String.valueOf(map.get("sum")));
            inportAggr.setGoodsid(goodsid);
            inportAggr.setSum(sum);
            Goods goods = goodsService.getById(goodsid);
            if (goods!=null){
                //设置货物名称
                inportAggr.setGoodsname(goods.getGoodsname());
            }
            aggrList.add(inportAggr);
        }

        System.out.println(mapList);
        System.out.println(aggrList);
        return aggrList;

    }

    /**
     * 出库货物统计
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping("outbound")
    public List<SalesAggr> v2(){
        QueryWrapper<SalesAggr> queryWrapper = new QueryWrapper<SalesAggr>();
        queryWrapper.select("goodsid, sum(number) as sum")
                .groupBy("goodsid");
        List<Map<String, Object>> mapList = salesVisualizationService.listMaps(queryWrapper);
        System.out.println(mapList);
        List<SalesAggr> aggrList = new ArrayList<>();
        for (Map<String, Object> map : mapList){
            SalesAggr salesAggr = new SalesAggr();

            int goodsid = (int)map.get("goodsid");
            int sum = Integer.parseInt(String.valueOf(map.get("sum")));
            salesAggr.setGoodsid(goodsid);
            salesAggr.setSum(sum);
            Goods goods = goodsService.getById(goodsid);
            if (goods!=null){
                //设置货物名称
                salesAggr.setGoodsname(goods.getGoodsname());
            }
            aggrList.add(salesAggr);
        }

        System.out.println(mapList);
        System.out.println(aggrList);
        return aggrList;

    }
}
