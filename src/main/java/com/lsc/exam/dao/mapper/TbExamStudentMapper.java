package com.lsc.exam.dao.mapper;

import com.lsc.exam.dao.model.TbExamStudent;
import com.lsc.exam.dao.model.TbExamStudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbExamStudentMapper {
    long countByExample(TbExamStudentExample example);

    int deleteByExample(TbExamStudentExample example);

    int insert(TbExamStudent record);

    int insertSelective(TbExamStudent record);

    List<TbExamStudent> selectByExample(TbExamStudentExample example);

    int updateByExampleSelective(@Param("record") TbExamStudent record, @Param("example") TbExamStudentExample example);

    int updateByExample(@Param("record") TbExamStudent record, @Param("example") TbExamStudentExample example);
}