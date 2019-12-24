package com.galaxy.springboot.service;

import java.util.List;


import com.galaxy.springboot.entity.Orders;

public interface OrderService {
    List<Orders> selectList();
    List<Orders> selectByFlag(Integer flag);
}
