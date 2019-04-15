<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="red">
	<form action=""method="get"name=form>
	<h1 align="center">根据三角形三边求面积</h1>
	边长a：<input type="text" name="a"><br/>
	边长b：<input type="text" name="b"><br/>
	边长c：<input type="text" name="c"><br/>
	<input type="submit" value="送出" name=submit><br/>
	</form>
	<%
		try{
		String s1=request.getParameter("a");
		String s2=request.getParameter("b");
		String s3=request.getParameter("c");
		double a=Double.parseDouble(s1);
		double b=Double.parseDouble(s2);
		double c=Double.parseDouble(s3);
		if(a+b>c&&a+c>b&&b+c>a){
			double p=(a+b+c)/2;
			double s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
			out.println("该三角形的面积为："+s);
		}else
			out.println("该三边长不能构成三角形");
		}catch(Exception e){
	%>
		<%=e%>
	<%
		}
	%>
</body>
</html>