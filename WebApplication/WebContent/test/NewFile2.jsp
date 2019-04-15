<%@page import="java.util.Iterator"%>
<%@page import="java.util.Set"%>
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
	<%
		HashMap<String,String> hm=girl.getHm();
		Set<String> s=hm.keySet();
		Iterator<String> it=s.iterator();
	%>
<center>
	<h1>亲爱的<%=session.getAttribute("user_name")+"以下是您的购物清单" %></h1>
	<table border="1">
	<tr><td>书名</td><td>数量</td></tr>
	<%
		while(it.hasNext()){
			String bookName=it.next();
			out.println("<tr><td>"+bookName+"</td>"+"<td>"+hm.get(bookName)+"</td></tr>");
		}
	%>
	</table>
</center>
</body>
</html>