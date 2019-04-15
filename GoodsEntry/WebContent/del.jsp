<%@page import="java.util.Hashtable"%>
<%@page import="java.io.ObjectOutputStream"%>
<%@page import="java.io.File"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.*"%>
<%@page import="java.io.IOException"%>
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
		File file=new File("/Users/mac1/Desktop/web 应用程序/Test22/WebContent/goods_name.txt");
		ObjectInputStream ois;
		ObjectOutputStream oos;
		synchronized void writeObj(Hashtable<String,String> ht) throws Exception{
			oos=new ObjectOutputStream(new FileOutputStream(new File("/Users/mac1/Desktop/web 应用程序/Test22/WebContent/goods_name.txt")));
			oos.writeObject(ht);
			oos.close();
		}
		synchronized Hashtable<String,String> readObj() throws Exception{
			Hashtable<String,String> ht;
			ois=new ObjectInputStream(new FileInputStream(file));
			ht=(Hashtable)ois.readObject();
			ois.close();
			return ht;
		}	
	%>
	<form action="" method="get" name="form">
	请输入要修改的货物的数量：<br/>
	货物名称：
	<%
		String name=(String)session.getAttribute("name");
	%><br/>
	<input type="text" name="num"><br/>
	<input type="submit" value="ok" name="submit"><br/>
	</form>
	<%
		String num=request.getParameter("num");
		if(num==null){
			num="";	
		}else{
			if(num.equals("0")){
				Hashtable ht=readObj();
				ht.remove(name);
				writeObj(ht);
				out.println("<h1>删除成功</h1>");
			}else{
				Hashtable ht=readObj();
				ht.remove(name);
				ht.put(name, num);
				writeObj(ht);
				out.println("<h1>修改成功</h1>");
			}
		}
	%>
	<a href="NewFile.jsp">录入界面</a>
	<a href="showgoods.jsp">查询页面</a>
</body>
</html>