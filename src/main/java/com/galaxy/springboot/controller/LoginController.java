package com.galaxy.springboot.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@RequestMapping("hh")
	public  String ss() {
    	return "login";
  }
	@RequestMapping("register")
	public  String register() {
    	return "register";
  }
}
