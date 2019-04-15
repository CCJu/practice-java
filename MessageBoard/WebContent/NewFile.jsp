<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>留言板</h1>
	<form action="messagePane.jsp" method="get" name=form>
	请输入您的名字：<input type="text" name="name"><br/><br/>
	请输入留言的标题：<input type="text" name="title"><br/><br/>
	请输入留言的内容：<br/>
	<TextArea Rows="10" Cols="30" name="messages" style="overflow-x:scroll;overflow-y:hidden"></TextArea>
	<br/>
	<input type="submit" value="enter" name="submit">
	</form>
	<br/>
	<form action="showMessages.jsp" method="get" name="form1">
	<input type="submit" value="查看所有留言信息" name="show">
	</form>
</body>
</html>