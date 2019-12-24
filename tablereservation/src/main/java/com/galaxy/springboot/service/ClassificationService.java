package com.galaxy.springboot.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.galaxy.springboot.entity.Classification;
import com.galaxy.springboot.entity.User;
import com.galaxy.springboot.support.PageInfo;

public interface ClassificationService {  
	
	  List<Classification> select();
	  void insert(Classification classification);
	  void update( String statuss, Integer id);
	  void delete(Integer id);
	  void selectById(Integer id);
	  List<Classification> selectByStuss(String statuss);
}
