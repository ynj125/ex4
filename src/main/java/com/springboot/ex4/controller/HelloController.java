package com.springboot.ex4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller public class HelloController { 
	

	@RequestMapping("/") 
	public String index() {
		return "index"; 
		}
	
	@RequestMapping("/hello") 
	public String hello() { 
		return "hello"; 
		} 
	
	@RequestMapping("/login")
    public String login() {
        return "login";
        
	}


}

