<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor=yellow>
	<FORM action="" method=get name=form>
	radius:<input type="text" name=radius>
	<input type="submit" value="送出" name=submit >
	</FORM>
	<%!
		class Circle{
			double r;
			Circle(double r){
				this.r=r;
			}
			public double getC(){
				return 2*r*Math.PI;
			}
			public double getS(){
				return Math.PI*r*r;
			}
		}
		Circle c;
	%>
	<%
		String s=request.getParameter("radius");
		double b; 
		if(s!=null){
			b=Double.parseDouble(s);
			c=new Circle(b);
	%>
		输入的半径为：<br/>
		<%=s %><br/>
		该圆的周长:<br/>
		<%=c.getC()%><br/>
		该圆的面积:<br/>
		<%=c.getS() %><br/>
	<% 
		}
		else{
	%>
	<%
		out.println("半径不能为空，请重新输入！！");
		}
	%>
		
	
		
</body>
</html>