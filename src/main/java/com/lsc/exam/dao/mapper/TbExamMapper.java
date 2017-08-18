package com.lsc.exam.dao.mapper;

import com.lsc.exam.dao.model.TbExam;
import com.lsc.exam.dao.model.TbExamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbExamMapper {
    long countByExample(TbExamExample example);

    int deleteByExample(TbExamExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbExam record);

    int insertSelective(TbExam record);

    List<TbExam> selectByExample(TbExamExample example);

    TbExam selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbExam record, @Param("example") TbExamExample example);

    int updateByExample(@Param("record") TbExam record, @Param("example") TbExamExample example);

    int updateByPrimaryKeySelective(TbExam record);

    int updateByPrimaryKey(TbExam record);
}