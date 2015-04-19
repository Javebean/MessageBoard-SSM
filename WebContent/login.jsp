<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>留言板示例</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/message/Login" method="post">
		<table>
			<tr>
				<td>用户名：</td>
				<td><input name="user.username" type="text" /></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input name="user.password" type="password" /></td>
			</tr>
			<tr>
				<td><input value="登录" type="submit" /></td>
				<td><input value="清空" type="reset" /></td>
			</tr>
		</table>
	</form>
	<p>
		<a href="register.jsp">注册</a> 新用户
	</p>
	
</body>
</html>