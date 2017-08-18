package com.lsc.exam.controller;

import com.lsc.exam.base.BaseConstants;
import com.lsc.exam.base.BaseController;
import com.lsc.exam.base.BaseResult;
import com.lsc.exam.base.ResultEnum;
import com.lsc.exam.dao.mapper.TbUserMapper;
import com.lsc.exam.dao.model.TbUser;
import com.lsc.exam.dao.model.TbUserExample;
import com.lsc.exam.service.api.TbUserService;
import com.lsc.exam.service.impl.TbUserServiceImpl;
import com.lsc.exam.util.MD5Util;
import com.lsc.exam.util.SessionUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.lang.reflect.Method;
import java.util.List;

/**
 * Created by Administrator on 2017/4/30.
 */
@Controller
@Api(value = "考试管理系统", description = "考试管理系统")
@RequestMapping("/system")
public class IndexController extends BaseController {

    private static Logger _log = LoggerFactory.getLogger(IndexController.class);
    @Autowired
    private TbUserService tbUserService;


    /** http://localhost:1111/   登陆
     *  http://localhost:1111/system/login   //post ---> get
     *
     * @param user(cardno,profession,pwd)
     * @param requset
     * @return result
     */
    @ApiOperation(value = "登陆")
    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public BaseResult login(TbUser user, HttpServletRequest requset) {
        System.out.println("----test-0-login(...)---: "+ tbUserService ); //com.lsc.exam.service.impl.TbUserServiceImpl@6f7bb777

//        TbUser tbUser1 = tbUserService.selectByPrimaryKey("1");
//        System.out.println("----test-0.1-login(...)---: " + tbUser1); //




        TbUserExample tbUserExample = new TbUserExample();

//        tbUserExample.createCriteria()
//                .andCardnoEqualTo(user.getCardno()).andProfessionEqualTo(user.getProfession())                  //  0  "1"
////                .andPwdEqualTo(MD5Util.MD5(user.getCardno()+user.getPwd()+BaseConstants.MD5_PWD_KEY));
//                .andPwdEqualTo(MD5Util.MD5(user.getCardno()+user.getPwd()+BaseConstants.MD5_PWD_KEY)); //"C991872DBD4325F54856228340E51C8E"

        String name = requset.getParameter("name");
        String pwd = requset.getParameter("pwd");
        System.out.println("----test-1-login(...)---: "+name ); // admin
        System.out.println("----test-2-login(...)---: "+pwd ); // 123
        tbUserExample.createCriteria()
                .andNameEqualTo(name).andPwdEqualTo(pwd);

        TbUser tbUser = tbUserService.selectFirstByExample(tbUserExample);

        System.out.println("----test-3-login(...)--tbUser-: " + tbUser); //
        if(tbUser != null){
            BaseResult result = new BaseResult(ResultEnum.SUCCESS,tbUser);
            /*SessionUtil.setAttribute(requset,BaseConstants.SESSION_KEY_OBJ_USER_BEAN,tbUser);*/
            return result;
        }else{
            BaseResult result = new BaseResult(ResultEnum.NOTEXIST,null);
            return result;
        }

//        return null;
    }

    @ApiOperation(value = "注销")
    @ResponseBody
    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public BaseResult logout(HttpServletRequest requset) {
        Boolean isSuccess = SessionUtil.removeAttribute(requset, BaseConstants.SESSION_KEY_OBJ_USER_BEAN);
        if(isSuccess){
            BaseResult result = new BaseResult(ResultEnum.SUCCESS,null);
            return result;
        }else {
            BaseResult result = new BaseResult(ResultEnum.NOTEXIST,null);
            return result;
        }

    }


}
