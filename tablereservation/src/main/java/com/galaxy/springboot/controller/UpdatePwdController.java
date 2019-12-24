package com.galaxy.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class UpdatePwdController {
	@RequestMapping("updatePwds")
    public String Inventory() {
    	return "updatePwd";
    }
}
