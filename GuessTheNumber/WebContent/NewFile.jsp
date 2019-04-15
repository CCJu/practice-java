<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center"> 猜数游戏(1-100) </h1><hr/>
	<p align="center">请在文本框内输入您所猜的数</p>
	<%
		Random random=new Random();
		int n=random.nextInt(100);
		session.setAttribute("number", n);
		session.setAttribute("n", 1);
	%>
	<form action="result.jsp" method="get" name=form>
	number:<input type="text" name=text>
	<input type="submit" value="enter" name=submit>
	</form>
</body>
</html>