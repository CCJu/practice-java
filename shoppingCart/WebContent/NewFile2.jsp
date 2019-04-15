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
		String str=null;
		String s=request.getParameter("na");
		if(s==null) s="";
		else{
			if(s.equals(""))
				response.sendRedirect("NewFile1.jsp");
			else{
				byte []b=s.getBytes("ISO-8859-1");
				s=new String(b); 
				str=(String)session.getAttribute("name");
				out.println("欢迎"+str+"来到第一百货");
				
			}	
		}	
	%>
	<table border>
		<TR width="100">
			<TH width="100">姓名
			<TH width="100">商品
		<TR width="100">
			<TD width="100"><%=str %>
			<TD width="100"><%=s %>
	</table>
</body>
</html>