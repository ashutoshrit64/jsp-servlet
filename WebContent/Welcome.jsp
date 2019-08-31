<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.Connection,java.sql.DriverManager,java.sql.PreparedStatement,java.sql.ResultSet"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	if(session.getAttribute("user")==null)
	{
		response.sendRedirect("LogIn.jsp");
	}
	else{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.print("<h1>");
		out.print("User Data");
		out.print("</h1>");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet","root","password");
		Object demo=session.getAttribute("user");
		String query="select * from login where emaiid='"+demo+"'";
		PreparedStatement st = con.prepareStatement(query);
		System.out.println(con);
		ResultSet rs = st.executeQuery();
		while(rs.next())
		{
			out.print("Email id:"+rs.getString(1));
			out.println("\n<br>");
			out.print("Password:"+rs.getString(2));
			out.println("\n<br>");
			out.print("Birthdate"+rs.getString(3));
			out.println("\n<br>");
			out.print("Contact No."+rs.getString(4));
			out.println("\n<br>");
		}
//	out.print(session.getAttribute("user"));
	
	}
	
	
%>


Welcome you are succesfully log in!!!
<form action="Logout">
<input type="submit" value="Logout" name="logout"></form>
</body>
</html>