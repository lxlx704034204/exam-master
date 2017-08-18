package com.lsc.exam.service.impl;

import com.lsc.exam.annotation.BaseService;
import com.lsc.exam.base.BaseServiceImpl;
import com.lsc.exam.dao.mapper.TbExamResultMapper;
import com.lsc.exam.dao.model.TbExamResult;
import com.lsc.exam.dao.model.TbExamResultExample;
import com.lsc.exam.service.api.TbExamResultService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* TbExamResultService实现
* Created by shuzheng on 2017/5/6.
*/
@Service
@Transactional
@BaseService
public class TbExamResultServiceImpl extends BaseServiceImpl<TbExamResultMapper, TbExamResult, TbExamResultExample> implements TbExamResultService {

    private static Logger _log = LoggerFactory.getLogger(TbExamResultServiceImpl.class);

    @Autowired
    TbExamResultMapper tbExamResultMapper;
    @Autowired
    public void setBaseMapper(){
        super.setBaseMapper(tbExamResultMapper);
    }

}