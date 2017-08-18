package com.lsc.exam.dao.mapper;

import com.lsc.exam.dao.model.TbTaoti;
import com.lsc.exam.dao.model.TbTaotiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbTaotiMapper {
    long countByExample(TbTaotiExample example);

    int deleteByExample(TbTaotiExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbTaoti record);

    int insertSelective(TbTaoti record);

    List<TbTaoti> selectByExample(TbTaotiExample example);

    TbTaoti selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbTaoti record, @Param("example") TbTaotiExample example);

    int updateByExample(@Param("record") TbTaoti record, @Param("example") TbTaotiExample example);

    int updateByPrimaryKeySelective(TbTaoti record);

    int updateByPrimaryKey(TbTaoti record);
}