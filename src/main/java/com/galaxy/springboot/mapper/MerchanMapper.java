package com.galaxy.springboot.mapper;

import com.galaxy.springboot.entity.Merchan;
import com.galaxy.springboot.entity.MerchanExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface MerchanMapper {
    int countByExample(MerchanExample example);

    int deleteByExample(MerchanExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Merchan record);

    int insertSelective(Merchan record);

    List<Merchan> selectByExample(MerchanExample example);

    Merchan selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Merchan record, @Param("example") MerchanExample example);

    int updateByExample(@Param("record") Merchan record, @Param("example") MerchanExample example);

    int updateByPrimaryKeySelective(Merchan record);

    int updateByPrimaryKey(Merchan record);
}