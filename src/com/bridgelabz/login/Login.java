package com.bridgelabz.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bridgelabz.repository.Dao;
import com.bridgelabz.repository.Daointerface;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	Daointerface obj=new Dao();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
 {
		
		String username=request.getParameter("user");
		String pass=request.getParameter("pass");

		System.out.println(username);
		System.out.println(pass);
	//	obj.login(username,pass);
		if(obj.login(username,pass))
		{try {
			User user=new User();
			HttpSession session=request.getSession();
			session.setAttribute("user", username);
//			session.setAttribute("pass",pass);
//			session.setAttribute("dob", user.getDob());
//			session.setAttribute("mobno", user.getMobno());
			
				response.sendRedirect("Welcome.jsp");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	else
		{
			try {
				response.sendRedirect("LogIn.jsp");
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

	

}
