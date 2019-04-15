<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>contentType属性值的改变 </p>
	<br/>
	是否将该jsp页面保存为word文档？
	<form action=""method="get">
	<input type="submit" value="yes" name=submit>
	</form>
	<%
		String s=request.getParameter("submit");
		if(s==null) s="";
		if(s.equals("yes"))
			response.setContentType("application/msword;charset=UTF-8");
	%>
</body>
</html>