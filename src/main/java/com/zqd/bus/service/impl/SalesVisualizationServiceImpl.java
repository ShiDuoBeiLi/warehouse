package com.zqd.bus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zqd.bus.entity.SalesAggr;
import com.zqd.bus.mapper.SalesVisualizationMapper;
import com.zqd.bus.service.ISalesVisualizationService;
import org.springframework.stereotype.Service;

@Service
public class SalesVisualizationServiceImpl extends ServiceImpl<SalesVisualizationMapper, SalesAggr> implements ISalesVisualizationService {
}
