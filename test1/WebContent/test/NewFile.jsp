<%@page import="test.test"%>
<%@page import="java.sql.*"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		session.setAttribute("name", "Alex");
	%>
	<form action="hello">
		<input type="text">
		<input type="submit" value="enter" name="submit">
	</form>
	<%-- <%
	int i=4;
	String user_id="935166424@qq.com";
	 	Class.forName("com.mysql.jdbc.Driver");
    		String url = "jdbc:mysql://localhost:3306/db_bookstoreonline";
    		Connection con = DriverManager.getConnection(url, "root", "sjl935166424");
    		/* String sql = "UPDATE `bsol_user` SET `user_balance`=+\""+i+"\" WHERE `user_id`='935166424@qq.com'"; */
    		String sql="SELECT * FROM db_bookstoreonline.bsol_buyBookList";
    		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(sql);	
		String num=rs.getString(1);
		if(num==null)
			out.println("null");
		else if(num.equals(""))
			out.println("未输入");
		else
			out.println(num);
	%> --%>
</body>
</html>