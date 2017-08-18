package com.lsc.exam.generation;

import com.lsc.exam.dao.model.TbQuestions;
import com.lsc.exam.dao.model.TbQuestionsExample;
import com.lsc.exam.service.api.TbQuestionsService;
import com.lsc.exam.service.impl.TbQuestionsServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.rmi.runtime.Log;

import java.util.List;
import java.util.Random;

/**
 * 种群，即多套试卷
 *
 * @author: xlli
 * @CreateDate: 2016-4-29 下午01:29:02
 * @version: 1.0
 */
public class Population {
    private final static Logger _log = LoggerFactory.getLogger(Population.class);
    /**
     * 试卷集合
     */
    private Paper[] papers;

    /**
     * 初始种群
     *
     * @param populationSize 种群规模
     * @param initFlag       初始化标志 true-初始化
     * @param rule           规则bean
     */
//    public Population(int populationSize, boolean initFlag, RuleBean rule) {
//        papers = new Paper[populationSize];
//        if (initFlag) {
//            Paper paper;
//            Random random = new Random();
//            for (int i = 0; i < populationSize; i++) {
//                paper = new Paper();
//                paper.setId(i + 1);
//                while (paper.getTotalScore() != rule.getTotalMark()) {
//                    paper.getQuestionList().clear();
//                    // 单选题
//                    if (rule.getSingleNum() > 0) {
//                        generateQuestion(1, random, rule.getSingleNum(), rule.getSingleScore(),  rule.getPointIds(),
//                                "单选题数量不够，组卷失败", paper);
//                    }
//                    // 多选题
//                    if (rule.getMultipleNum() > 0) {
//                        generateQuestion(2, random, rule.getSingleNum(), rule.getSingleScore(),  rule.getPointIds(),
//                                "多选题数量不够，组卷失败", paper);
//                    }
//                    // 填空题
//                    if (rule.getCompleteNum() > 0) {
//                        generateQuestion(3, random, rule.getCompleteNum(), rule.getCompleteScore(),  rule.getPointIds(),
//                                "填空题数量不够，组卷失败", paper);
//                    }
//                    // 计算题
//                    if (rule.getCalculationNum() > 0) {
//                        generateQuestion(4, random, rule.getSubjectiveNum(), rule.getSubjectiveScore(),  rule.getPointIds(),
//                                "主观题数量不够，组卷失败", paper);
//                    }
//                    // 主观题
//                    if (rule.getSingleNum() > 0) {
//                        generateQuestion(5, random, rule.getSingleNum(), rule.getSingleScore(),  rule.getPointIds(),
//                                "单选题数量不够，组卷失败", paper);
//                    }
//                }
//                // 计算试卷知识点覆盖率
//                paper.setKpCoverage(rule);
//                // 计算试卷适应度
//                paper.setAdaptationDegree(rule, Global.KP_WEIGHT, Global.DIFFCULTY_WEIGHt);
//                papers[i] = paper;
//            }
//        }
//    }

    private void generateQuestion(int type, Random random, int qustionNum, int score, List<String> idString,
                                  String errorMsg, Paper paper) {
        TbQuestionsService tbQuestionsService = new TbQuestionsServiceImpl();
        TbQuestionsExample tbQuestionsExample = new TbQuestionsExample();
        tbQuestionsExample.createCriteria().andTypeEqualTo(type).andPointidIn(idString);
        List<TbQuestions> singleArray = tbQuestionsService.selectByExample(tbQuestionsExample);
        if (singleArray != null && singleArray.size() < qustionNum) {
            return;
        }
        TbQuestions tmpQuestion;
        for (int j = 0; j < qustionNum; j++) {
            int index = random.nextInt(singleArray.size() - j);
//             初始化分数
            singleArray.get(index).setScore(score);
            paper.addQuestion(singleArray.get(index));
//             保证不会重复添加试题
            tmpQuestion = singleArray.get(singleArray.size() - j - 1);
            singleArray.set(singleArray.size() - j - 1,singleArray.get(index));
            singleArray.set(index,tmpQuestion);
        }
    }

    /**
     * 获取种群中最优秀个体
     *
     * @return
     */
    public Paper getFitness() {
        Paper paper = papers[0];
        for (int i = 1; i < papers.length; i++) {
            if (paper.getAdaptationDegree() < papers[i].getAdaptationDegree()) {
                paper = papers[i];
            }
        }
        return paper;
    }

    public Population(int populationSize) {
        papers = new Paper[populationSize];
    }

    /**
     * 获取种群中某个个体
     *
     * @param index
     * @return
     */
    public Paper getPaper(int index) {
        return papers[index];
    }

    /**
     * 设置种群中某个个体
     *
     * @param index
     * @param paper
     */
    public void setPaper(int index, Paper paper) {
        papers[index] = paper;
    }

    /**
     * 返回种群规模
     *
     * @return
     */
    public int getLength() {
        return papers.length;
    }

}
