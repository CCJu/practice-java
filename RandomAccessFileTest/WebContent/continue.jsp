<%@page import="java.io.*"%>
<%@page import="java.io.RandomAccessFile"%>
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
		synchronized void readFile(File file){
			try{
				RandomAccessFile raf=new RandomAccessFile(file,"rw");	
			}catch(IOException e){
				
			}
		}
	%>
	<%
		String s=request.getParameter("file");
		
	%>
</body>
</html>