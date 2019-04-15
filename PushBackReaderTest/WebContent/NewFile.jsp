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
	 		File file=new File("/Users/mac1/Desktop/web 应用程序/Test19/WEBContent/NewFile1.jsp");
	 		PushbackReader pr=new PushbackReader(new FileReader(file));
	 		char []b=new char[1];
	 		int  c;
	 		while((c=pr.read(b, 0, 1))!=-1){
	 			String s=new String(b);
	 			if(s.equals('<')){
	 				pr.unread('&');
	 				pr.read(b, 0, 1);
	 				out.println(new String(b));
	 				pr.unread('L');
	 				pr.read(b, 0, 1);
	 				out.println(new String(b));
	 				pr.unread('T');
	 				pr.read(b, 0, 1);
	 				out.println(new String(b));
	 			}else if(s.equals('>')){
	 				pr.unread('&');
	 				pr.read(b, 0, 1);
	 				out.println(new String(b));
	 				pr.unread('G');
	 				pr.read(b, 0, 1);
	 				out.println(new String(b));
	 				pr.unread('T');
	 				pr.read(b, 0, 1);
	 				out.println(new String(b));
	 			}else if(s.equals("\n"))
	 				out.println("<br/>");
	 			else
	 				out.println(s);
	 		}
	 		pr.close();
	 	}catch(IOException e){
	 		out.println(e);
	 	}
	 %>
</body>
</html>