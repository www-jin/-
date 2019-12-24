package com.galaxy.springboot.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.galaxy.springboot.entity.Classification;
import com.galaxy.springboot.entity.ClassificationExample;
import com.galaxy.springboot.entity.ClassificationExample.Criteria;
import com.galaxy.springboot.entity.User;
import com.galaxy.springboot.mapper.ClassificationMapper;
import com.galaxy.springboot.service.ClassificationService;
import com.galaxy.springboot.support.PageInfo;
@Service
public class ClassificationImpl implements ClassificationService {
    @Resource
    private ClassificationMapper classificationMapper;
	
	

	@Override
	public List<Classification> select() {
		// TODO Auto-generated method stub
		ClassificationExample example=new ClassificationExample();
		
		return classificationMapper.selectByExample(example);
	}



	@Override
	public void insert(Classification classification) {
		// TODO Auto-generated method stub
		 classificationMapper.insertSelective(classification);
	}



	



	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		classificationMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void selectById(Integer id) {
		// TODO Auto-generated method stub
		classificationMapper.selectByPrimaryKey(id);
	}



	@Override
	public List<Classification> selectByStuss(String statuss) {
		// TODO Auto-generated method stub
		return classificationMapper.selectByStuss(statuss);
	}



	@Override
	public void update(String statuss, Integer id) {
		// TODO Auto-generated method stub
		classificationMapper.updateById(statuss, id);
	}



	




}
