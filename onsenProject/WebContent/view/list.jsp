<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>ぼくたちの夏休み</title>
<link href="<%= request.getContextPath() %>/css/style.css" rel="stylesheet" type="text/css" />
</head>

<body>
<div id="main">


<div id="breadcrumb">
<a href="<%= request.getContextPath() %>/view/tl.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('tweet','','<%= request.getContextPath() %>/images/r1_c1_s1.jpg',1)">
	<img src="<%= request.getContextPath() %>/images/1_r1_c1.jpg" alt="Tweet" name="tweet" width="150" height="32" border="0">
</a>

<a href="<%= request.getContextPath() %>/Tweet" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('ShowTag','','<%= request.getContextPath() %>/images/r1_c2_s1.jpg',1)">
	<img src="<%= request.getContextPath() %>/images/1_r1_c2.jpg" alt="ShowTag" name="ShowTag" width="150" height="32" border="0">
</a>

  	
</div>
  
	<div id="content" style="height:500px">
	<table style="width:80%">
		<tr>
			<td>No.</td>
			<td>メンバー名</td>
			<td>どんな夏休みだった？</td>
			<td>写真</td>
		</tr>
		<tr>
			<td>1</td>
			<td>とくとく</td>
			<td>ぼくは、８月にたっぷり食べあるきです。もちろんじゃないですか</td>
			<td>写真</td>
		</tr>		
	</table>
	</div>
<div id="foot"></div>
</div>



</body>
</html>
