package com.galaxy.springboot.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.galaxy.springboot.entity.Classification;
import com.galaxy.springboot.service.ClassificationService;
@Controller
public class OutBoudController {
	@Resource
	private ClassificationService classificationService;
	@RequestMapping("outBouds")
    public String Inventory(Model model) {
		List<Classification> classifications = classificationService.selectByStuss("0");
		model.addAttribute("classifications", classifications);
    	return "outBoud";
    }
}
