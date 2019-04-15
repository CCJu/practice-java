<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<BODY BGCOLOR=cyan>
</BODY>
</head>
<body>
	请输入姓名:
	<FORM action="" method="get" name=form>
	<input type="text" name="name"><BR/>
	<input type="submit" value="送出">
	<%
		String s=request.getParameter("name");
		if(s!=null){
	%>
	<jsp:forward page="people.jsp">
	<jsp:param name="name" value="<%=s %>"/>
	</jsp:forward>
	</FORM>
	<%
		}
	%>
</body>
</html>