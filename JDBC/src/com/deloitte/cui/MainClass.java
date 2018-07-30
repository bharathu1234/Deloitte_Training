package com.deloitte.cui;

import com.deloitte.daos.UserDAO;
import com.deloitte.entities.User;

public class MainClass {
	public static void main(String[] args) {
		
		UserDAO udao = new UserDAO();
		User user = new User(3, "Hello", "Bharath", "Umashankar", "password", "E");
	
		udao.save(user);
	
	}
	
}
