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
	<title>教学管理系统-课程信息管理</title>
	<link rel="stylesheet" href="<%=bathpath%>/resources/CSS/module.css">
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
			<p >教务管理系统-课程信息查询</p>
			<br/>
			<p>查询条件</p>
			<form action="/TMS/CourseManageController" method="post">
				<ul>
					<li>课程号：<input type="text" name="cno"></li>
					<li>课程名：<input type="text" name="cname"></li>
					<li><input type="submit" value="查询" class="button"></li>
				</ul>
			</form>
		</div>
		<div class="xianshi">
			<p >查询结果——<a href="/TMS/CourseManageController?type=add&way=into"><input type="button" value="新增课程" class="button1"></a>
			</p><br/>
			<table>
				<tr>	
					<td>课程号</td>
					<td class="op">课程名</td>
					<td>课时</td>
					<td>学分</td>
					<td class="op">操作</td>
				</tr>
				<c:forEach items="${couPage }" var="c" varStatus="status">
					<tr>
						<td>${c.cno }</td>
						<td>${c.cname }</td>
						<td>${c.timelength }</td>
						<td>${c.credits }</td>
						<td>
							<a href='/TMS/CourseManageController?type=update&cno=${c.cno }'>
								<img src='<%=bathpath%>/resources/Image/mo.png' alt='修改'>
							</a>
							<a href='/TMS/CourseManageController?type=delete&cno=${c.cno }' class='aa'>
								<img src='<%=bathpath%>/resources/Image/del.png' alt='删除'>
							</a>
						</td>
					</tr>
				</c:forEach>
			</table>
		</div>	
	</div>
	<div class="footer">
		<p>当您使用本站时，代表您以接受了本站的使用条款和隐私条款。版权所有，保留一切权利，违权必究。
		<br/>联系我们：QQ：935166424 电话：15797362645
		</p>
	</div>
</body>
</html>