package com.lsc.exam.service.impl;

import com.lsc.exam.annotation.BaseService;
import com.lsc.exam.base.BaseServiceImpl;
import com.lsc.exam.dao.mapper.TbUserMapper;
import com.lsc.exam.dao.model.TbUser;
import com.lsc.exam.dao.model.TbUserExample;
import com.lsc.exam.service.api.TbUserService;
//import com.sun.prism.impl.Disposer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.Method;
import java.util.List;

/**
* TbUserService实现
* Created by shuzheng on 2017/5/2.
*/
@Service
@Transactional
//@BaseService
public class TbUserServiceImpl extends BaseServiceImpl<TbUserMapper, TbUser, TbUserExample> implements TbUserService {
    @Autowired
    private TbUserMapper tbUserMapper;
    @Autowired
    public void setBaseMapper(){
        super.setBaseMapper(tbUserMapper);
    }

    private static Logger _log = LoggerFactory.getLogger(TbUserServiceImpl.class);

/*    public TbUser selectFirstByExample(TbUserExample example) {
        try {
            Method selectByExample = mapper.getClass().getDeclaredMethod("selectByExample", example.getClass());
            List<TbUser> result = (List<TbUser>) selectByExample.invoke(mapper, example);
            if (null != result && result.size() > 0) {
                return result.get(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }*/

}