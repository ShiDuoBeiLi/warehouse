package com.zqd.sys.service.impl;

import com.zqd.sys.entity.Notice;
import com.zqd.sys.mapper.NoticeMapper;
import com.zqd.sys.service.INoticeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class NoticeServiceImpl extends ServiceImpl<NoticeMapper, Notice> implements INoticeService {

}
