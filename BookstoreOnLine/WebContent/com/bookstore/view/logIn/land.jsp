<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<style>
		#header{
		background-color: #7f2f00;
		color:white;
		width:100%;
		text-align: left;
		padding:5px
		}
		#center_div{
			position:absolute;
			top:50%;
			left:50%;
			-webkit-transform:translate(-50%,-50%);
			-moz-transform:translate(-50%,-50%);
			-ms-transform:translate(-50%,-50%);
			-o-transform:translate(-50%,-50%);
			transform:translate(-50%,-50%);
		}
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
<body >
	<div id="header">
		
		<font size="5"><%="登陆界面" %></font>
	</div>
	<div id="center_div">
		<form action="/BookstoreOnLine/UserExists" method="post" name="form">
		<table cellspacing="50%" cellpadding="15">
			<tr>
				<td><font size="6">登录</font></td>
			</tr>
			<tr>
				<td>
					<input type="text" name="land_id" id="text" >
					<%
						if(request.getAttribute("id_error")!=null)
							out.println(request.getAttribute("id_error"));
					%>
				</td>
			</tr>
			<tr>
				<td>
					<input type="password" name="land_password" id="text">
					<%
						if(request.getAttribute("password_error")!=null)
							out.println(request.getAttribute("password_error"));
						if(request.getAttribute("error")!=null)
							out.println(request.getAttribute("error"));	
					%>
				</td>
			</tr>
			<tr>
				<td>
					<input type="radio" name="user" checked="checked" value="1">普通用户
					<input type="radio" name="user" value="0">管理员
				</td>
			</tr>
			<tr>
				<td><input type="checkbox" name="land_message_save" value="1" checked><font size="3">保持我的登陆状态</font></td>
			</tr>
			<tr>
				<td><input type="submit" value="确认" id="button" >
				<input type="reset" value="重置" id="button"></td>
			</tr>
		</table>
		</form>
	</div>
</body>
</html>