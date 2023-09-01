package com.zqd.bus.mapper;

import com.zqd.bus.entity.Inport;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

public interface InportMapper extends BaseMapper<Inport> {

    List<Inport> loadAllWarningDate();
}
