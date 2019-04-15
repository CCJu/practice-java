<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<font size=30 color="red">恭喜！！！正确！！</font> <br/>
	<%
		int n=(Integer)session.getAttribute("number");
	%>
	正确答案为：<%=n %><br/>
	<%
		int n0=(Integer)session.getAttribute("n");
	%>
	一共用了<%=n0 %>次猜对结果<br/>
	
</body>
</html>