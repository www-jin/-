package com.galaxy.springboot.mapper;

import com.galaxy.springboot.entity.Dishes;
import com.galaxy.springboot.entity.DishesExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface DishesMapper {
    int countByExample(DishesExample example);

    int deleteByExample(DishesExample example);

    int deleteByPrimaryKey(Integer dishesId);

    int insert(Dishes record);

    int insertSelective(Dishes record);

    List<Dishes> selectByExample(DishesExample example);

    Dishes selectByPrimaryKey(Integer dishesId);

    int updateByExampleSelective(@Param("record") Dishes record, @Param("example") DishesExample example);

    int updateByExample(@Param("record") Dishes record, @Param("example") DishesExample example);

    int updateByPrimaryKeySelective(Dishes record);

    int updateByPrimaryKey(Dishes record);
}