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
		String s=request.getParameter("text");
		if(s==null)
			s="";
		else if(s.equals(""))
				response.sendRedirect("NewFile.jsp");
			else{
			int n=Integer.parseInt(s);
			int n0=(Integer)session.getAttribute("number");
			if(n>n0)
				response.sendRedirect("big.jsp");
			else if(n<n0)
				response.sendRedirect("small.jsp");
			else if(n==n0)
				response.sendRedirect("success.jsp");
			}
	%>
</body>
</html>