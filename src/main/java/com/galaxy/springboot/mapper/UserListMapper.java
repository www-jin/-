package com.galaxy.springboot.mapper;

import com.galaxy.springboot.entity.UserList;
import com.galaxy.springboot.entity.UserListExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UserListMapper {
    int countByExample(UserListExample example);

    int deleteByExample(UserListExample example);

    int deleteByPrimaryKey(Integer listId);

    int insert(UserList record);

    int insertSelective(UserList record);

    List<UserList> selectByExample(UserListExample example);

    UserList selectByPrimaryKey(Integer listId);

    int updateByExampleSelective(@Param("record") UserList record, @Param("example") UserListExample example);

    int updateByExample(@Param("record") UserList record, @Param("example") UserListExample example);

    int updateByPrimaryKeySelective(UserList record);

    int updateByPrimaryKey(UserList record);
}