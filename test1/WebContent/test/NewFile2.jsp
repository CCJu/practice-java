<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<script>
	function fun_a(){
	location.href="NewFile3.jsp?value=dasd";
	}
	</script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 
	<a href="javascript:void(0)" onclick="fun_a()">
	<img src="img/180-2.jpeg" width="150px" height="200px"><br/>诸界末日在线</a>
	<%response.setHeader("Refresh", "5;URL=index.jsp");%>
</body>
</html>