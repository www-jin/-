package com.galaxy.springboot.controller;

import java.util.List;

import javax.annotation.Resource;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.galaxy.springboot.entity.Orders;
import com.galaxy.springboot.entity.Store;
import com.galaxy.springboot.entity.UserList;
import com.galaxy.springboot.service.OrderService;
import com.galaxy.springboot.service.StoreService;
import com.galaxy.springboot.service.UserListService;

@RestController
public class WxOrderController {
	@Resource
	private UserListService userListService;
	@Resource
	private OrderService orderService;
	@Resource
	private StoreService storeService;
	
   @RequestMapping("list")
   public List<UserList> list() {
	   return userListService.select();
   }
   @RequestMapping("orders")
   public List<Orders> select(){
	   return orderService.selectByFlag(1);
   }
   @RequestMapping("orders1")
   public List<Orders> select1(){
	   return orderService.selectByFlag(2);
   }
   @RequestMapping("orders2")
   public List<Orders> select2(){
	   return orderService.selectByFlag(3);
   }
   @RequestMapping("store")
   public List<Store> selectList(){
	   return storeService.seleceList();
   }
}
