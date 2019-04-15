<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="g" class="hello.Read" scope="session"></jsp:useBean>
	<%
		//String error=(String)request.getAttribute("error");
			String path=null;
			String s=request.getParameter("path");
			s=new String(s.getBytes("ISO-8859-1"));
			if(s.equals("1")) path="/Users/mac1/Desktop/web 应用程序/BeanUseTest/WebContent";
			else if(s.equals("2")) path="/Users/mac1/Desktop/web 应用程序/AchievementsRecorded/WebContent";
			else if(s.equals("3")) path="/Users/mac1/Desktop/web 应用程序/DelectSpecialChar/WebContent";
			g.setPath(path);
			session.setAttribute("path", path);
			if(request.getAttribute("error")==null){
				out.println(path+"目录下有以下文件：");
			String list[]=g.getFileList();
			for(int i=0;i<list.length;i++)
				out.println("<br/>"+list[i]);
			}else{
				g.setPath((String)session.getAttribute("path"));
				out.println(path+"目录下有以下文件：");
				String list[]=g.getFileList();
				for(int i=0;i<list.length;i++)
					out.println("<br/>"+list[i]);
			}
	%>
	<form action="read.jsp" method="get" name="form">
	输入要读取的文件名：<input type="text" name="fileName">
	<%		
		String error=(String)request.getAttribute("error");
		if(error!=null)
			out.println(error);
		
	%><br/>
	<input type="submit" value="enter" name="submit">
	</form>
</body>
</html>