<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
	<form action="" method="post">
	<table border="1">
		<tr><td>name:<input type="text" name="id">
		<%
			if(session.getAttribute("nameError")!=null)
				out.println(session.getAttribute("nameError"));
		%></td></tr>
		<tr><td>password:<input type="password" name="password">
		<%
			if(session.getAttribute("passwordError")!=null)
				out.println(session.getAttribute("passwordError"));
		%>
		</td></tr>
		<tr><td><input type="submit" value="enter" name="submit"></td></tr>
	</table>
	</form>
	</center>
	<%
		String name= request.getParameter("id");
		String password=request.getParameter("password");
		if(name==null||password==null){
			name="";
			password="";
		}else {
			if(!name.equals("")&&!password.equals("")){
				session.setAttribute("user_name", name);
				session.setAttribute("uesr_password", password);
				//response.sendRedirect("NewFile1.jsp");
				out.println("name:"+name+"<br/>");
				out.println("password:"+password);
			}else{
				if(name.equals(""))
					session.setAttribute("nameError", "null");
				if(password.equals(""))
					session.setAttribute("passwordError", "null");
				response.sendRedirect("index.jsp");
			}
		}
		
	%>
</body>
</html>