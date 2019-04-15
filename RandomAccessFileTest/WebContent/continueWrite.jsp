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
	<h1 align="center">欢迎续写小说</h1
	<%!
		String s="/Users/mac1/Desktop/web 应用程序/Test23/WebContent/";
		synchronized String getFile(String filePath){
			String f=null;
			try{
			File file=new File(filePath);
			RandomAccessFile raf=new RandomAccessFile(file,"r");
			f=raf.readUTF();
			raf.close();
			}catch(IOException e){
				
			}
			return f;
		}
		public String getFilePath(String name){
			String filePath=null;
			filePath=s+name+".txt";
			return filePath;
		}
	%>
	<%
		String str=request.getParameter("fiction");
		String e=null;
		if(str==null){
			str="";
		}else {
			if(str.equals("a")) {
				e=getFile(getFilePath("斗破苍穹"));
				session.setAttribute("path", getFilePath("斗破苍穹"));
			}
			else if(str.equals("b")) {
				e=getFile(getFilePath("吞噬星空"));
				session.setAttribute("path", getFilePath("吞噬星空"));
			}
			else if(str.equals("c")) {
				e=getFile(getFilePath("星际游轮"));
				session.setAttribute("path", getFilePath("星际游轮"));
			}
			else if(str.equals("d")) {
				e=getFile(getFilePath("大主宰"));
				session.setAttribute("path", getFilePath("大主宰"));
			}
			out.println(e);
		}
		
	%>
	<form action="continue.jsp" method="get" name="form">
	<br/><h3>请输入续写内容：</h3><br/>
	<textarea name="file" cols="" rows=""></textarea><br/>
	<input type="submit" value="ok" name="submit">
	</form>
</body>
</html>