<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	 得到文本框的信息：
	 <%
	 	String s=request.getParameter("hello"); 
	 	byte []b=s.getBytes("ISO-8859-1");
	 	s=new String(b);
	 %>
	 <%=s %><br/>
	 得到按钮名字：<%String s1=request.getParameter("submit"); %> <%=s1 %>
	 
</body>
</html>