<%@page import="java.util.Enumeration"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Vector"%>
<%@page import="java.util.Hashtable"%>
<%@page import="java.io.File"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.ObjectInputStream"%>
<%@page import="java.io.IOException"%>
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
		Hashtable<String,String> ht=new Hashtable<String,String>();
		try{
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("/Users/mac1/Desktop/web 应用程序/Test22/WebContent/goods_name.txt")));
			ht=(Hashtable)ois.readObject();
			ois.close();
		}catch(IOException e){
			out.println(e);
		}
		Enumeration e=ht.keys();
		out.println("<table border>");
		out.println("<TR>");
		out.println("<TH>"+"货物名称"+"</TH>");
		out.println("<TH>"+"货物数量"+"</TH>");
		out.println("</TR>");
		while(e.hasMoreElements()){
			String s=(String)e.nextElement();
			out.println("<TR>");
			out.println("<TH>"+s+"</TH>");
			out.println("<TH>"+ht.get(s)+"</TH>");
			out.println("</TR>");
		}
		out.println("</table>");		
	%>
	<a href="NewFile.jsp">录入界面</a>
</body>
</html>