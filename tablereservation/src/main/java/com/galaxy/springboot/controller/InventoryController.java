package com.galaxy.springboot.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.galaxy.springboot.entity.Classification;
import com.galaxy.springboot.service.ClassificationService;

@Controller
public class InventoryController {
	@Resource
	private ClassificationService  classificationService;
    @RequestMapping("inventory")
    public String Inventory(Model model) {
    	List<Classification> classifications = classificationService.select();
		model.addAttribute("classifications", classifications);
    	return "inventory";
    }
    
}
