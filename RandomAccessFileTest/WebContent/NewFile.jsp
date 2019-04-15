<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">小说续写</h1>
	<p>请选择要续写的小说</p>
	<form action="continueWrite.jsp" method="get" name="form">
	<input type="radio" name="fiction" value="a">斗破苍穹<br/>
	<input type="radio" name="fiction" value="b">吞噬星空<br/>
	<input type="radio" name="fiction" value="c">星际游轮<br/>
	<input type="radio" name="fiction" value="d">大主宰<br/>
	<input type="submit" value="ok" name="submit">
	</form>
</body>
</html>