package com.bridgelabz.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgelabz.repository.Dao;
import com.bridgelabz.repository.Daointerface;

/**
 * Servlet implementation class Forgot
 */
@WebServlet("/Forgot")
public class Forgot extends HttpServlet {
	Daointerface obj=new Dao();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{

		User user=new User();
		user.setEmail(request.getParameter("email"));
		user.setPassword(request.getParameter("pass"));
		obj.forgotPassword(user);
	
		request.getRequestDispatcher("Forgotsuccess.jsp").forward(request, response);
		
	}



}
