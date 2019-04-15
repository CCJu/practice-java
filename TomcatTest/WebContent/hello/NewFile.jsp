<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="SaveMessages.jsp" method="get" name="form">
	姓名：<input type="text" name="name"><br/>
	性别：<input type="radio" name="sex" value="1" checked>男
	<input type="radio" name="sex" value="0">女<br/>
	手机：<input type="text" name="phone"><br/>
	地址：<input type="text" name="address"><br/>
	Email：<input type="text" name="email"><br/>
	兴趣：<br/><textarea name="like" Rows="20" Cols="60">
	</textarea><br/>
	<input type="submit" value="确认提交" name="submit"><br/>
	超链接：<a href="">显示个人信息</a>
	</form>
</body>
</html>