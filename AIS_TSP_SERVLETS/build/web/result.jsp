<%-- 
    Document   : result
    Created on : 07.10.2022, 18:37:59
    Author     : Admin
--%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ page import="AIS_SERVLETS.ResultForm" %>
<%
	request.setCharacterEncoding("UTF-8");
%>
<html>
<head>
<title>Решение квадратного уравнения</title>
</head>
<body>
<a href="Main">Назад</a><br/><br/>
	Решение квадратного уравнения:<br/>
	<%
	ResultForm form = (ResultForm)request.getAttribute("form");
        
	if (form==null) { out.print("Нет решения!<br/><br/>"); }
	else {
		out.println(String.format("Ответ:%.3f<br/>",form.getD()));
		
	}
%>
</html>
