<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login JSP</title>
</head>
<body>
 <form action="/UserLogin" method="post" >
 <table align="center" cellpadding="1" >
   <tr>
     <td width="50">USER ID</td>
     <td width="100"><input type="text" size="20" name="userId"></td>
   </tr>
   <tr>
     <td>PASSWORD</td>
     <td><input type="password" name="passwd" size="20"></td>
   </tr>
 </table>
 <br>
 <input type="submit" value="login" >
</form>
</body>
</html>