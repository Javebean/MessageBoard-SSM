<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>留言板内容</title>
</head>
<body>
	<table border="1">
		<caption>Messages</caption>
		<tr>
			<th>User Name</th>
			<th>Time</th>
			<th>Title</th>
			<th>Content</th>
		</tr>
		<c:forEach var="m" items="${allMessages}">
				<tr>
					<th>${m.username}</th>
					<th>${m.date }</th>
					<th>${m.title }</th>
					<th>${m.content}</th>
				</tr>
		</c:forEach>
		
		
	</table>
	<p>
		<a href="addMessage.jsp">click here</a> for posting your message!
	</p>
</body>
</html>