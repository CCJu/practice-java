<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<FORM action="" method=get name=form>
	 请输入1-100的整数：<input type="text" name="number"><br/>
	 <input type="submit" value="送出" name=submit>
	</FORM>
	<%
		String s=request.getParameter("number");
		int a;
		if(s==null)
			a=0;
		else
			a=Integer.parseInt(s);
		try{
			if(a>=1&&a<=50){
	%>	
		<jsp:forward page="two.jsp">
		<jsp:param name="number" value="<%=a %>"/>
		</jsp:forward>
	<%	
			}else if(a>50&&a<=100){
	%>
		<jsp:forward page="three.jsp">
		<jsp:param name="number" value="<%=a %>"/>
		</jsp:forward>
	<%
			}	
		}catch(Exception e){
	%>
		<jsp:forward page="error.jsp">
		<jsp:param name="mess" value="<%=e.toString() %>"/>
		</jsp:forward>
	<% 
		
		}
		
	%>
</body>
</html>