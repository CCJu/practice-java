<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor=“red”>
	<form action=""method="get"name=form>
	诗人李白是历史上哪个朝代的人：<br/>
	<input type="radio" name="red" value="a">唐朝
	<input type="radio" name="red" value="b">汉朝
	<input type="radio" name="red" value="c">宋朝
	<input type="radio" name="red" value="d">大天朝
	<input type="radio" name="red" value="e">隋朝
	<hr/>
	红楼梦的作者是谁：<br/>
	<input type="radio" name="re" value="a">罗贯中
	<input type="radio" name="re" value="b">曹雪芹
	<input type="radio" name="re" value="c">司马迁
	<input type="radio" name="re" value="d">鲁迅<br/><br/>
	<input type="submit"name=s value="送出">
	</form>
	<br/>
	<hr/>
	<%!
		int n=0;
	%>
	<% 
		try{
		String s=request.getParameter("red");
		String s1=request.getParameter("re");
		if(s==null) s="";
		if(s1==null) s="";
		if(s.equals("a"))
			n+=10;
		if(s1.equals("b"))
			n+=10;
		}catch(Exception e){
			out.println(e);
		}
	%>
	<br/>
	累计分数：
	<%=n %>
</body>
</html>