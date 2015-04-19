<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>注册用户</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/message/Register" method="post">
		<table>
			<caption>注册用户</caption>
			
			<tr>
				<td>学工号：</td>
				<td><input type="text" name="user.id" /></td>
			</tr>
			<tr>
				<td>用户名：</td>
				<td><input type="text" name="user.username" /></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input type="password" name="user.password" /></td>
			</tr>
			<tr>
				<td>确认密码：</td>
				<td><input type="password" name="password2" /></td>
			</tr>
		</table>
		<input type="submit" value="注册" /> <input type="reset" value="清空" />
	</form>
</body>
</html>