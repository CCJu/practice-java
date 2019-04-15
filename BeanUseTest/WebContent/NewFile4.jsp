<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="girl" class="hello.Circle2" scope="session"></jsp:useBean>
	<jsp:getProperty name="girl" property="r"></jsp:getProperty><br/>
	<jsp:getProperty name="girl" property="area"></jsp:getProperty><br/>
	<jsp:getProperty name="girl" property="length"></jsp:getProperty><br/>
	
</body>
</html>