<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String s=request.getParameter("hi");
		String s0=session.getId();
	%>
	<%="欢迎"+s+"来到该页面" %>
	<br/>
	您的sessionID是：<%=s0 %>
	<br/>
	<a href="NewFile2.jsp">超链接NewFile2.jsp</a>
	
</body>
</html>