<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<P align="center"> 比正确答案大 </P><hr/>
	<%
		int n=(Integer)session.getAttribute("n");
		session.removeAttribute("n");
		n++;
		session.setAttribute("n", n);
	%>
	<form action="result.jsp" method="get" name=form>
	number:<input type="text" name=text>
	<input type="submit" value="enter" name=submit>
	</form>
</body>
</html>