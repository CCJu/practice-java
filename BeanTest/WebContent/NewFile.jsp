<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="" method="get">
	<input type="text" name="extendsName"><br/>
	<input type="submit" value="enter" name="submit">
	<jsp:useBean id="girl" class="hello.ListFile" scope="page"></jsp:useBean>
	<jsp:setProperty name="girl" property="*"></jsp:setProperty><br/>
	<jsp:getProperty name="girl" property="extendsName"></jsp:getProperty>
	
	</form>
	<%/* 
		String ss="hello";
		out.println(ss.endsWith("llo"));
		String []s=girl.listFile();
		for(int i=0;i<s.length;i++){
			out.println("<br/>"+s[i]);
		} */
	%>
</body>
</html>