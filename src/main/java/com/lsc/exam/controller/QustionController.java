package com.lsc.exam.controller;

import com.lsc.exam.base.BaseConstants;
import com.lsc.exam.base.BaseController;
import com.lsc.exam.base.BaseResult;
import com.lsc.exam.base.ResultEnum;
import com.lsc.exam.dao.model.TbChapter;
import com.lsc.exam.dao.model.TbChapterExample;
import com.lsc.exam.dao.model.TbQuestions;
import com.lsc.exam.dao.model.TbQuestionsExample;
import com.lsc.exam.service.api.TbChapterService;
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
@Api(value = "题目管理",description = "题目管理")
@RequestMapping("/question")
public class QustionController extends BaseController {
    private static Logger _log = LoggerFactory.getLogger(QustionController.class);
    @Autowired
    private TbQuestionsService tbQuestionsService;

    @ApiOperation(value = "查看题目")
    @ResponseBody
    @RequestMapping(value = "/queryquestion")
    public BaseResult querychapter(TbQuestions questions,
                                   @RequestParam(required=false,defaultValue = "1" ,value = "page") int page,
                                   HttpServletRequest request){
        TbQuestionsExample tbQuestionsExample= new TbQuestionsExample();
        TbQuestionsExample.Criteria criteria = tbQuestionsExample.createCriteria().andTypeEqualTo(questions.getType());
        if(questions.getId() != null){
            criteria.andIdEqualTo(questions.getId());
        }if(questions.getPointid() != null){
            criteria.andPointidEqualTo(questions.getPointid());
        }if(questions.getLessonid() != null){
            criteria.andLessonidEqualTo(questions.getLessonid());
        }
        int rows = 10;
        tbQuestionsExample.setOffset((page - 1) * rows);
        tbQuestionsExample.setLimit(rows);
        List<TbQuestions> tbQuestionses = tbQuestionsService.selectByExample(tbQuestionsExample);
        if(tbQuestionses !=null){
            BaseResult result = new BaseResult(ResultEnum.SUCCESS,tbQuestionses);
            return result;
        }else {
            BaseResult result = new BaseResult(ResultEnum.NOTEXIST,null);
            return result;
        }
    }

//    @ApiOperation(value = "添加问题")
//    @ResponseBody
//    @RequestMapping(value = "/insertquestion")
//    public BaseResult insertchapter(TbQuestions questions){
//        TbQuestionsExample tbQuestionsExample= new TbQuestionsExample();
//        TbQuestionsExample.Criteria criteria = tbQuestionsExample.createCriteria();
//        criteria.andStemEqualTo(questions.getStem());
//        TbQuestions tbQuestions = tbQuestionsService.selectFirstByExample(tbQuestionsExample);
//        if(tbQuestions == null){
//        	tbQuestions = new TbQuestions();
//            tbQuestions.setStatus(BaseConstants.ALLOW);
//            int count = tbQuestionsService.insertSelective(questions);
//            if(count == 1){
//                BaseResult result = new BaseResult(ResultEnum.SUCCESS,null);
//                return result;
//            }else {
//                BaseResult result = new BaseResult(ResultEnum.FAILED_INSERT,null);
//                return result;
//            }
//        }else {
//            BaseResult result = new BaseResult(ResultEnum.EXIST,null);
//            return result;
//        }
//    }

    @ApiOperation(value = "编辑问题")
    @ResponseBody
    @RequestMapping(value = "/editquestion")
    public BaseResult editchapter(TbQuestions questions){
        int count = tbQuestionsService.updateByPrimaryKey(questions);
        if(count == 1){
            BaseResult result = new BaseResult(ResultEnum.SUCCESS,null);
            return result;
        }else {
            BaseResult result = new BaseResult(ResultEnum.FAILED_UPDATE,null);
            return result;
        }
    }

    @ApiOperation(value = "删除问题")
    @ResponseBody
    @RequestMapping(value = "/removequestion")
    public BaseResult removechapter(TbQuestions questions){
        questions.setStatus(BaseConstants.NOTALLOW);
        int count = tbQuestionsService.updateByPrimaryKeySelective(questions);
        if(count == 1){
            BaseResult result = new BaseResult(ResultEnum.SUCCESS,null);
            return result;
        }else {
            BaseResult result = new BaseResult(ResultEnum.FAILED_UPDATE,null);
            return result;
        }
    }
}
