package com.zqd.bus.service;

import com.zqd.bus.entity.Inport;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface IInportService extends IService<Inport> {

    List<Inport> loadAllWarningDate();
}
