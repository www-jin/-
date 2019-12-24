package com.galaxy.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galaxy.springboot.entity.UserList;
import com.galaxy.springboot.mapper.UserListMapper;
import com.galaxy.springboot.service.UserListService;

@Service
public class UserListServiceImpl implements UserListService {
    @Autowired
    private UserListMapper userListMapper;
	
	@Override
	public List<UserList> select() {
		// TODO Auto-generated method stub
		return userListMapper.selectByExample(null);
	}

}
