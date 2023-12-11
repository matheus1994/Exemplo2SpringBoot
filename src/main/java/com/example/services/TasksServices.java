package com.example.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;
import com.example.model.Tasks;


public class TasksServices {
	
	private static List<Tasks> tasksList = new ArrayList<Tasks>();
	
	static {
		tasksList.add(new Tasks(1, "Limpar casa", new Date(), false));
		tasksList.add(new Tasks(2, "Planejar viagem", new Date(), false));
		tasksList.add(new Tasks(2, "Comprar novo computador", new Date(), true));
		tasksList.add(new Tasks(2, "Resolver problemas banco", new Date(), true));
	}
	
	public List<Tasks> allTasks(){
		return tasksList;
	}
	
	public List<Tasks> allTasksStatus(boolean status){
		
		List<Tasks> tasksListStatus = new ArrayList<Tasks>();
		
		for(Tasks task: tasksList) {
			if(task.isStatus() == status) {
				tasksListStatus.add(task);
			}
		}
		
		return tasksListStatus;
	}
	

}
