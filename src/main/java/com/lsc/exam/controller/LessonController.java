package com.lsc.exam.controller;

import com.lsc.exam.base.BaseConstants;
import com.lsc.exam.base.BaseController;
import com.lsc.exam.base.BaseResult;
import com.lsc.exam.base.ResultEnum;
import com.lsc.exam.dao.model.TbLesson;
import com.lsc.exam.dao.model.TbLessonExample;
import com.lsc.exam.dao.model.TbUser;
import com.lsc.exam.dao.model.TbUserExample;
import com.lsc.exam.service.api.TbLessonService;
import com.lsc.exam.service.api.TbUserService;
import com.lsc.exam.util.MD5Util;
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
import java.util.UUID;

/**
 * Created by Administrator on 2017/5/2.
 */
@Controller
@Api(value = "课程管理",description = "课程管理")
@RequestMapping("/lesson")
public class LessonController extends BaseController {

    private static Logger _log = LoggerFactory.getLogger(LessonController.class);
    @Autowired
    private TbLessonService tbLessonService;

    @ApiOperation(value = "查看课程")
    @ResponseBody
    @RequestMapping(value = "/queryLesson")
    public BaseResult queryLesson(TbLesson lesson,
                                @RequestParam(required=false,defaultValue = "1" ,value = "page") int page,
                                HttpServletRequest request){
        TbLessonExample tbLessonExample = new TbLessonExample();
        TbLessonExample.Criteria criteria = tbLessonExample.createCriteria().andStatusEqualTo(BaseConstants.ALLOW);
        if(lesson.getId() != null){
            criteria.andIdEqualTo(lesson.getId());
        }if(lesson.getName() != null){
            criteria.andNameEqualTo(lesson.getName());
        }
        int rows = 10;
        tbLessonExample.setOffset((page - 1) * rows);
        tbLessonExample.setLimit(rows);
        List<TbLesson> tbLessons = tbLessonService.selectByExample(tbLessonExample);
        if(tbLessons !=null){
            BaseResult result = new BaseResult(ResultEnum.SUCCESS,tbLessons);
            return result;
        }else {
            BaseResult result = new BaseResult(ResultEnum.NOTEXIST,null);
            return result;
        }
    }

    @ApiOperation(value = "添加课程")
    @ResponseBody
    @RequestMapping(value = "/insertLesson")
    public BaseResult insertLesson(TbLesson lesson){
        TbLessonExample tbLessonExample = new TbLessonExample();
        TbLessonExample.Criteria criteria = tbLessonExample.createCriteria();
        criteria.andNameEqualTo(lesson.getName());
        TbLesson tbLesson = tbLessonService.selectFirstByExample(tbLessonExample);
        if(tbLesson == null){
        	tbLesson = new TbLesson();
        	tbLesson.setName(lesson.getName());
            tbLesson.setStatus(BaseConstants.ALLOW);
            int count = tbLessonService.insertSelective(tbLesson);
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
    @RequestMapping(value = "/editLesson")
    public BaseResult editLesson(TbLesson lesson){
        int count = tbLessonService.updateByPrimaryKey(lesson);
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
    @RequestMapping(value = "/removeLesson")
    public BaseResult removeLesson(TbLesson lesson){
        lesson.setStatus(BaseConstants.NOTALLOW);
        int count = tbLessonService.updateByPrimaryKeySelective(lesson);
        if(count == 1){
            BaseResult result = new BaseResult(ResultEnum.SUCCESS,null);
            return result;
        }else {
            BaseResult result = new BaseResult(ResultEnum.FAILED_UPDATE,null);
            return result;
        }
    }
}
