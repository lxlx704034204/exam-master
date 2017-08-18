package com.lsc.exam.service.impl;

import com.lsc.exam.annotation.BaseService;
import com.lsc.exam.base.BaseServiceImpl;
import com.lsc.exam.dao.mapper.TbQuestionsMapper;
import com.lsc.exam.dao.model.TbQuestions;
import com.lsc.exam.dao.model.TbQuestionsExample;
import com.lsc.exam.service.api.TbQuestionsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* TbQuestionsService实现
* Created by shuzheng on 2017/4/30.
*/
@Service
@Transactional
@BaseService
public class TbQuestionsServiceImpl extends BaseServiceImpl<TbQuestionsMapper, TbQuestions, TbQuestionsExample> implements TbQuestionsService {

    private static Logger _log = LoggerFactory.getLogger(TbQuestionsServiceImpl.class);

    @Autowired
    TbQuestionsMapper tbQuestionsMapper;
    @Autowired
    public void setBaseMapper(){
        super.setBaseMapper(tbQuestionsMapper);
    }
}