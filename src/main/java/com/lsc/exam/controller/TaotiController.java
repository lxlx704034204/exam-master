package com.lsc.exam.controller;

import com.lsc.exam.base.BaseConstants;
import com.lsc.exam.base.BaseController;
import com.lsc.exam.base.BaseResult;
import com.lsc.exam.base.ResultEnum;
import com.lsc.exam.dao.model.TbChapter;
import com.lsc.exam.dao.model.TbChapterExample;
import com.lsc.exam.dao.model.TbLesson;
import com.lsc.exam.dao.model.TbLessonExample;
import com.lsc.exam.dao.model.TbQuestionsExample;
import com.lsc.exam.dao.model.TbTaoti;
import com.lsc.exam.dao.model.TbTaotiExample;
import com.lsc.exam.service.api.TbChapterService;
import com.lsc.exam.service.api.TbLessonService;
import com.lsc.exam.service.api.TbQuestionsService;
import com.lsc.exam.service.api.TbTaotiService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2017/5/2.
 */
@Controller
@Api(value = "套题管理",description = "套题管理")
@RequestMapping("/taoti")
public class TaotiController extends BaseController {

    private static Logger _log = LoggerFactory.getLogger(TaotiController.class);
    @Autowired
    private TbTaotiService taotiService;


    @ApiOperation(value = "查看套题")
    @ResponseBody
    @RequestMapping(value = "/queryTaoti")
    public BaseResult queryTaoti(TbTaoti taoti,
                                  @RequestParam(required=false,defaultValue = "1" ,value = "page") int page,
                                  HttpServletRequest request){
        TbTaotiExample tbTaotiExample = new TbTaotiExample();
        TbTaotiExample.Criteria criteria = tbTaotiExample.createCriteria();
        if(taoti.getId() != null){
            criteria.andIdEqualTo(taoti.getId());
        }if(taoti.getLessonid() != null){
            criteria.andLessonidEqualTo(taoti.getLessonid());
        }if(taoti.getName() != null){
            criteria.andNameEqualTo(taoti.getName());
        }
        int rows = 100;
        tbTaotiExample.setOffset((page - 1) * rows);
        tbTaotiExample.setLimit(rows);
        tbTaotiExample.setOrderByClause("JoinTime desc");
        List<TbTaoti> taotilist = taotiService.selectByExample(tbTaotiExample);
        if(taotilist !=null){
            BaseResult result = new BaseResult(ResultEnum.SUCCESS,taotilist);
            return result;
        }else {
            BaseResult result = new BaseResult(ResultEnum.NOTEXIST,null);
            return result;
        }
    }

    @ApiOperation(value = "添加套题")
    @ResponseBody
    @RequestMapping(value = "/insertTaoti")
    public BaseResult insertTaoti(TbTaoti taoti){
        TbTaotiExample tbTaotiExample = new TbTaotiExample();
        TbTaotiExample.Criteria criteria = tbTaotiExample.createCriteria();
        criteria.andNameEqualTo(taoti.getName());
        TbTaoti tt = taotiService.selectFirstByExample(tbTaotiExample);
        if(tt == null){
        	taoti.setStatus(BaseConstants.ALLOW);
            int count = taotiService.insertSelective(taoti);
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

    @ApiOperation(value = "编辑套题")
    @ResponseBody
    @RequestMapping(value = "/editTaoti")
    public BaseResult editchapter(TbTaoti taoti){
        int count = taotiService.updateByPrimaryKey(taoti);
        if(count == 1){
            BaseResult result = new BaseResult(ResultEnum.SUCCESS,null);
            return result;
        }else {
            BaseResult result = new BaseResult(ResultEnum.FAILED_UPDATE,null);
            return result;
        }
    }

    @ApiOperation(value = "删除套题")
    @ResponseBody
    @RequestMapping(value = "/removeTaoti")
    public BaseResult removechapter(TbTaoti taoti){
    	taoti.setStatus(BaseConstants.NOTALLOW);
        int count = taotiService.updateByPrimaryKey(taoti);
        if(count == 1){
            BaseResult result = new BaseResult(ResultEnum.SUCCESS,null);
            return result;
        }else {
            BaseResult result = new BaseResult(ResultEnum.FAILED_UPDATE,null);
            return result;
        }
    }
}
