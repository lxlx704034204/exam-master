package com.lsc.exam.service.impl;

import com.lsc.exam.annotation.BaseService;
import com.lsc.exam.base.BaseServiceImpl;
import com.lsc.exam.dao.mapper.TbRuleMapper;
import com.lsc.exam.dao.model.TbRule;
import com.lsc.exam.dao.model.TbRuleExample;
import com.lsc.exam.service.api.TbRuleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* TbRuleService实现
* Created by shuzheng on 2017/5/6.
*/
@Service
@Transactional
@BaseService
public class TbRuleServiceImpl extends BaseServiceImpl<TbRuleMapper, TbRule, TbRuleExample> implements TbRuleService {

    private static Logger _log = LoggerFactory.getLogger(TbRuleServiceImpl.class);

    @Autowired
    TbRuleMapper tbRuleMapper;
    @Autowired
    public void setBaseMapper(){
        super.setBaseMapper(tbRuleMapper);
    }

}