package com.lsc.exam.dao.mapper;

import com.lsc.exam.dao.model.TbLesson;
import com.lsc.exam.dao.model.TbLessonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbLessonMapper {
    long countByExample(TbLessonExample example);

    int deleteByExample(TbLessonExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbLesson record);

    int insertSelective(TbLesson record);

    List<TbLesson> selectByExample(TbLessonExample example);

    TbLesson selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbLesson record, @Param("example") TbLessonExample example);

    int updateByExample(@Param("record") TbLesson record, @Param("example") TbLessonExample example);

    int updateByPrimaryKeySelective(TbLesson record);

    int updateByPrimaryKey(TbLesson record);
}