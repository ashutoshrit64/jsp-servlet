<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body{
	background-image: url('https://wallpaperplay.com/walls/full/3/c/4/164624.jpg');
	background-size: cover;
}
.container{
margin: 0px auto;
width: 900px;
padding: 50px ;
} 
.login_box{
padding:20px 20px;
width: 300px;
box-shadow: 0px 0px 10px black;
border-radius: 10px;
background-color:white;
}
.login_input{
width: 100%;
padding: 10px 10px;
}
.input_box{
width: 90%;
padding: 10px 10px;
}
.submit_box{
width: 100%;
padding: 10px 10px;
}
a{
text-decoration: none;
}
h1{
text-align: center;
}
</style>
</head>
<body>
<div class="container">
<form action="Login">
<h1 style="color:white;">WELCOME TO LOGIN PAGE!!!</h1>
<div class="login_box">
<div class="login_input">
<input type="text" name="user" class="input_box" placeholder="Enter E-mail ID" >
</div>
<div class="login_input">
<input type="password" name ="pass" class="input_box" placeholder="Enter Password">
</div>
<div class="login_input">
<input type="submit" value="Login" name="login" length=20 class="submit_box">
</div>
<div class="login_input">
      <a href="ForgotPass.jsp"style="color:black;" >Forgot Password </a> &nbsp;&nbsp;|&nbsp;&nbsp;
      <a href="Registration.jsp" style="color:black;">New User</a>
</div>
</form>
</div>
</div>
</body>
</html>