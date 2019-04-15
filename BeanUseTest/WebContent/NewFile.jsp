<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="girl" class="hello.Circle" scope="page"></jsp:useBean>
	<form action="" method="get" name="form">
	R:<input type="text" name="r"><br/>
	<input type="submit" value="enter" name="submit">
	</form>
	<%
		String s=request.getParameter("r");
		if(s==null)
			s="";
		if(s.equals(""))
			out.println("输入为空");
		else{
			double r=Double.parseDouble(s);
			girl.setR((int)r);
			out.println("R:"+r+"<br/>");
			out.println("S:"+girl.getArea()+"<br/>");
			out.println("C"+girl.getLength()+"<br/>");
		}
	%>
</body>
</html>