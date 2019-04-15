<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>这是标题一字体的大小</h1>
	<h2>这是标题二字体的大小</h2>
	<%
		int a=100,b=300;
		boolean c=true;
		out.println(a);
		out.println(b);
		out.println(c);
	%>
	<center>
	<p>以下是一个表格</p>
	<%
		out.println("<Table border>");
		out.println("<TR >");
			out.println("<TH>姓名<TH/>");
			out.println("<TH>性别<TH/>");
			out.println("<TH>出生年月<TH/>");
		out.println("<TR >");
			out.println("<TH>刘加一<TH/>");
			out.println("<TH>男<TH/>");
			out.println("<TH>1978年7月6日<TH/>");
		out.println("<TR >");
			out.println("<TH>张飞<TH/>");
			out.println("<TH>女<TH/>");
			out.println("<TH>1869年8月2日<TH/>");
		out.println("<Table/>");
	%>
	</center>
</body>
</html>