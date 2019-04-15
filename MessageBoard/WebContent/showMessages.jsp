<%@page import="java.util.Vector"%>
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
	<%
		String name=null,title=null,messages=null;
		Vector<String> v=(Vector)application.getAttribute("messages");
		out.println("<Table border>");
		out.println("<TR>");
			out.println("<TH>"+"姓名"+"</TH>");
			out.println("<TH>"+"主题"+"</TH>");
			out.println("<TH>"+"留言内容"+"</TH>");
		out.println("</TR>");
		for(int i=0;i<v.size();i++){
			String []str=v.get(i).split("##");
			byte []b1;
			byte []b2;
			byte []b3;
			b1=str[0].getBytes("ISO-8859-1");
			name=new String(b1);
			b2=str[1].getBytes("ISO-8859-1");
			title=new String(b2);
			b3=str[2].getBytes("ISO-8859-1");
			messages=new String(b3);
			out.println("<TR>");
			out.println("<TH>"+name+"</TH>");
			out.println("<TH>"+title+"</TH>");
			out.println("<TH>"+messages+"</TH>");
			out.println("</TR>");
		}
		out.println("</Table>");
	%>
	<br/>
	<a href="NewFile.jsp">返回</a>
</body>
</html>