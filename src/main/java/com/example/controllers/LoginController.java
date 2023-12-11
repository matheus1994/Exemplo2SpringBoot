package com.example.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.services.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}
    
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public ModelAndView index(@RequestParam String login, @RequestParam String senha) {
		
		ModelAndView mv = new ModelAndView();
        mv.setViewName("index"); 
		
		if(loginService.validateLogin(login, senha)) {
	        mv.setViewName("index"); 
			mv.addObject("msg", "Seja bem vindo: " + login);
		}
		
		else {
	        mv.setViewName("login"); 
			mv.addObject("msg", "O login " + login + " não existe");
		}
		
		return mv;
	}
	
}
