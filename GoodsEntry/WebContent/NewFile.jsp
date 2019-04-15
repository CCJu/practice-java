<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>请输入货物有关信息</p><br/>
	<form action="input.jsp" method="get" name="form">
	<p>货物名称：<input type="text" name="name"><br/></p>
	<p>货物数量：<input type="text" name="num"><br/></p>
	<p><input type="submit" value="提交" name="submit"></p>
	</form>
	<a href="showgoods.jsp">查看页面</a>
	<a href="del.jsp">修改界面</a>
</body>
</html>