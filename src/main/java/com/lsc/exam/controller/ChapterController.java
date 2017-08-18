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
import com.lsc.exam.service.api.TbChapterService;
import com.lsc.exam.service.api.TbLessonService;
import com.lsc.exam.service.api.TbQuestionsService;

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
@Api(value = "章节管理",description = "章节管理")
@RequestMapping("/chapter")
public class ChapterController extends BaseController {

    private static Logger _log = LoggerFactory.getLogger(ChapterController.class);
    @Autowired
    private TbChapterService tbChapterService;
    @Autowired
    private TbQuestionsService questionsService;

    @ApiOperation(value = "查看章节")
    @ResponseBody
    @RequestMapping(value = "/querychapter")
    public BaseResult querychapter(TbChapter chapter,
                                  @RequestParam(required=false,defaultValue = "1" ,value = "page") int page,
                                  HttpServletRequest request){
        TbChapterExample tbChapterExample = new TbChapterExample();
        TbChapterExample.Criteria criteria = tbChapterExample.createCriteria();
        TbQuestionsExample tbQuestionsExample = new TbQuestionsExample();
        tbQuestionsExample.createCriteria().andLessonidEqualTo(chapter.getLessonid());
        if(chapter.getId() != null){
            criteria.andIdEqualTo(chapter.getId());
        }if(chapter.getLessonid() != null){
            criteria.andLessonidEqualTo(chapter.getLessonid());
        }
        int rows = 10;
        tbChapterExample.setOffset((page - 1) * rows);
        tbChapterExample.setLimit(rows);
        List<TbChapter> tbLessons = tbChapterService.selectByExample(tbChapterExample);
        int count = questionsService.countByExample(tbQuestionsExample);
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
    @RequestMapping(value = "/insertchapter")
    public BaseResult insertchapter(TbChapter chapter){
        TbChapterExample tbChapterExample = new TbChapterExample();
        TbChapterExample.Criteria criteria = tbChapterExample.createCriteria();
        criteria.andChapternameEqualTo(chapter.getChaptername());
        TbChapter tbchapter = tbChapterService.selectFirstByExample(tbChapterExample);
        if(tbchapter == null){
        	tbchapter = new TbChapter();
            tbchapter.setStatus(BaseConstants.ALLOW);
            tbchapter.setLessonid(chapter.getLessonid());
            tbchapter.setChaptername(chapter.getChaptername());
            int count = tbChapterService.insertSelective(tbchapter);
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
    @RequestMapping(value = "/editchapter")
    public BaseResult editchapter(TbChapter chapter){
        int count = tbChapterService.updateByPrimaryKey(chapter);
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
    @RequestMapping(value = "/removechapter")
    public BaseResult removechapter(TbChapter chapter){
        chapter.setStatus(BaseConstants.NOTALLOW);
        int count = tbChapterService.updateByPrimaryKey(chapter);
        if(count == 1){
            BaseResult result = new BaseResult(ResultEnum.SUCCESS,null);
            return result;
        }else {
            BaseResult result = new BaseResult(ResultEnum.FAILED_UPDATE,null);
            return result;
        }
    }
}
