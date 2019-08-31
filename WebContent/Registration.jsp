<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
body{
	background-image: url('https://image.freepik.com/free-photo/wall-wallpaper-concrete-colored-painted-textured-concept_53876-31799.jpg');
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
background-color: white;
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


</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div class="container">
<div class="login_box">
<form action="Registration" method="get">
<div class="login_input">
<br><input type="text" name=email class="input_box" placeholder="Enter E-mail ID"><br>
</div>
<div class="login_input">
<br><input type="password" name="pass"class="input_box" placeholder="Set Password"><br>
</div>
<div class="login_input">
Gender:<br> <input type="radio" name="gender" value="male" checked> Male<br>
  <input type="radio" name="gender" value="female"> Female<br>
  <input type="radio" name="gender" value="other"> Other<br>
  </div>
<div class="login_input">
<input type="Date" name="dob"class="input_box" placeholder="Enter DOB">
 </div>
<div class="login_input">
<input type="text" name="mobno"class="input_box" placeholder="Enter Contact No">
 </div>
  <input type="submit" value="Register" name="register"class="submit_box">
</div></div>
 



</form>







</body>
</html>