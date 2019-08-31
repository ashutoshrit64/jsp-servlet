package com.bridgelabz.repository;

import java.sql.Connection;
import java.sql.DriverManager;

public class connection {
	public static void main(String args[]) throws Exception
	{ 
	Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet","root","password");
			if(con!=null)
			{
				System.out.println("connection established!!!!");
				System.out.println(con);
				con.close();
			}
			else
			{
				System.out.println("not established!!!!");
			}
}
}