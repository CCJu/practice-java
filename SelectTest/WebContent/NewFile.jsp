<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="red">
	<%!
		public int getN(int n){
			 int s=0;
			 for(int i=1;i<=n;i++)
				 s+=i;
			 return s;
		}
		public int getNN(int n){
			 int s=0;
			 for(int i=1;i<=n;i++)
				 s+=i*i;
			 return s;
		}
		public double getn(int n){
			double s=0;
			for(int i=1;i<=n;i++)
				s+=(1.0/i);
			return s;
		}
	%>
	<form action="" method="get" name="form">
	功能选择：
	<Select name="hi" >
		<Option value="a">1--n的和
		<Option value="b">1--n*n的和
		<Option value="c">1--1/n的和
	</Select>
	<br/>
	n:<input type="text" name="ha"><br/>
	<input type="submit" value="enter" name="h">
	</form>
	<%	
	try{
		int a=0;
		String s=request.getParameter("hi");
		String s1=request.getParameter("ha");
		if(s==null)
			a=0;
		else{
			a=Integer.parseInt(s1);
			if(s.equals("a"))
				out.println("计算结果为："+getN(a));
			if(s.equals("b"))
				out.println("计算结果为："+getNN(a));
			if(s.equals("c"))
				out.println("计算结果为："+getn(a));
			}
	}catch(Exception e){
		out.println(e);
	}
	%>
</body>
</html>