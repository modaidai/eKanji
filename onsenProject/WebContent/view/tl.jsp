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

<body onLoad="MM_preloadImages('<%= request.getContextPath() %>/images/r1_c2_s1.jpg')">
<div id="main">


 <div id="breadcrumb"><a href="<%= request.getContextPath() %>/view/tl.jsp" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('tweet','','<%= request.getContextPath() %>/images/r1_c1_s1.jpg',1)"><img src="<%= request.getContextPath() %>/images/1_r1_c1.jpg" alt="Tweet" name="tweet" width="150" height="32" border="0"></a><a href="<%= request.getContextPath() %>/Tweet" onMouseOut="MM_swapImgRestore()" onMouseOver="MM_swapImage('ShowTag','','<%= request.getContextPath() %>/images/r1_c2_s1.jpg',1)"><img src="<%= request.getContextPath() %>/images/1_r1_c2.jpg" alt="ShowTag" name="ShowTag" width="150" height="32" border="0"></a><img name="n1_r1_c3" src="<%= request.getContextPath() %>/images/1_r1_c3.jpg" width="500" height="32" border="0" id="n1_r1_c3" alt="" />

  	
</div>
  
  <div id="content">
    <p><img src="<%= request.getContextPath() %>/images/temp_binsen_suika01.jpg" width="800" height="1000"><br>
    </p>
  </div>
<div id="foot"></div>
</div>



</body>
</html>
