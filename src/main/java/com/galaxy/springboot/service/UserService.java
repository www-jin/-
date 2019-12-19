package com.galaxy.springboot.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.galaxy.springboot.entity.User;
import com.galaxy.springboot.entity.UserExample;

public interface UserService {
	User selectUser(User user);
	void add(User user);
}
