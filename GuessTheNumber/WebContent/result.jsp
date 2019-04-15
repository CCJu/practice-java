<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<style>
	#text{
			width:250px;
			height:40px;
			font-size:27px ;
	}
	#button{
			width:125px;
			height:40px;
			-webkit-appearance: button;
	}	
	</style>	
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center"> 猜数游戏(a~z) </h1><hr/>
	<p align="center">请在文本框内输入您所猜的数</p>
	<center>
	<form action="compare" >
	<table cellspacing="50%" cellpadding="15">
		<tr><td><input type="text" name="c" id="text"></td></tr>
		<tr><td><input type="submit" value="确认" id="button" >
		<input type="reset" value="重置" id="button"></td></tr>
		<tr><td>
			<%=session.getAttribute("char") %><br/>
		<%if(request.getAttribute("error")!=null){
			out.println(request.getAttribute("error"));
		}%> </td></tr>
	</table>
	</form>
	</center>
</body>
</html>