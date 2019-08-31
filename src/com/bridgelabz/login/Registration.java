package com.bridgelabz.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.repository.Dao;
import com.bridgelabz.repository.Daointerface;

@WebServlet("/Registration")
public class Registration extends HttpServlet {
	Daointerface obj=new Dao();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{		
		try {
		//String fname=request.getParameter("fname");
		String email=request.getParameter("email");
		String password=request.getParameter("pass");
		String dob=request.getParameter("dob");
		String mobno=request.getParameter("mobno");
		
		 PrintWriter out = response.getWriter();
		if (email.isEmpty() || password.isEmpty() || dob.isEmpty() || mobno.isEmpty() ) {
			   RequestDispatcher rd = request.getRequestDispatcher("Registration.jsp");
			   out.println("<font color=red>Please fill all the fields</font>");
			   rd.include(request, response);
		}else {
			
		
		User user=new User(email,password,dob,mobno);
		obj.register(user);
		response.sendRedirect("Registrationsucces.jsp");
		
		}
		}catch(Exception e){
			response.sendRedirect("Error.jsp");
			 // request.getRequestDispatcher("/ErrorPage.jsp").forward(request, response);
			  e.printStackTrace();
		
		}
		
		
		
	}



}
