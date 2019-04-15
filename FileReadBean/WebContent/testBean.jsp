<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="girl" class="hello.Read" scope="session"/>
	<jsp:setProperty name="girl" property="path" value="/Users/mac1/Desktop/web 应用程序/BeanUseTest/WebContent"></jsp:setProperty>
	<jsp:getProperty name="girl" property="path" ></jsp:getProperty>
	<%
		String []file=girl.getFileList();
		for(int i=0;i<file.length;i++)
			out.println("<br/>"+file[i]);
	%>
</body>
</html>