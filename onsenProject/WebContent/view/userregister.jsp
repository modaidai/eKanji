<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>ログイン画面</title>
<link href="../css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div id="main">
  <div id="head"></div>
  <div id="breadcrumb"> breadcrumb </div>

  <div id="content">
  <!--ここから下に中身を記述して下さい。-->
		<div id="form">
   		<p class="form-title">ユーザー登録</p>
  		<form action="<%= request.getContextPath() %>/UserRegister"  method="post">
        <p>ID</p>
        <p class="mail"><input type="id" name="id" /></p>
        <p>Email</p>
        <p class="mail"><input type="email" name="mailaddress" /></p>
        <p>Password</p>
        <p class="pass"><input type="password" name="password" /></p>
        <p>確認用Password</p>
        <p class="pass"><input type="comfirmingpassword" name="comfirmingpassword" /></p>

<p class="submit"><input type="submit" value="登録" /></p>
        </form>



<!--ここからは編集しないで下さい-->
</div>
</div>
<div id="foot"></div>
</div>
</body>
</html>
