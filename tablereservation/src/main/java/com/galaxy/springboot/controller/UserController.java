package com.galaxy.springboot.controller;

import java.util.List;

import javax.annotation.Resource;

import javax.servlet.http.HttpSession;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.galaxy.springboot.entity.Classification;
import com.galaxy.springboot.entity.User;
import com.galaxy.springboot.entity.UserList;
import com.galaxy.springboot.service.ClassificationService;
import com.galaxy.springboot.service.UserListService;
import com.galaxy.springboot.service.UserService;
import com.galaxy.springboot.support.PageInfo;

@Controller
public class UserController {
	@Resource
	private ClassificationService classificationService;
	@Resource
	private UserService userService;
	@Resource
	private UserListService userListService;
	@RequestMapping(value = "/login", method = RequestMethod.POST, headers = "Accept=application/json")
	public  String login(User user,HttpSession session) {
    	User user1 = userService.selectUser(user);
    	if(user1!=null) {
    		session.setAttribute("user", user1);
    		return "index";
    	}
    	return "login";
	}
	@RequestMapping("add")
	public String register(User user){
		
		if(user!=null) {
			user.setUserNote("0");
			userService.add(user);
			return  "redirect:/hh";
		}
		return "redirect:/register";
	}
	
	@RequestMapping("types")
	public String  list( Model model){
		List<Classification> classifications = classificationService.select();
		model.addAttribute("classifications", classifications);
		return "type";
	}
	
	@RequestMapping("insert")
	public String insert(Classification classifications) {
		classifications.setStatuss("1");
		classificationService.insert(classifications);
		return "type";
	}
	@RequestMapping("delete")
	public String delete(Integer id) {
		classificationService.delete(id);
		return "redirect:/type";
	}
	@RequestMapping("select")
	public String selectById(Integer id) {
		classificationService.selectById(id);
		return "updatetype";
	}
	@RequestMapping("users")
	public  String user(Model model) {
		List<User> user=userService.select();
		model.addAttribute("user", user);
		return "user";
	}
}
