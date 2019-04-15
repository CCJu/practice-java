<%@page import="java.util.Vector"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
		Vector <String>v=new Vector<String>();
		ServletContext application;
		synchronized void sendMessages(String s){
			application=getServletContext();
			v.add(s);
			application.setAttribute("messages", v);
		}
	%>
	<%
		String name=request.getParameter("name");
		String title=request.getParameter("title");
		String messages=request.getParameter("messages");
		String time=new Date().toString();
		if(name==null) name="";
		if(title==null) title="";
		if(messages==null) messages="";
		if(name.equals("")) name="guess guess look";
		if(title.equals("")) title="无标题";
		if(messages.equals("")) messages="无内容";
		String s=name+"##"+title+"##"+time+messages;
		sendMessages(s);
	%>
	<center>
	<h1>留言保存成功</h1>
	<a href="NewFile.jsp"> 返回</a>
	<a href="showMessages.jsp">查看留言板</a>
	</center>
</body>
</html>