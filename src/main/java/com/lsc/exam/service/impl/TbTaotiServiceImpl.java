package com.lsc.exam.service.impl;

import com.lsc.exam.annotation.BaseService;
import com.lsc.exam.base.BaseServiceImpl;
import com.lsc.exam.dao.mapper.TbTaotiMapper;
import com.lsc.exam.dao.model.TbTaoti;
import com.lsc.exam.dao.model.TbTaotiExample;
import com.lsc.exam.service.api.TbTaotiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* TbTaotiService实现
* Created by shuzheng on 2017/4/30.
*/
@Service
@Transactional
@BaseService
public class TbTaotiServiceImpl extends BaseServiceImpl<TbTaotiMapper, TbTaoti, TbTaotiExample> implements TbTaotiService {

    private static Logger _log = LoggerFactory.getLogger(TbTaotiServiceImpl.class);

    @Autowired
    TbTaotiMapper tbTaotiMapper;
    @Autowired
    public void setBaseMapper(){
        super.setBaseMapper(tbTaotiMapper);
    }
}