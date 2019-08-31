<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	if(session.getAttribute("email")==null)
	{
		response.sendRedirect("Registration.jsp");
	}
	else if(session.getAttribute("pass")==null)
	{
		response.sendRedirect("Registration.jsp");
	}
	else if(session.getAttribute("dob")==null)
	{response.sendRedirect("Registration.jsp");
		
	}else if(session.getAttribute("mobno")==null)
	{
		response.sendRedirect("Registration.jsp");
	}


%>



Registration Done Succesfully!!!!!!!!!<br>
<a href="LogIn.jsp"><input type="submit" value="login" name="login"></a> 
</body>
</html>