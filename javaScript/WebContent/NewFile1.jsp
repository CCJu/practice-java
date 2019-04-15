<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<script>
		function  on_click() {
			var a,b;
			a=<%=getA()%>;
			b=<%=b%>;
			alert(a);
			<%-- var c=<%=getN(a,b)%>;
			if(c)
				alert("true");
			else
				alert("false");  --%>
		}
		
	</script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
		String s;
		int a;
		int b;
		public int getA(){
			return a;
		}
		public boolean getN(int m,int n){
			if(m>n) return false;
			else return true;
		}
	%>
	<%
		a=1;
		b=2;
		s="hello";	%>
	<input type="button" value="enter" onclick="on_click()">
</body>
</html>