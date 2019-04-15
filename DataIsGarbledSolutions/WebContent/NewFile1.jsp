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
		String s=request.getParameter("name");
		if(s==null)
			s="";
		byte []b=s.getBytes("ISO-8859-1");
		s=new String(b);
		if(s.equals(""))
			response.sendRedirect("NewFile.jsp");
		else{
			out.println("欢迎来到本页面");
			out.println(s);
		}
	%>
</body>
</html>