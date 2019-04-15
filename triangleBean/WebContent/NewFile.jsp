<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="" method="get" name="form">
	a:<input type="text" name="a"><br/>
	b:<input type="text" name="b"><br/>
	c:<input type="text" name="c"><br/>
	<input type="submit" value="enter" name="submit"><br/>
	<jsp:useBean id="girl" class="hello.triangle" scope="page"></jsp:useBean>
	<jsp:setProperty name="girl" property="a" param="a"></jsp:setProperty>
	<jsp:setProperty name="girl" property="b" param="b"></jsp:setProperty>
	<jsp:setProperty name="girl" property="c" param="c"></jsp:setProperty>
	</form>
	<jsp:getProperty name="girl" property="a"></jsp:getProperty><br/>
	<jsp:getProperty name="girl" property="b"></jsp:getProperty><br/>
	<jsp:getProperty name="girl" property="c"></jsp:getProperty><br/>
	<%=girl.getArea() %><br/>
	<%=girl.isTriangle()%><br/>
	<%-- <jsp:getProperty name="girl" property="isTri"></jsp:getProperty><br/> --%>
</body>
</html>