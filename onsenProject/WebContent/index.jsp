<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html lang="ja">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Login JSP</title>
<link href="./css/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<div id="main">
		<div id="head"></div>
		<div id="breadcrumb">breadcrumb</div>

		<div id="content">
			<!--ここから下に中身を記述して下さい。-->
			<div id="form">
				<p class="form-title">Login</p>
				<form action="/UserLogin" method="post">
					<p>User ID</p>
					<p class="mail">
						<input type="email" name="userId" />
					</p>
					<p>Password</p>
					<p class="pass">
						<input type="password" name="passwd" />
					</p>

					<a href="/UserRegister" target="_self">新規登録の方はこちらへ</a>
					<p class="submit">
						<input type="submit" value="Login" />
					</p>
				</form>



				<!--ここからは編集しないで下さい-->
			</div>
		</div>
		<div id="foot"></div>
	</div>
</body>
</html>
