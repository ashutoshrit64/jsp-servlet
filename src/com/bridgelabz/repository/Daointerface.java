package com.bridgelabz.repository;

import java.sql.Connection;

import com.bridgelabz.login.User;

public interface Daointerface
{

	void register(User user);

	boolean login(String username, String pass);

	void forgotPassword(User user);
	


	
	
	
	
}
