<%@page import="java.util.Vector"%>
<%@page import="java.io.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">开始考试</h1><hr/>
	<%!
		String s1="",s2="";
		Vector<String> v;
		synchronized void readText(String s){
			v=new Vector<String>();
			v.add(s);
				
		}
		public String[] getMessages(String str){
			String []s=str.split("#");
			return s;
		}
	%>
	<%
		String s;
		try{
			BufferedReader br=new BufferedReader(new FileReader(new File("/Users/mac1/Desktop/web 应用程序/Test19/WebContent/test.txt")));
			for(;(s=br.readLine())!=null;)
				readText(s);
			br.close();
		}catch(IOException e){
			out.println(e);
		}
		session.setAttribute("test", v);
	%>
	<%
		Vector <String>ve=(Vector)session.getAttribute("test");
		String []str=getMessages(ve.get(0));
		out.println(str[1]);
		session.setAttribute("answer", str[6]);
	%>
	<form action="" method="get" name=form>
	<input type="radio" value="A" name="answer" >
	<%=str[2] %><br/>
	<input type="radio" value="B" name="answer">
	<%=str[3] %><br/>
	<input type="radio" value="C" name="answer">
	<%=str[4] %><br/>
	<input type="radio" value="D" name="answer">
	<%=str[5] %><br/>
	<input type="submit" value="确认">
	</form>
	<br/>
	<%
		if(request.getParameter("answer")=="A"){
			s1=request.getParameter("answer");
			s2=(String)session.getAttribute("answer");
			out.println("恭喜回答正确！");
		}
		else if(request.getParameter("answer")=="B"||request.getParameter("answer")=="C"||request.getParameter("answer")=="D"){
			s1=request.getParameter("answer");
			s2=(String)session.getAttribute("answer");
			out.println("回答错误！");
		}
	%>
	<br/>
	您选择的答案是：<%= s1%><br/>
	正确答案是：<%= s2%><br/>
</body>
</html>