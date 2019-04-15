<%@page import="java.io.*"%>
<%@page import="java.io.OutputStream"%>
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
		OutputStream o=response.getOutputStream();
		byte b[]=new byte[500];
		File file=new File("/Users/mac1/Desktop/学习/book.zip");//下载文件的地址
		//客户使用保存文件的对话框
		response.setHeader("Content-disposition", "attachment;filename="+"book.zip");
		//通知客户文件的MIME类型
		response.setContentType("application/x-tar");
		//通知客户文件的长度
		long fileLength=file.length();
		String length=String.valueOf(fileLength);
		response.setHeader("Content_Length", length);
		//读取文件book.zip，并发送给客户下载
		FileInputStream in=new FileInputStream(file);
		int n=0;
		while((n=in.read())!=-1){
			o.write(b, 0, n);
		}
		in.close();
	%>
</body>
</html>