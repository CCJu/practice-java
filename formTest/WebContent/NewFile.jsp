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
	<p>请输入一个正数：</p><br/><input type="text" name="number">
	<input type="submit" name=submit value="送出">
	</form>
	<%
		String s=request.getParameter("number");
		if(s!=null){
			double b=Double.parseDouble(s);
			out.println(Math.sqrt(b));
		}
	%>
</body>
</html>