package com.lsc.exam.controller;

import com.lsc.exam.base.BaseConstants;
import com.lsc.exam.base.BaseController;
import com.lsc.exam.base.BaseResult;
import com.lsc.exam.base.ResultEnum;
import com.lsc.exam.dao.model.TbUser;
import com.lsc.exam.dao.model.TbUserExample;
import com.lsc.exam.service.api.TbUserService;
import com.lsc.exam.service.impl.TbUserServiceImpl;
import com.lsc.exam.util.MD5Util;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.UUID;

/** 登陆入口： IndexController
 * Created by Administrator on 2017/5/2.
 */
@Controller
@Api(value = "用户管理",description = "用户管理")
@RequestMapping("/user")
public class UserController extends BaseController {

    private static Logger _log = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private TbUserServiceImpl tbUserService;

    @ApiOperation(value = "查看用户")
    @ResponseBody
    @RequestMapping(value = "/queryUser")
    public BaseResult queryUser(TbUser user,
                                @RequestParam(required=false,defaultValue = "1" ,value = "page") int page,
                                HttpServletRequest request){
        TbUserExample tbUserExample = new TbUserExample();
        TbUserExample.Criteria criteria = tbUserExample.createCriteria().andStatusEqualTo(BaseConstants.ALLOW);
        if(user.getId() != null){
            criteria.andIdEqualTo(user.getId());
        }if(user.getName() != null){
            criteria.andNameEqualTo(user.getName());
        }if(user.getProfession() != null){
            criteria.andProfessionEqualTo(user.getProfession());
        }if(user.getCardno() != null){
            criteria.andCardnoEqualTo(user.getCardno());
        }
        int rows = 10;
        tbUserExample.setOffset((page - 1) * rows);
        tbUserExample.setLimit(rows);
        List<TbUser> tbUsers = tbUserService.selectByExample(tbUserExample);
        /*TbUser tbUsers = tbUserService.selectFirstByExample(tbUserExample);*/
        if(tbUsers !=null){
            BaseResult result = new BaseResult(ResultEnum.SUCCESS,tbUsers);
            return result;
        }else {
            BaseResult result = new BaseResult(ResultEnum.NOTEXIST,null);
            return result;
        }
    }
    /*
    // http://localhost:1111/system/login       showrole.html
    //  http://localhost:1111/html/showrole.html

    */

    @ApiOperation(value = "添加用户")
    @ResponseBody
    @RequestMapping(value = "/insertUser")
    public BaseResult insertUser(TbUser user){
        TbUserExample tbUserExample = new TbUserExample();
        TbUserExample.Criteria criteria = tbUserExample.createCriteria();
        criteria.andCardnoEqualTo(user.getCardno());
        TbUser tbUser = tbUserService.selectFirstByExample(tbUserExample);
        if(tbUser == null){
            user.setId(UUID.randomUUID().toString().replace("-",""));
            user.setPwd(MD5Util.MD5(user.getCardno()+user.getCardno()+BaseConstants.MD5_PWD_KEY));
            user.setStatus(BaseConstants.ALLOW);
            int count = tbUserService.insertSelective(user);
            if(count == 1){
                BaseResult result = new BaseResult(ResultEnum.SUCCESS,null);
                return result;
            }else {
                BaseResult result = new BaseResult(ResultEnum.FAILED_INSERT,null);
                return result;
            }
        }else {
            BaseResult result = new BaseResult(ResultEnum.EXIST,null);
            return result;
        }
    }

    @ApiOperation(value = "编辑用户")
    @ResponseBody
    @RequestMapping(value = "/editUser")
    public BaseResult editUser(TbUser user){
        user.setPwd(MD5Util.MD5(user.getId()+user.getPwd()+BaseConstants.MD5_PWD_KEY));
        int count = tbUserService.updateByPrimaryKey(user);
        if(count == 1){
            BaseResult result = new BaseResult(ResultEnum.SUCCESS,null);
            return result;
        }else {
            BaseResult result = new BaseResult(ResultEnum.FAILED_UPDATE,null);
            return result;
        }
    }

    @ApiOperation(value = "删除用户")
    @ResponseBody
    @RequestMapping(value = "/removeUser")
    public BaseResult removeUser(TbUser user){
        user.setStatus(BaseConstants.NOTALLOW);
        int count = tbUserService.updateByPrimaryKeySelective(user);
        if(count == 1){
            BaseResult result = new BaseResult(ResultEnum.SUCCESS,null);
            return result;
        }else {
            BaseResult result = new BaseResult(ResultEnum.FAILED_UPDATE,null);
            return result;
        }
    }
}
