<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
		StringBuffer person;
		int count;
		public void judge(){
			if(count==0) person=new StringBuffer();
		}
		public void addPerson(String p){
			if(count==0)
				person.append(p);
			else
				person.append(","+p);
			count++;
		}
	%>
	<%
		String s=request.getParameter("name");
		if(s.length()==0||s.length()>10){
	%>
	<jsp:forward page="inputName.jsp"/>	
	<%
		}
		judge();
		addPerson(s);
	%>
	 目前有<%=count %>浏览了该页面,他们的名字是
	 <br/>
	 <%=person %>
</body>
</html>