<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>错误提示</title>
</head>
<body>
<h1>输入有误</h1>
<p>
<s:fielderror fieldName="username" />
<s:fielderror fieldName="password"/>
<s:fielderror fieldName="password2"/>
<s:fielderror fieldName="email" />
<s:fielderror fieldName="month"/>
<s:fielderror fieldName="day" />
</p>
<p><a href="register.jsp">点此重新注册</a></p>
</body>
</html>