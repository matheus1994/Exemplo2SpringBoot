package com.example.services;

public class LoginService {

	public boolean validateLogin(String login, String senha) {
		if(login.equals("admin") && senha.equals("123")) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
}
