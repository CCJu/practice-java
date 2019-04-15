<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- <table border="1"> -->
	<%
		int []a=new int[6];
		for(int i=0;i<a.length;i++){
			a[i]=i+1;
		}

		int i=0;
		while(i<=5){
			if((i+1)%4==0||i==0) out.println("tr");
			out.println("td align=center width=260px");
	%>
		<%=i %>
	<%
			out.println("td");
			if((i+1)%3==0) out.println("tr><hr/>");
			i++;
			out.println("<br/>");
		}
	%>
		<!-- </table> -->
</body>
</html>