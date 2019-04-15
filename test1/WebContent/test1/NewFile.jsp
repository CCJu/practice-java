<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<script>
	/* function a(){
		window.location.href("NewFile1.jsp");
	} */
	</script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="NewFile1.jsp">
	<input type="submit"  value="enter" >	
	</form>
	<%
		String s=(String)session.getAttribute("hello");
		if(s!=null) out.println(s);
	%>
</body>
</html>