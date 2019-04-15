<%@page import="java.util.Vector"%>
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
	<%!
		synchronized Vector<String> readS(File file){
			Vector<String> v=new Vector<String>();
			try{
				BufferedReader br=new BufferedReader(new FileReader(file));
				String i;
				while((i=br.readLine())!=null){
					byte []b=i.getBytes("ISO-8859-1");
					i=new String(b);
					v.add(i);
				}
				br.close();
			}catch(IOException e){		
			}
			return v;
		}
	%>
	<h1 align="center">个人信息</h1>
	<%
		File file=new File("/Users/mac1/Desktop/web 应用程序/TomcatTest/WebContent/hello/messages.txt");
		Vector<String> v=readS(file);
		out.println("<Table border>");
		out.println("<TR >");
		out.println("<TH>"+"姓名");out.println("</TH>");out.println("<TH>"+"性别");out.println("</TH>");
		out.println("<TH>"+"电话");out.println("</TH>");out.println("<TH>"+"地址");out.println("</TH>");
		out.println("<TH>"+"邮箱");out.println("</TH>");out.println("</TR>");
		for(int i=0;i<v.size();i++){
			out.println("<TR >");
			String []str=v.get(i).split("#");
			for(int a=0;a<str.length-1;a++){
				out.println("<TH>"+str[a]);out.println("</TH>");
			}
			out.println("</TR>");
		}
		out.println("</Table>");
	%>
</body>
</html>