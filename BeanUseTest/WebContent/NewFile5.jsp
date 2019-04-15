<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="girl" class="hello.Circle2" scope="page"></jsp:useBean>
	<jsp:getProperty name="girl" property="r"></jsp:getProperty>
	<form action="" method="get" name="form">
	<input type="text" name="r">
	<input type="submit" value="enter" name="submit">
	</form>
	<jsp:setProperty name="girl" property="r" param="r"></jsp:setProperty><br/>
	<%-- <jsp:setProperty name="girl" property="*" ></jsp:setProperty><br/> --%>
	<jsp:getProperty name="girl" property="r"></jsp:getProperty>
	<!--   	
		<jsp:setProperty name="girl" property="r" value="10" ></jsp:setProperty><br/>
	-->
	
</body>
</html>