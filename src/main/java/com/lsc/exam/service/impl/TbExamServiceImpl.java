package com.lsc.exam.service.impl;

import com.lsc.exam.annotation.BaseService;
import com.lsc.exam.base.BaseServiceImpl;
import com.lsc.exam.dao.mapper.TbExamMapper;
import com.lsc.exam.dao.model.TbExam;
import com.lsc.exam.dao.model.TbExamExample;
import com.lsc.exam.service.api.TbExamService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* TbExamService实现
* Created by shuzheng on 2017/5/6.
*/
@Service
@Transactional
@BaseService
public class TbExamServiceImpl extends BaseServiceImpl<TbExamMapper, TbExam, TbExamExample> implements TbExamService {

    private static Logger _log = LoggerFactory.getLogger(TbExamServiceImpl.class);

    @Autowired
    TbExamMapper tbExamMapper;
    @Autowired
    public void setBaseMapper(){
        super.setBaseMapper(tbExamMapper);
    }

}