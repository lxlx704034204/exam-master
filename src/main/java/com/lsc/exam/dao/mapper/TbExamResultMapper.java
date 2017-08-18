package com.lsc.exam.dao.mapper;

import com.lsc.exam.dao.model.TbExamResult;
import com.lsc.exam.dao.model.TbExamResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbExamResultMapper {
    long countByExample(TbExamResultExample example);

    int deleteByExample(TbExamResultExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbExamResult record);

    int insertSelective(TbExamResult record);

    List<TbExamResult> selectByExample(TbExamResultExample example);

    TbExamResult selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbExamResult record, @Param("example") TbExamResultExample example);

    int updateByExample(@Param("record") TbExamResult record, @Param("example") TbExamResultExample example);

    int updateByPrimaryKeySelective(TbExamResult record);

    int updateByPrimaryKey(TbExamResult record);
}