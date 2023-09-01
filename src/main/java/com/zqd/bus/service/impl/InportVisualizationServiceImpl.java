package com.zqd.bus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zqd.bus.entity.InportAggr;
import com.zqd.bus.mapper.InportVisualizationMapper;
import com.zqd.bus.service.IInportVisualizationService;
import org.springframework.stereotype.Service;

@Service
public class InportVisualizationServiceImpl extends ServiceImpl<InportVisualizationMapper, InportAggr> implements IInportVisualizationService {
}
