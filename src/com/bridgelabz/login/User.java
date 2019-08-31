package com.bridgelabz.login;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class User
 */
@WebServlet("/User")
public class User extends HttpServlet
{
	//String fname;
	String email;
	String password;
	String dob;
	String mobno;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String email, String password, String dob, String mobno) {
		super();
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.mobno = mobno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", dob=" + dob + ", mobno=" + mobno + "]";
	}


}
