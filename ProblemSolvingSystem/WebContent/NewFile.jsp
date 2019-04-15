<%@page import="java.io.File"%>
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
		File file=new File("WEB-INF/files");
		if(!file.exists()) file.mkdir();
		else out.println("hello");
	%>
	<%-- <%="创建目录"+file.mkdir() %>
	<%="是目录吗："+file.isDirectory() %> --%>
</body>
</html>