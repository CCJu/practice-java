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
	<%-- <s:set var="age" value="30"></s:set>
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
	</s:else> --%>
	<%-- <table border="1">
	<s:iterator value="#{'AAA':'aa','BBB':'bb','CCC':'cc'}" var="s" status="it">
	<tr><td><s:property value="key"/></td>
	<td><s:property value="value"/></td></tr>
	</s:iterator>
	</table> --%>
	<%-- <s:append var="new">
		<s:param value="{'1','a','2','b','3','c'}"></s:param>
		<s:param value="{'4','d','5','e'}"></s:param>
	</s:append> --%>
	<%-- <table border="1">
	<s:generator separator="," val="'AAA,BBB,CCC'" var="b"></s:generator>
	<s:iterator status="st" value="#b" var="i">
	<s:property value="i"/><br/>
	</s:iterator>
	<s:iterator var="n" value="#new" status="st">
		<tr>
		<td><s:property value="#st.count"/></td>
		</tr>
	</s:iterator>
	</table> --%>
	
	<!-- subset -->
	<s:param name="list" value="{3,1,4,5,6,8,10}"></s:param>
	<s:iterator var="i" status="st" value="#list">
		<s:property value="i"></s:property>
	</s:iterator>
</body>
</html>