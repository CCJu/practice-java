<%@page import="model.book"%>
<%@page import="model.user"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Vector"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style>
	#header{
		background-color: #7f2f00;
		color:white;
		width:100%;
		text-align: left;
		padding:3px;
		height:45px; 
		border:2px solid #CCCCC;
	}
	#footer{
		background-color: #7f2f00;
		width:100%;
		color:white;
		clear:both;
		text-align: center;
        padding:5px
	}
	#content{
		padding :6px;
		margin: 0 auto;
		background-color: #eeeeee;
		line-height:15px;
		height:710px;
		width:87%;
		float:center;
		border:1px solid #CCCCCC;
		overflow-y:scroll;
	}
	#nav{
		background-color: #eeeeee;
		line-height:30px;
		height:720px;
		width:110px;
		float:left;
		border:2px solid #CCCCCC;
	}
	#font{
		margin-top: 6px;
		font-style:oblique;
		font-size: 30px;
		font-weight: bold;
	}
	#button{
		color:#0072E3;
		border:1px solid #0072E3;
		width:100px;
		height:40px;
		background-color:#eeeeee;
		-webkit-appearance: button;
		font-size:15px;
		margin-top: 6px;
		border-radius: 15px;
	}
	#button:HOVER {
		background-color:#97CBFF;
	}
</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="header">
		<p id="font">BSOL</p>
	</div>
	<div id="nav">
		<center>
		<form action="/BookstoreOnLine/AdministerFeatureselection">
		<table>
			<tr>
				<td align="center" height="140px"><input type="submit" name="function" value="修改推荐书籍" id="button"></td>
			</tr>
			<tr>
				<td align="center" height="140px"><input type="submit" name="function" value="管理书籍" id="button"></td>
			</tr>
			<tr></tr>
			<tr>
				<td align="center" height="140px"><input type="submit" name="function" value="管理用户" id="button"></td>
			</tr>
		</table>
		</form>
		</center>
	</div> 
	<div id="content">
	<%
		Vector v=(Vector)request.getAttribute("user_list");
		if(v!=null){	
			out.println("<form action='/BookstoreOnLine/Operation'>");
			out.println("<table border='1'>");
			out.println("<tr>");
			out.println("<td align='center'><h2>id</h2></td>");
			out.println("<td align='center'><h2>name</h2></td>");
			out.println("<td align='center'><h2>isVip<h2></td>");
			out.println("<td align='center'><h2>balance<h2></td>");
			out.println("<td align='center'><h2>status<h2></td>");
			out.println("</tr>");
			Iterator<user> it=v.iterator();
			while(it.hasNext()){
				user u=it.next();
	%> 
			<tr>
			<td align="center"><h2><%=u.getUser_id()%></h2></td>
			<td align="center"><h2><%=u.getUser_name()%></h2></td>
			<td align="center"><h2><%=u.isUser_isVip()%></h2></td>
			<td align="center"><h2><%=u.getUser_balance()%></h2></td>	
			<td align="center"><input type="checkbox" value="<%=u.getUser_id()%>" name="button"></td>	
			</tr>
	<%		
			}
			out.println("<tr><td><input type='submit' value='delete user' name='submit'></td></tr>");
			out.println("</table>");
			out.println("</from>");
		}
	%>
	<% 
		Vector v2=(Vector)request.getAttribute("book_list");
		if(v2!=null){	
			out.println("<form action='/BookstoreOnLine/Operation'>");
			out.println("<table border='1'>");
			out.println("<tr>");
			out.println("<td align='center'><h2>id</h2></td>");
			out.println("<td align='center'><h2>name</h2></td>");
			out.println("<td align='center'><h2>author<h2></td>");
			out.println("<td align='center'><h2>type<h2></td>");
			out.println("<td align='center'><h2>price<h2></td>");
			out.println("<td align='center'><h2>status<h2></td>");
			out.println("</tr>");
			Iterator<book> it=v2.iterator();
			while(it.hasNext()){
				book b=it.next();
	%> 
			<tr>
			<td align="center"><h2><%=b.getBook_id()%></h2></td>
			<td align="center"><h2><%=b.getBook_name()%></h2></td>
			<td align="center"><h2><%=b.getBook_author()%></h2></td>
			<td align="center"><h2><%=b.getBook_type()%></h2></td>	
			<td align="center"><h2><%=b.getBook_price()%></h2></td>
			<td align="center"><input type="checkbox" name="button" value="<%=b.getBook_id()%>"></td>	
			</tr>
	<%		
			}
			out.println("<tr><td><input type='submit' value='delete book' name='submit'></td></tr>");
			out.println("</table>");
			out.println("</from>");
		}
	%>
	<% 
		Vector v3=(Vector)request.getAttribute("advice_bookList");
		if(v3!=null){	
			out.println("<form action='/BookstoreOnLine/Operation'>");
			out.println("<table border='1'>");
			out.println("<tr>");
			out.println("<td align='center'><h2>id</h2></td>");
			out.println("<td align='center'><h2>name</h2></td>");
			out.println("<td align='center'><h2>author<h2></td>");
			out.println("<td align='center'><h2>type<h2></td>");
			out.println("<td align='center'><h2>price<h2></td>");
			out.println("<td align='center'><h2>status<h2></td>");
			out.println("</tr>");
			Iterator<book> it=v3.iterator();
			while(it.hasNext()){
				book b=it.next();
	%> 
			<tr>
			<td align="center"><h2><%=b.getBook_id()%></h2></td>
			<td align="center"><h2><%=b.getBook_name()%></h2></td>
			<td align="center"><h2><%=b.getBook_author()%></h2></td>
			<td align="center"><h2><%=b.getBook_type()%></h2></td>	
			<td align="center"><h2><%=b.getBook_price()%></h2></td>
			<td align="center"><input type="checkbox" name="button" value="<%=b.getBook_id()%>"></td>	
			</tr>
	<%		
			}
			out.println("<tr><td><input type='submit' value='delete advice book' name='submit'></td></tr>");
			out.println("</table>");
			out.println("</from>");
		}
	%>		
	</div>
	<div id="footer">
		<font size="2">当您使用本站时，代表您以接受了本站的使用条款和隐私条款。版权所有，保留一切权利，违权必究。
		<br/>联系我们：QQ：935166424 电话：15797362645
		</font>		
	</div>
</body>
</html>