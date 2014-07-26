<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="app.bokubake.sample.bean.TestHelloDTO" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello JSP</title>
</head>
<body>
 <table bgcolor="black"  align="center">
   <tr bgcolor="yellow">
     <th width="20px">ID</th>
     <th width="100px">TITLE</th>
   </tr>
   <c:forEach items="${titleList}" var="testHello" >
    <tr align="center" bgcolor="white">
      <td><c:out value="${testHello.id}"/></td>
	  <td><c:out value="${testHello.title}"/></td>
    </tr>
   </c:forEach>
 </table>
</body>
</html>