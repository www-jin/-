package com.galaxy.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galaxy.springboot.entity.Store;
import com.galaxy.springboot.mapper.StoreMapper;
import com.galaxy.springboot.service.StoreService;
@Service
public class StoreServiceImpl implements StoreService {
    @Autowired
	private  StoreMapper storeMapper;

	@Override
	public List<Store> seleceList() {
		// TODO Auto-generated method stub
		return storeMapper.selectByExample(null);
	}
	
}
