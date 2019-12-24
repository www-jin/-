package com.galaxy.springboot.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galaxy.springboot.entity.User;
import com.galaxy.springboot.entity.UserExample;
import com.galaxy.springboot.mapper.UserMapper;
import com.galaxy.springboot.service.UserService;


@Service
public class UserServiceImpl implements UserService {
   @Resource
   private UserMapper userMapper;


@Override
public void add(User user) {
	// TODO Auto-generated method stub
	userMapper.insertSelective(user);
}


@Override
public User selectUser(User user) {
	// TODO Auto-generated method stub
	return userMapper.selectUser(user);
}


@Override
public List<User> select() {
	// TODO Auto-generated method stub
	UserExample example=new UserExample();
	
	return userMapper.selectByExample(example);
}






	

}
