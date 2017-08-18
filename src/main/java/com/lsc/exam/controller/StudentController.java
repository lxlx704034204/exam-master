package com.lsc.exam.controller;

import com.lsc.exam.base.BaseConstants;
import com.lsc.exam.base.BaseResult;
import com.lsc.exam.base.ResultEnum;
import com.lsc.exam.dao.listmodel.TbExamList;
import com.lsc.exam.dao.model.*;
import com.lsc.exam.service.api.TbExamResultService;
import com.lsc.exam.service.api.TbExamService;
import com.lsc.exam.service.api.TbExamStudentService;
import com.lsc.exam.service.api.TbQuestionsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2017/5/6.
 */
@Controller
@Api(value = "学生操作管理",description = "学生操作管理")
@RequestMapping("/stu")
public class StudentController {

    @Autowired
    private TbExamStudentService tbExamStudentService;
    @Autowired
    private TbExamService TbExamService;
    @Autowired
    private TbExamResultService TbExamResultService;
    @Autowired
    private TbQuestionsService TbQuestionsService;

    @ApiOperation(value = "获取没有考试科目")
    @ResponseBody
    @RequestMapping(value = "/querystuexam")
    public BaseResult querystuexam(String stuId,
                                @RequestParam(required=false,defaultValue = "1" ,value = "page") int page,
                                HttpServletRequest request){
        TbExamStudentExample tbs = new TbExamStudentExample();
        tbs.createCriteria().andStudentidEqualTo(stuId).andStatusEqualTo(BaseConstants.ALLOW);
        int rows = 10;
        tbs.setOffset((page - 1) * rows);
        tbs.setLimit(rows);
        TbExamStudent tbExamStudent = tbExamStudentService.selectFirstByExample(tbs);
        if(tbExamStudent !=null){
            BaseResult result = new BaseResult(ResultEnum.SUCCESS,tbExamStudent);
            return result;
        }else {
            BaseResult result = new BaseResult(ResultEnum.NOTEXIST,null);
            return result;
        }
    }

    @ApiOperation(value = "获取考试试卷")
    @ResponseBody
    @RequestMapping(value = "/getExam")
    public BaseResult getExam(int taotiId){
        TbExamExample TbExamExample = new TbExamExample();
        TbExamExample.createCriteria().andTaotiidEqualTo(taotiId);
        List<TbExam> tbExams = TbExamService.selectByExample(TbExamExample);
        if(tbExams.size()!=0){
            BaseResult result = new BaseResult(ResultEnum.SUCCESS,tbExams);
            return result;
        }else {
            BaseResult result = new BaseResult(ResultEnum.NOTEXIST,null);
            return result;
        }
    }

    @ApiOperation(value = "提交试卷")
    @ResponseBody
    @RequestMapping(value = "/subexam")
    public BaseResult subexam(TbExamList TbExamList){
        int count = 0;
        for(TbExamResult tbr : TbExamList.getTbExamResult()){
            TbQuestionsExample TbQuestionsExample = new TbQuestionsExample();
            TbQuestionsExample.createCriteria().andIdEqualTo(tbr.getQuestionid().longValue());
            TbQuestions tbQuestions = TbQuestionsService.selectFirstByExample(TbQuestionsExample);
            //多选或单选
            if(tbQuestions.getType().equals(1) || tbQuestions.getType().equals(2)){
                if(tbQuestions.getAnswer().equals(tbr.getAnswer())){
                    tbr.setScore(tbQuestions.getScore());
                }else {
                    tbr.setScore(0);
                }
            }
            TbExamResultService.insert(tbr);
            count++;
        }
        TbExamStudent TbExamStudent = new TbExamStudent();
        TbExamStudent.setStatus(BaseConstants.NOTREMARK);
        TbExamStudentExample tbs = new TbExamStudentExample();
        tbs.createCriteria().andTaotiidEqualTo(TbExamList.getTbExamResult().get(0).getTaotiid());
        tbExamStudentService.updateByExample(TbExamStudent,tbs);
        if(count == TbExamList.getTbExamResult().size()){
            BaseResult result = new BaseResult(ResultEnum.SUCCESS,null);
            return result;
        }else{
            BaseResult result = new BaseResult(ResultEnum.FAILED_INSERT,null);
            return result;
        }
    }

    @ApiOperation(value = "查看已批阅完的试卷并查看分数")
    @ResponseBody
    @RequestMapping(value = "/selectexam")
    public BaseResult selectexam(String stuId){
        TbExamStudentExample tbExamStudentExample = new TbExamStudentExample();
        tbExamStudentExample.createCriteria().andStudentidEqualTo(stuId).andStatusEqualTo(BaseConstants.ISREMARK);
        List<TbExamStudent> tbExamStudents = tbExamStudentService.selectByExample(tbExamStudentExample);
        if(tbExamStudents != null){
            BaseResult result = new BaseResult(ResultEnum.SUCCESS,tbExamStudents);
            return result;
        }else{
            BaseResult result = new BaseResult(ResultEnum.FAILED_INSERT,null);
            return result;
        }
    }
}
