package com.lsc.exam.service.impl;

import com.lsc.exam.annotation.BaseService;
import com.lsc.exam.base.BaseServiceImpl;
import com.lsc.exam.dao.mapper.TbChapterMapper;
import com.lsc.exam.dao.model.TbChapter;
import com.lsc.exam.dao.model.TbChapterExample;
import com.lsc.exam.service.api.TbChapterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* TbChapterService实现
* Created by shuzheng on 2017/4/30.
*/
@Service
@Transactional
@BaseService
public class TbChapterServiceImpl extends BaseServiceImpl<TbChapterMapper, TbChapter, TbChapterExample> implements TbChapterService {

    private static Logger _log = LoggerFactory.getLogger(TbChapterServiceImpl.class);

    @Autowired
    TbChapterMapper tbChapterMapper;
    @Autowired
    public void setBaseMapper(){
        super.setBaseMapper(tbChapterMapper);
    }
}