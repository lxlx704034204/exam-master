package com.lsc.exam.dao.mapper;

import com.lsc.exam.dao.model.TbQuestions;
import com.lsc.exam.dao.model.TbQuestionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbQuestionsMapper {
    long countByExample(TbQuestionsExample example);

    int deleteByExample(TbQuestionsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbQuestions record);

    int insertSelective(TbQuestions record);

    List<TbQuestions> selectByExampleWithBLOBs(TbQuestionsExample example);

    List<TbQuestions> selectByExample(TbQuestionsExample example);

    TbQuestions selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbQuestions record, @Param("example") TbQuestionsExample example);

    int updateByExampleWithBLOBs(@Param("record") TbQuestions record, @Param("example") TbQuestionsExample example);

    int updateByExample(@Param("record") TbQuestions record, @Param("example") TbQuestionsExample example);

    int updateByPrimaryKeySelective(TbQuestions record);

    int updateByPrimaryKeyWithBLOBs(TbQuestions record);

    int updateByPrimaryKey(TbQuestions record);
}