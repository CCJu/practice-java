<%@page import="java.sql.*"%>
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
	/* synchronized public String deleTableMessages(Statement st,String []id,String tableName){
		try{
			String sql=null;
			if(tableName.equals("bsol_user"))
				sql="delete from"+tableName+"where user_id=";
			else
				sql="delete from"+tableName+"where book_id=\"";
			for(int i=0;i<id.length;i++){
				sql+=id[i]+"\"";
				st.executeUpdate(sql);
			}
			return "true";
		}catch(Exception e){
			return e.toString();
		}
	} */
	%>
	<%
		/* Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/db_bookstoreonline";
		Connection con = DriverManager.getConnection(url, "root", "sjl935166424");
		Statement st=con.createStatement();
		String tableName="bsol_user";
		String user_id="1070420960@qq.com";
		String sql="delete from bsol_user where user_id=\""+user_id+"\"";
		st.executeUpdate(sql); */
	%>
	<%
		String sql="hello my ";
		out.println(sql);
		out.println("<br/>");
		sql+="hello";
		out.println(sql);
		out.println("<br/>");
		sql+=" hh";
		out.println(sql);

		out.println("<br/>");
	%>
</body>
</html>