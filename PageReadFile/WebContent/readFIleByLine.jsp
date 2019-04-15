<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.PushbackReader"%>
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
		public String getString(String s)throws Exception{
			StringReader in=new StringReader(s);
			PushbackReader push=new PushbackReader(in);
			StringBuffer sb=new StringBuffer();
			int c;
			char b[]=new char[1];
			while((c=push.read(b,0,1))!=-1){
				String ss=new String(b);
				if(ss.equals("<")){
					push.unread('&');
					push.read(b,0,1);
					sb.append(new String(b));
					push.unread('L');
					push.read(b,0,1);
					sb.append(new String(b));
					push.unread('T');
					push.read(b, 0, 1);
					sb.append(new String(b));
				}else if(ss.equals(">")){
					push.unread('&');
					push.read(b,0,1);
					sb.append(new String(b));
					push.unread('G');
					push.read(b,0,1);
					sb.append(new String(b));
					push.unread('T');
					push.read(b, 0, 1);
					sb.append(new String(b));
				}else if(ss.equals("\n")){
					sb.append("<br/>");
				}
				else
					sb.append(ss);
			}
			return new String(sb);
		}
	%>
	<%
		String s=request.getParameter("g");
		if(s==null){
			s="";
		}
		byte []b=s.getBytes("ISO-8859-1");
		s=new String(b);
		File f=null;
		FileReader in=null;
		BufferedReader br=null;
		if(s.equals("重新读取文件")){
			f=new File("/Users/mac1/Desktop/web 应用程序/outObjectTest/WebContent/NewFile.jsp");
			in=new FileReader(f);
			br=new BufferedReader(in);
			session.setAttribute("f", f);
			session.setAttribute("in", in);
			session.setAttribute("br", br);
		}
		try{
			String str=null;
			f=(File)session.getAttribute("f");
			in=(FileReader)session.getAttribute("in");
			br=(BufferedReader)session.getAttribute("br");
			int i=1;
			while(i<=5&&br.readLine()!=null){
				str=getString(str);
				out.println(str);
			}
		}catch(Exception e){
			out.println("读取出现问题，请单击重新读取按钮"+e);
		}
	%>
	<%
	String code=response.encodeUrl("readFlleByLine.jsp");
	%>
	<form action="<%=code %>" method="post" name="form">
	<input type="submit" value="读取下5行" >
	<input type="submit" value="重新读取文件" name="g">
	
	</form>
</body>
</html>