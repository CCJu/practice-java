<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% 
	String path=request.getContextPath();
	String bathpath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>教学管理系统-学生信息管理</title>
	<link rel="stylesheet" href="<%=bathpath %>/resources/CSS/module.css">
	
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
		<div class="chaxun">
			<p >教务管理系统-学生信息查询</p>
			<br/>
			<p>查询条件</p>
			<form action="/TMS/StudentManageController" method="post">
				<ul>
					<li>学号：<input type="text" name="snum" id=""></li>
					<li>姓名：<input type="text" name="name" id=""></li>
					<li><input type="submit" value="查询" class="button"></li>
				</ul>
			</form>
		</div>
		<div class="xianshi">
			<p >查询结果——<a href="/TMS/StudentManageController?type=add"><input type="button" value="新增学生" class="button1"></a>
			</p><br/>
			<table >
				<tr>	
					<td>学号</td>
					<td>姓名</td>
					<td>性别</td>
					<td>生日</td>
					<td>院系</td>
					<td class="op">操作</td>
				</tr>
				<c:forEach items="${stuPage }" var="stu" varStatus="status">
					<tr>
						<td>${stu.sno}</td>
						<td>${stu.sname}</td>
						<td>${stu.sex}</td>
						<td>${stu.birthdate}</td>
						<td>${stu.sdept}</td>
						<td>
							<a href='/TMS/StudentManageController?type=update&snum=${stu.sno}'>
								<img src="<%=bathpath %>/resources/Image/mo.png" alt='修改'>
							</a>
							<a href='/TMS/StudentManageController?type=delete&snum=${stu.sno}' class='aa'>
								<img src="<%=bathpath %>/resources/Image/del.png" alt='删除'>
							</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>	
	</div>
	<div class="footer">
		<p >当您使用本站时，代表您以接受了本站的使用条款和隐私条款。版权所有，保留一切权利，违权必究。
		<br/>联系我们：QQ：935166424 电话：15797362645
		</p>
	</div>
</body>
</html>