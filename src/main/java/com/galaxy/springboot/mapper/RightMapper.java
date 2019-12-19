package com.galaxy.springboot.mapper;

import com.galaxy.springboot.entity.Right;
import com.galaxy.springboot.entity.RightExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface RightMapper {
    int countByExample(RightExample example);

    int deleteByExample(RightExample example);

    int deleteByPrimaryKey(Integer rightCode);

    int insert(Right record);

    int insertSelective(Right record);

    List<Right> selectByExample(RightExample example);

    Right selectByPrimaryKey(Integer rightCode);

    int updateByExampleSelective(@Param("record") Right record, @Param("example") RightExample example);

    int updateByExample(@Param("record") Right record, @Param("example") RightExample example);

    int updateByPrimaryKeySelective(Right record);

    int updateByPrimaryKey(Right record);
}