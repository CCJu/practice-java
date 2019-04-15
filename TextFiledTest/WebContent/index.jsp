<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="red" >
	<form action="" method="get" name=form>
	email地址：
	<input type="text" name=email>
	<input type="submit" name=submit value="送出" >
	</form>
	<%
		String s=request.getParameter("email");
		if(s!=null){
			if(s.indexOf(" ")!=-1)
				out.println("该地址中含有非法字符 ：空格");
			else{
				if(s.indexOf("@")!=-1){
					if(s.indexOf("@")!=s.lastIndexOf("@"))
						out.println("该地址含有两个@字符，非法！！");
					else
						out.println("合格！！");
				}else
					out.println("该地址中未包含@字符！！");
			}
		}else
			out.println("请输入email地址！！");
		
	%>
</body>
</html>