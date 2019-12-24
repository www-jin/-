package com.galaxy.springboot.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.galaxy.springboot.entity.Classification;
import com.galaxy.springboot.service.ClassificationService;

@Controller
public class InboundController {
	@Resource
	private ClassificationService classificationService;
   @RequestMapping("inbound")
   
	   public String ss(Model model) {
	    	List<Classification> classifications = classificationService.selectByStuss("1");
			model.addAttribute("classifications", classifications);
	    	return "inbound";
	    }
	   
     @RequestMapping("chuku")
     public String oo(Model model,Integer id) {
    	 classificationService.update("0", id);
    	 return "forword:/inbound";
     }
     @RequestMapping("indelete")
     public String  delete(Integer id) {
    	 classificationService.delete(id);
    	 return "redirect:/inbound";
     }
}
