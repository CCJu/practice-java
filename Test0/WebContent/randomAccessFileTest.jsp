<%@page import="java.io.RandomAccessFile"%>
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
	<h1>hello world</h1>
	<%
		String s=null;
		try{
			RandomAccessFile raf=new RandomAccessFile(new File("/Users/mac1/Desktop/web 应用程序/Test0/WebContent/大主宰.txt"),"rw");
			while((s=raf.readUTF())!=null){
				byte []b=s.getBytes("ISO-8859-1");
				s=new String(b);
				out.println(s);
			}
			raf.close();
		}catch(IOException e){
			out.println(e);
		}
	%>
</body>
</html>