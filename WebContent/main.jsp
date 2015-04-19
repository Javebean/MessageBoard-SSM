<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.example.messageboard.model.User"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>登录成功</title>
</head>
<body>
<h1>登录成功222</h1>
<p>会话中的user对象：<s:property value="#session.user.username"/></p>
<p>请求中的user对象：<s:property value="#request.user.username"/></p>
<jsp:useBean id="user" class="com.example.messageboard.model.User" scope="session"></jsp:useBean>
<jsp:getProperty property="username" name="user"/>
<s:debug/>
</body>
</html>