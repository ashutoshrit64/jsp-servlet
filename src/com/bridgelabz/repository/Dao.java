package com.bridgelabz.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;

import com.bridgelabz.login.User;



public  class Dao implements Daointerface
{
	static Connection con;

	static {
		try {
			// load and register class driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// establish the connection between java application and database
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet", "root", "password");
		} catch (SQLException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		}

	}

	@Override
	public void register(User user) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
	
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet","root","password");
		
		if(con!=null)
		{
			System.out.println("connection established!!!!");
			System.out.println(con);
			
			String query = "insert into login(emaiid,password,dob,mobno)values(?,?,?,?)";
			
			java.sql.PreparedStatement st = con.prepareStatement(query);
//			st.setString(1, user.getFname());
			st.setString(1, user.getEmail());
			st.setString(2, user.getPassword());
			st.setString(3, user.getDob());
			st.setString(4, user.getMobno());
			int i = st.executeUpdate();
			System.out.println(i);
			if (i != 0) {
				System.out.println("Succefully Registered....");
		}
			
		}
		else
		{
			System.out.println("not established!!!!");
		}
	
		
		}		
		

		catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
	@Override
	public boolean login(String username, String pass)  {
	
		boolean value=false;
		System.out.println(username);
		System.out.println(pass);
		
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet","root","password");
//			System.out.println("at");
			String query="select * from login where emaiid='"+username+"' and password='"+pass+"'";
		
			PreparedStatement st = con.prepareStatement(query);
			System.out.println(con);
			ResultSet rs = st.executeQuery();
			System.out.println(rs);
//			while(rs.next())
//			{
//				System.out.println(""+rs.getString(1));
//				System.out.println(""+rs.getString(2));
//				System.out.println(""+rs.getInt(3));
//				System.out.println(""+rs.getString(4));
//			}
			boolean val = rs.next();
			if(val==true)
			{
				value=true;
				return value;
			}

			System.out.println(value);
			
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
		
		
	}
	
	
	
	public void forgotPassword(User user)
	{
		
		int k = 0;
		String email = user.getEmail();
		String pass = user.getPassword();
		String query0 = "select * from login where emaiid = ?";
		String query1 = "update login set password =? where emaiid = ?";
		try {
			try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet","root","password");
			PreparedStatement ps0 = con.prepareStatement(query0);
			PreparedStatement ps1 = con.prepareStatement(query1);

			ps0.setString(1, email);
			ps1.setString(1, pass);
			ps1.setString(2, email);
			ResultSet rs = ps0.executeQuery();
			if (rs.next()) {
				k = ps1.executeUpdate();
				System.out.println("Password Update");
			}
		} catch (SQLException e) {
			System.out.println("Password Update failed");
			e.printStackTrace();
		}
		return;

	}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
 
	
