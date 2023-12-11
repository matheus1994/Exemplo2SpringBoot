package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Tasks;
import com.example.services.LoginService;
import com.example.services.TasksServices;

@Controller
@RequestMapping("/tasks")
public class TasksController {
	
	@Autowired
	TasksServices tasksServices;
	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView listar() {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("tasks_lists", tasksServices.allTasks());
		
		mv.setViewName("listar");
		
		return mv;
		
	}

}
