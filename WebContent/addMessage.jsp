<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Post Message</title>
</head>
<body>
	<form action="${pageContext.request.contextPath}/message/AddMessage" method="post">
		<table border="1">
			<caption>Post Message</caption>
			<tr>
				<td>title</td>
				<td><input type="text" name="title" /></td>
			</tr>
			<tr>
				<td>content</td>
				<td><textarea name="content" rows="5" cols="35"></textarea></td>
			</tr>
		</table>
		<input type="submit" value="post" /> <input type="reset" value="reset" />
	</form>
</body>
</html>