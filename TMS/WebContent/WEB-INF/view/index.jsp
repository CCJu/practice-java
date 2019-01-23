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
<title>教学管理系统</title>
<link rel="stylesheet" href="<%=bathpath%>/resources/CSS/index.css">
</head>
<body>
	<ul class="mainPanel">
		<li><a href="<%=bathpath %>StudentManageController">学生信息管理</a></li>
		<li><a href="<%=bathpath %>CourseManageController">课程信息管理</a></li>
		<li><a href="<%=bathpath %>GradeManageController">成绩管理</a></li>
	</ul>
</body>
</html>