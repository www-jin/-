package com.galaxy.springboot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


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
