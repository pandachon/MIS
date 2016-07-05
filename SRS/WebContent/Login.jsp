<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="javax.servlet.http.Cookie,java.sql.*,java.net.URLDecoder" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>--登录--</title>
<style type="text/css">
	form { width: 300px; margin: 200px auto; }
</style>
</head>

<body>
<h3>
				学生选课系统
			</h3>
			<h3 class="text-center">
				登录
			</h3>
			<form action="Login" method="post">
					 <label for="inputEmail">账号</label>
						<input id="inputEmail" name="username" type="text" />
						<br/>
					 <label for="inputPassword">密码</label>
						<input id="inputPassword"  name="password" type="password" />

						<br/>
						<input type="radio" name="identity" value="student" checked="checked" />学生 
						<input type="radio" name="identity" value="professor" />教师 
						<input type="radio" name="identity" value="admin" />管理员
						 <label class="checkbox"><input type="checkbox" /> Remember me</label> <button type="submit">登陆</button>		
			</form>
</body>
</html>