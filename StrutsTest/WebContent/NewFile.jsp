<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:set var="age" value="30"></s:set>
	<s:if test="#age>69">
		老年
	</s:if>
	<s:elseif test="#age>35">
		中年
	</s:elseif>
	<s:elseif test="#age>15">
		青年
	</s:elseif>
	<s:else>
		少年
	</s:else>
</body>
</html>