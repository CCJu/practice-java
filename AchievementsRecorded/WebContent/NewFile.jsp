<%@page import="java.io.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
	<form action="" method="get" name="form">
	<Table border="6" align="center">
		<TR>
			<TH >姓名</TH>
			<TH >语文</TH>
			<TH>数学</TH>
			<TH>英语</TH>	
		</TR>
		<%
			int i=0;
			while(i<=1){
				out.println("<TR>");
					out.println("<TD>");
					out.println("<input type=text name=name value=>");
					out.println("</TD>");
					out.println("<TD>");
					out.println("<input type=text name=chinese value=>");
					out.println("</TD>");
					out.println("<TD>");
					out.println("<input type=text name=math value=>");
					out.println("</TD>");
					out.println("<TD>");
					out.println("<input type=text name=english value=>");
					out.println("</TD>");
				out.println("</TR>");
				i++;
			}
		%>
		<TR>
			<TD ><input type="submit" name="submit" ></TD>
			<TH >语文</TH>
			<TH>数学</TH>
			<TH>英语</TH>	
		</TR>
	</Table>
	</form>
	</center>
	<%
		String []name=request.getParameterValues("name");
		String []chinese=request.getParameterValues("chinese");
		String []math=request.getParameterValues("math");
		String []english=request.getParameterValues("english");
		try{
			DataOutputStream dis=new DataOutputStream(new FileOutputStream(new File("/Users/mac1/Desktop/web 应用程序/Test21/WebContent/messages.txt")));
			for(int a=0;a<name.length;a++){
				dis.writeUTF(name[a]);
				dis.writeUTF(chinese[a]);
				dis.writeUTF(math[a]);
				dis.writeUTF(english[a]);
			}
			dis.close();
		}catch(IOException e){
			
		}catch(NullPointerException e){
			
		}
	%>
	<center>
	<p> 查看成绩单：</p><a href="ShowTheResult.jsp"> 跳转到成绩单</a>
	</center>>
</body>
</html>