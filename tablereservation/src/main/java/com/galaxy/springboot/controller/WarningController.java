package com.galaxy.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class WarningController {
	@RequestMapping("warnings")
    public String Inventory() {
    	return "warning";
    }
}
