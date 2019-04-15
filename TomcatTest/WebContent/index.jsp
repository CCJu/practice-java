<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<BODY BGCOLOR=yellow>
<FONT Size=3>
</FONT>
</BODY>
<body>
	如果一个数的因子之和刚好等于本身，那么这个数为完数。例如：6=1+2+3，因此6就是完数。
	<br/>
	1～1000的完数：
	<%!
		public class num{
			public boolean isNum(int i){
				int s=0;
				for(int n=1;n<i;n++)
					if(i%n==0) s+=n;
				if(s==i) return true;
				else return false;
			}
		}
	%>
	<%
		num n=new num();
		for(int i=1;i<=1000;i++){
			if(n.isNum(i)) out.println(i+",");
		}
		
	%>
</body>
</html>