<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	String path=request.getContextPath();
	String bathpath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>教学管理系统-成绩信息管理</title>
	<link rel="stylesheet" href="<%=bathpath %>/resources/CSS/add.css">
</head>
<body>
	<div class="header">
		<div class="nav">
			<ul>
				<li><a href="/TMS/StudentManageController">学生信息查询</a></li>
				<li><a href="/TMS/GradeManageController">成绩查询</a></li>
				<li><a href="/TMS/CourseManageController">课程信息查询</a></li>
			</ul>
		</div>
	</div>
	<div class="main">
		<div class="xianshi">
			<p >成绩信息管理——添加</p><br/>
			<form action="/TMS/GradeManageController?type=add" id="searchFrom" method="post">
			<table >
				<tr>
					<td>学号：</td>
					<td>
						<input type="text" name="snum">
					</td>
					<td>${error.stuerror }</td>
				</tr>
				<tr>
					<td>课程号：</td>
					<td>
						<input type="text" name="cnum">
					</td>
					<td>${error.couerror }</td>
				</tr>
				<tr>
					<td>成绩：</td>
					<td><p><input type="text" name="grade"></p></td>
					<td>${error.graerror }</td>	
				</tr>
				<tr>
					<td><input type="submit" class="submit" value="提交"></td>
				</tr>
			</table>
			</form>
		</div>	
	</div>
	<div class="footer">
		<p>当您使用本站时，代表您以接受了本站的使用条款和隐私条款。版权所有，保留一切权利，违权必究。
		<br/>联系我们：QQ：935166424 电话：15797362645
		</p>
	</div>
</body>
</html>
