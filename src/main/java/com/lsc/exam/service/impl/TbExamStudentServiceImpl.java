package com.lsc.exam.service.impl;

import com.lsc.exam.annotation.BaseService;
import com.lsc.exam.base.BaseServiceImpl;
import com.lsc.exam.dao.mapper.TbExamStudentMapper;
import com.lsc.exam.dao.model.TbExamStudent;
import com.lsc.exam.dao.model.TbExamStudentExample;
import com.lsc.exam.service.api.TbExamStudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* TbExamStudentService实现
* Created by shuzheng on 2017/5/6.
*/
@Service
@Transactional
@BaseService
public class TbExamStudentServiceImpl extends BaseServiceImpl<TbExamStudentMapper, TbExamStudent, TbExamStudentExample> implements TbExamStudentService {

    private static Logger _log = LoggerFactory.getLogger(TbExamStudentServiceImpl.class);

    @Autowired
    TbExamStudentMapper tbExamStudentMapper;
    @Autowired
    public void setBaseMapper(){
        super.setBaseMapper(tbExamStudentMapper);
    }

}