<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="NewFile1.jsp" method="get" name="form">
	<input type="text" name=hi>
	<input type="submit" value="enter" name="submit">
	</form>
	<%
		String s=session.getId();
	%>
	您的sessionID是：<br/><%=s %><br/>
	
	单击超链接<a href="NewFile1.jsp">NewFile1.jsp跳转</a>
</body>
</html>