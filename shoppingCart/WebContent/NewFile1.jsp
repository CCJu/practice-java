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
		if(s==null) s="";
		else {
			if(s.equals(""))
				response.sendRedirect("NewFile.jsp");
			else{
				byte []b=s.getBytes("ISO-8859-1");
				s=new String(b); 
				session.setAttribute("name", s);
			}
		}
	%>
	<%="欢迎您来到第一百货大楼,"+s+"!" %>
	<br/>
	 请输入您要购买的商品名称：<br/>
	<form action="NewFile2.jsp" method="get" name="fo">
	<input type="text" name="na">
	 <input type="submit" value="送出" name=submit>
	</form>
</body>
</html>