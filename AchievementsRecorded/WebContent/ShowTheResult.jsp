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
			DataInputStream dis=new DataInputStream(new FileInputStream(new File("/Users/mac1/Desktop/web 应用程序/Test21/WebContent/messages.txt")));
			int i=0;
			while(i<=7){
				byte b[]=dis.readUTF().getBytes("ISO-8859-1");
				String s=new String(b);
				out.println(s);
			}
		
		
			dis.close();
		}catch(IOException e){
			
		}
	%>
</body>
</html>