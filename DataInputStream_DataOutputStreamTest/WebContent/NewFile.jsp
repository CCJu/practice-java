
<%@page import="java.io.DataInputStream"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.DataOutputStream"%>
<%@page import="java.io.FileOutputStream"%>
<%@page import="java.io.IOException"%>
<%@page import="java.io.File"%>
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
		int number=0;
		File file=new File("count.txt");
		/* synchronized当有用户访问该关键词修饰的方法时，禁止其他人使用该方法 */
		synchronized void countAdd(){
			try{
				if(!file.exists()){
					number++;
					file.createNewFile();
					FileOutputStream fos=new FileOutputStream(file);
					DataOutputStream dos=new DataOutputStream(fos);
					dos.write(number);
					fos.close();
					dos.close();
				}	
				else{
					FileInputStream fis=new FileInputStream(file);
					DataInputStream dis=new DataInputStream(fis);
					number=dis.readInt();
					number++;
					FileOutputStream fos=new FileOutputStream(file);
					DataOutputStream dos=new DataOutputStream(fos);
					dos.write(number);
					fos.close();
					dos.close();
					dis.close();
					fis.close();
				}
			}catch(IOException e){}
		}
	%>
	<%
		if(session.isNew()){
			countAdd();
			String str=String.valueOf(number);
			out.println("共有"+str+"访问该页面");
		}else{
			String str=String.valueOf(number);
			out.println("共有"+str+"访问该页面");
		}
	%>
</body>
</html>