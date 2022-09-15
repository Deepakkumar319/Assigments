<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
#head{
background-color:Red;
text-align:center;
 box-shadow: 5px 10px #888888;
}
#form1
{
text-align:center;
 width: 500px;
  border: 15px solid green;
  padding: 100px;
  margin: 200px;

}
#in1{
font-size: 35px;
}
#in2:hover {
  background-color: yellow;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CUSTOMER REGISTRATION</title>
</head>
<body>
<h1 id="head">CUSTOMER REGISTRATION FORM</h1>
<form id="form1" action="Register" method="post">
<table>
<tr id="in1"><td>CUSTOMER NAME: </td><td><input type="text" name="uname"></td></tr>
<tr id="in1"><td>Password: </td><td><input type="password" name="password"></td></tr>
<tr id="in1"><td>Email: </td><td><input type="text" name="email"></td></tr>
<tr id="in1"><td>phone: </td><td><input type="text" name="phone"></td></tr>
<tr id="in2"><td></td><td><input type="submit" value="register"></td></tr>
<option onclick="location.href='retrive.jsp'">click here to Show Customer List</option>
</form>
</body>
</html>