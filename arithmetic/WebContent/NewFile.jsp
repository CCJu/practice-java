<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="ee" class="hhh.arithmetic" scope="session"></jsp:useBean>
	<form action="" method="post" name="form">
	<input type="text" name="a">
	<select name="s">
		<option value="+">+</option>
		<option value="-">-</option>
		<option value="*">*</option>
		<option value="/">/</option>
	</select>
	<input type="text" name="b">
		<input type="submit" value="enter">
	</form>
	<jsp:setProperty name="ee" property="*"/>
	<%
		String s=request.getParameter("s");
		if(s==null)
			s="";
		s=ee.getResult(s);
	%>
		=<input type="text" value="<%=s %>"><br/>
</body>
</html>