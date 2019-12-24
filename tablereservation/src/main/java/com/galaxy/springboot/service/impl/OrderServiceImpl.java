package com.galaxy.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galaxy.springboot.entity.Orders;
import com.galaxy.springboot.mapper.OrdersMapper;
import com.galaxy.springboot.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
	private OrdersMapper orderMapper;
	@Override
	public List<Orders> selectList() {
		// TODO Auto-generated method stub
		return orderMapper.selectByExample(null);
	}
	@Override
	public List<Orders> selectByFlag(Integer flag) {
		// TODO Auto-generated method stub
		return orderMapper.selectByFlag(flag);
	}

}
