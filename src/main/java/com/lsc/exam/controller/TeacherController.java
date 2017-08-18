package com.lsc.exam.controller;

import com.lsc.exam.base.BaseConstants;
import com.lsc.exam.base.BaseResult;
import com.lsc.exam.base.ResultEnum;
import com.lsc.exam.dao.listmodel.TbExamList;
import com.lsc.exam.dao.model.*;
import com.lsc.exam.generation.GA;
import com.lsc.exam.generation.Paper;
import com.lsc.exam.generation.Population;
import com.lsc.exam.generation.RuleBean;
import com.lsc.exam.service.api.TbExamResultService;
import com.lsc.exam.service.api.TbExamService;
import com.lsc.exam.service.api.TbExamStudentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2017/5/3.
 */
@Controller
@Api(value = "试卷管理",description = "试卷管理")
@RequestMapping("/tec")
public class TeacherController {

    @Autowired
    private TbExamService tbExamService;
    @Autowired
    private TbExamStudentService TbExamStudent;
    @Autowired
    private TbExamResultService TbExamResultService;
    @Autowired
    private TbExamStudentService tbExamStudentService;

    @ApiOperation(value = "自动组卷")
    @ResponseBody
    @RequestMapping(value = "/autoAssemble")
    public BaseResult autoAssemble(RuleBean rule){
        Paper resultPaper = null;
        // 迭代计数器
        int count = 0;
        int runCount = 100;
        // 适应度期望值
        double expand = 0.98;
        // 可自己初始化组卷规则rule
//        if (rule != null) {
//            // 初始化种群
//            Population population = new Population(20, true, rule);
//            System.out.println("初次适应度  " + population.getFitness().getAdaptationDegree());
//            while (count < runCount && population.getFitness().getAdaptationDegree() < expand) {
//                count++;
//                population = GA.evolvePopulation(population, rule);
//                System.out.println("第 " + count + " 次进化，适应度为： " + population.getFitness().getAdaptationDegree());
//            }
//            System.out.println("进化次数： " + count);
//            System.out.println(population.getFitness().getAdaptationDegree());
//            resultPaper = population.getFitness();
//        }
//        System.out.println(resultPaper);
        BaseResult result = new BaseResult(ResultEnum.SUCCESS,resultPaper);
        return result;
    }

    @ApiOperation(value = "保存试卷")
    @ResponseBody
    @RequestMapping(value = "/addexam")
    public BaseResult addexam(Paper paper){
        int count = 0;
        for(TbQuestions tbq : paper.getQuestionList()){
            TbExam exam = new TbExam();
            exam.setQuestionid(tbq.getId().intValue());
            exam.setTaotiid(paper.getTaotiId());
            exam.setStatus(BaseConstants.ALLOW);
            tbExamService.insert(exam);
            count++;
        }
        if(count == paper.getQuestionList().size()){
            BaseResult result = new BaseResult(ResultEnum.SUCCESS,null);
            return result;
        }else{
            BaseResult result = new BaseResult(ResultEnum.FAILED_INSERT,null);
            return result;
        }
    }

    @ApiOperation(value = "分配考试题目")
    @ResponseBody
    @RequestMapping(value = "/releaseexam")
    public BaseResult releaseexam(TbExamList TbExamList){
        int count = 0;
        for(TbExamStudent tbq : TbExamList.getTbExamStudents()){
            tbq.setStatus(BaseConstants.NOTEXAM);
            TbExamStudent.insert(tbq);
            count++;
        }
        if(count == TbExamList.getTbExamStudents().size()){
            BaseResult result = new BaseResult(ResultEnum.SUCCESS,null);
            return result;
        }else{
            BaseResult result = new BaseResult(ResultEnum.FAILED_INSERT,null);
            return result;
        }
    }

    @ApiOperation(value = "查看需要批阅的试卷列表")
    @ResponseBody
    @RequestMapping(value = "/selectexam")
    public BaseResult selectexam(){
        TbExamStudentExample tbExamStudentExample = new TbExamStudentExample();
        tbExamStudentExample.createCriteria().andStatusEqualTo(BaseConstants.NOTREMARK);
        List<TbExamStudent> tbExamStudents = tbExamStudentService.selectByExample(tbExamStudentExample);
        if(tbExamStudents != null){
            BaseResult result = new BaseResult(ResultEnum.SUCCESS,tbExamStudents);
            return result;
        }else{
            BaseResult result = new BaseResult(ResultEnum.FAILED_INSERT,null);
            return result;
        }
    }

    @ApiOperation(value = "选择要批阅的试卷")
    @ResponseBody
    @RequestMapping(value = "/remarkexam")
    public BaseResult remarkexam(String stuId,int taotiId){
        TbExamResultExample TbExamResultExample = new TbExamResultExample();
        TbExamResultExample.createCriteria().andStudentidEqualTo(stuId).andTaotiidEqualTo(taotiId);
        List<TbExamResult> tbExamResults = TbExamResultService.selectByExample(TbExamResultExample);
        if(tbExamResults != null){
            BaseResult result = new BaseResult(ResultEnum.SUCCESS,tbExamResults);
            return result;
        }else{
            BaseResult result = new BaseResult(ResultEnum.FAILED_INSERT,null);
            return result;
        }
    }

    @ApiOperation(value = "提交批阅后的试卷")
    @ResponseBody
    @RequestMapping(value = "/subexam")
    public BaseResult subexam(TbExamList TbExamList){
        int count = 0;
        for(TbExamResult tbr : TbExamList.getTbExamResult()){
            TbExamResultService.insert(tbr);
            count++;
        }
        TbExamStudent TbExamStudent = new TbExamStudent();
        TbExamStudent.setStatus(BaseConstants.ISREMARK);
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

}
