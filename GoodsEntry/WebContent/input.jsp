<%@page import="java.util.Hashtable"%>
<%@page import="java.io.*"%>
<%@page import="java.io.ObjectInputStream"%>
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
	<%
		String name=request.getParameter("name");
		String num=request.getParameter("num");
		if(name==null||num==null){
			name=""; num="";
		}else{
			byte []a=name.getBytes("ISO-8859-1");
			name=new String(a);
			byte []b=num.getBytes("ISO-8859-1");
			num=new String(b);
		}
		
	%>
	<%
		File file=new File("/Users/mac1/Desktop/web 应用程序/Test22/WebContent/goods_name.txt");
		if(!file.exists()){
			file.createNewFile();
			out.println("<h1>您是第一个录入商品的人</h1><br/>");
			Hashtable<String,String> ht=new Hashtable<String,String>();
			ht.put(name,num);
			writeObj(ht);
			out.println("<h1 align=center>保存成功</h1><br/>");
		}else{
			Hashtable<String,String> ht=new Hashtable<String,String>();
			ht=readObj();
			if(ht.containsKey(name)) {
				response.sendRedirect("del.jsp");
				session.setAttribute("name", name);
			}
			else{
				out.println("<h1 align=center>保存成功</h1><br/>");
				ht.put(name, num);
				writeObj(ht);
			}
		}
	%>
	<a href="NewFile.jsp">返回</a>
	<a href="showgoods.jsp">显示页面</a>
</body>
</html>