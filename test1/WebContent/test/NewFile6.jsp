<%@page import="java.io.PrintWriter"%>
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
	//返回用户账户上剩余的星辰（用于购买书籍）数目
		public int getUserBalance(Connection con,String user_id){
			int i=0;
			try{
			Statement st=con.createStatement();
			String sql="select * from bsol_user where user_id=\""+user_id+"\"";
			ResultSet rs=st.executeQuery(sql);
			if(rs.next())
				i=rs.getInt(4);
			return i;
			}catch(Exception e){
				return i;
			}
		}
		//返回该书籍价值多少星辰
		public int getBookPrice(Connection con,String book_id){
			int i=0;
			try{
			Statement st=con.createStatement();
			String sql="select * from bsol_book where book_id=\""+book_id+"\"";
			ResultSet rs=st.executeQuery(sql);
			if(rs.next())
				i=(int)rs.getDouble(3);
			return i;
			}catch(Exception e){
				return i;
			}
		}
		synchronized public boolean saveBuyBookNum(Connection con,String user_id,String book_id){
			try{
			Statement st=con.createStatement();
			
			int bookPrice=getBookPrice(con,book_id);
			int userBalance=getUserBalance(con,user_id);
			if(bookPrice<=userBalance){
				String sql=null;
				sql="update bsol_buyBookList set book_num=\""+"#"+book_id+"\"";
				String sql1="UPDATE `bsol_user` SET `user_balance`=\""+(userBalance-bookPrice)
						+"\" WHERE `user_id`=\""+user_id+"\"";
				st.executeUpdate(sql);
				st.executeUpdate(sql1);
			}else
				return false;
			con.close();
			return true;
			}catch(Exception e){
				return false;
			}
		}
	%>
	<%
		String user_id="935166424@qq.com";
		String book_id="00002";
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/db_bookstoreonline";
		Connection con = DriverManager.getConnection(url, "root", "sjl935166424");
		Statement st=con.createStatement();
		if(saveBuyBookNum(con, user_id, book_id))
			out.println("成功");
		else
			out.println("失败");
	%>
</body>
</html>