<%@page import="java.io.*"%>
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
		File file=new File("/Users/mac1/Desktop/web 应用程序/TomcatTest/WebContent/hello/messages.txt");
		synchronized void write(String s){
			try{
			FileOutputStream bw=new FileOutputStream(file,true);
			bw.write(s.getBytes());
			bw.close();
			}catch(IOException e){			
			}
		}
	%>
	<%
		String name=request.getParameter("name");
		String sex=null;
		if(request.getParameter("sex").equals("1")) sex="男";
		else sex="女";
		String address=request.getParameter("address");
		String email=request.getParameter("email");
		String s=request.getParameter("like");
		String phone=request.getParameter("phone");
		String str=name+"#"+sex+"#"+phone+"#"+address+"#"+email+"#"+s;
		write(str);
	%>
	<h1 align="center">保存成功</h1>
	<center>
	<a href="NewFile.jsp">返回</a>
	<a href="ShowMessages.jsp">显示个人信息</a><br/>
	</center>
</body>
</html>