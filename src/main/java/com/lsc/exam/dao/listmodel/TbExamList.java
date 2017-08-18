package com.lsc.exam.dao.listmodel;

import com.lsc.exam.dao.model.TbExamResult;
import com.lsc.exam.dao.model.TbExamStudent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/5/6.
 */
public class TbExamList {

    //套题-学生关联list
    private List<TbExamStudent> tbExamStudents;
    //试卷-结果分数list
    private List<TbExamResult> TbExamResult;


    public List<TbExamStudent> getTbExamStudents() {
        return tbExamStudents;
    }

    public void setTbExamStudents(List<TbExamStudent> tbExamStudents) {
        this.tbExamStudents = tbExamStudents;
    }

    public List<com.lsc.exam.dao.model.TbExamResult> getTbExamResult() {
        return TbExamResult;
    }

    public void setTbExamResult(List<com.lsc.exam.dao.model.TbExamResult> tbExamResult) {
        TbExamResult = tbExamResult;
    }
}
