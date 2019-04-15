<%@page import="java.util.HashMap"%>
<%@page import="java.util.Vector"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="girl" class="hhh.bookList" scope="session"></jsp:useBean>
	<center>
	<h1>欢迎来到购书页面，<%=session.getAttribute("user_name") %></h1>
	<form action="" method="post">
	<table border="1">
		<tr><td>书籍名称：
		<select name="bookName">
			<option value="1">jsp基础教程 </option>
			<option value="2">Servlet与jsp核心编程 </option>
			<option value="3">java程序设计 </option>
			<option value="4">数据库组成原理 </option>
		</select>
		</td></tr>
		<tr><td>购买数量：<input type="text" name="num" value="1"></td></tr>
		<tr><td><input type="submit" value="enter" name="submit"></td></tr>
	</table>
	<%
		String bookName=request.getParameter("bookName");
		if(bookName==null)
			bookName="";
		else{
		if(bookName.equals("1"))
			bookName="jsp基础教程";
		else if(bookName.equals("2"))
			bookName="Servlet与jsp核心编程";
		else if(bookName.equals("3"))
			bookName="java程序设计";
		else if(bookName.equals("4"))
			bookName="数据库组成原理";
		String num=request.getParameter("num");
		HashMap<String,String> hm=girl.getHm();
		hm.put(bookName,num );
		}
	%>
	<a href="NewFile2.jsp">查看购买清单</a>
	</form>
	</center>
</body>
</html>