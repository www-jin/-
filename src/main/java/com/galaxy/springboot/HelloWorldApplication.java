package com.galaxy.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @SpringBootApplication
 * @RestController =>@Controller+@ResponseBody
 * 
 * 
 * @author Lenovo
 *
 */

@SpringBootApplication
public class HelloWorldApplication {
    public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}
}
