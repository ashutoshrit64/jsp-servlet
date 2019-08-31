package com.bridgelabz.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class LogInfilter
 */
@WebFilter("/Login")
public class LogInfilter implements Filter {

   
	public void destroy() {
		// TODO Auto-generated method stub
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("in filter");
		
		
		String email = request.getParameter("user");
		String pass=request.getParameter("pass");
		int l=pass.length();
		System.out.println(l);
		System.out.println(email);
		Pattern emailpattern = Pattern.compile("[a-z0-9._%+-]+@[a-z0-9.-]+.[a-z]{2,3}$");// pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2, 3}$
		System.out.println(emailpattern);
		Matcher match = emailpattern.matcher(email);
		System.out.println(match);
		PrintWriter pw = response.getWriter();
System.out.println("change");
		if (match.matches() && l>=4) {
			System.out.println("yes");
			pw.print("success");
			chain.doFilter(request, response);
		} else {
			pw.print("invalid username or passwordlength is less than 4");
			RequestDispatcher rd = request.getRequestDispatcher("LogIn.jsp");
			rd.forward (request, response);
		}
	
//		
//		chain.doFilter(request, response);
	}


	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
