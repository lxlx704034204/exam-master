package com.lsc.exam.dao.mapper;

import com.lsc.exam.dao.model.TbChapter;
import com.lsc.exam.dao.model.TbChapterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbChapterMapper {
    long countByExample(TbChapterExample example);

    int deleteByExample(TbChapterExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbChapter record);

    int insertSelective(TbChapter record);

    List<TbChapter> selectByExample(TbChapterExample example);

    TbChapter selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbChapter record, @Param("example") TbChapterExample example);

    int updateByExample(@Param("record") TbChapter record, @Param("example") TbChapterExample example);

    int updateByPrimaryKeySelective(TbChapter record);

    int updateByPrimaryKey(TbChapter record);
}