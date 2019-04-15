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
	<%
		try{
		InputStream in=request.getInputStream();
		FileOutputStream fos=new FileOutputStream(new File("/Users/mac1/Desktop/web 应用程序/FileUpload/WebContent/b.txt"));
		byte []b=new byte[1000];
		int n;
		while((n=in.read(b))!=-1)
			fos.write(b,0,n);
		fos.close();
		}catch(IOException e){
			out.println(e);
		}
	%>
</body>
</html>