package com.lsc.exam.service.impl;

import com.lsc.exam.annotation.BaseService;
import com.lsc.exam.base.BaseServiceImpl;
import com.lsc.exam.dao.mapper.TbLessonMapper;
import com.lsc.exam.dao.model.TbLesson;
import com.lsc.exam.dao.model.TbLessonExample;
import com.lsc.exam.service.api.TbLessonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* TbLessonService实现
* Created by shuzheng on 2017/4/30.
*/
@Service
@Transactional
@BaseService
public class TbLessonServiceImpl extends BaseServiceImpl<TbLessonMapper, TbLesson, TbLessonExample> implements TbLessonService {

    private static Logger _log = LoggerFactory.getLogger(TbLessonServiceImpl.class);

    @Autowired
    TbLessonMapper tbLessonMapper;
    @Autowired
    public void setBaseMapper(){
        super.setBaseMapper(tbLessonMapper);
    }
}