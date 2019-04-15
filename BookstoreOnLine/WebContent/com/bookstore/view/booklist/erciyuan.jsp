<%@page import="java.sql.ResultSet"%>
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
	#nav{
		background-color: #eeeeee;
		line-height:30px;
		height:1000px;
		width:100px;
		float:left;
		border:2px solid #CCCCCC;
	}
	#content{
		padding :20px;
		margin: 0 auto;
		/* background-color: #eeeeee; */
		line-height:15px;
		/* height:500px; */
		width:76%;
		float:center;
	}
	#font{
		margin-top: 6px;
		font-style:oblique;
		font-size: 30px;
		font-weight: bold;
	}
	a{ text-decoration: none;
		color:black;
	}
 	a:hover{color:#ff0000}
	</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="header">
		<p id="font">BOOK</p>
	</div>
	<div id="nav">
		<table >
		<tr><td width="100px" align="center" ><a href="xuanhuan.jsp" id="a">玄幻</a></td></tr>
		<tr><td><hr/></td></tr>
		<tr><td width="100px" align="center"><a href="qihuan.jsp" id="a">奇幻</a></td></tr>
		<tr><td><hr/></td></tr>
		<tr><td width="100px" align="center"><a href="wuxia.jsp" id="a">武侠</a></td></tr>
		<tr><td><hr/></td></tr>
		<tr><td width="100px" align="center"><a href="xianxia.jsp" id="a">仙侠</a></td></tr>
		<tr><td><hr/></td></tr>
		<tr><td width="100px" align="center"><a href="dushi.jsp" id="a">都市</a></td></tr>
		<tr><td><hr/></td></tr>
		<tr><td width="100px" align="center"><a href="xianshi.jsp" id="a">现实</a></td></tr>
		<tr><td><hr/></td></tr>
		<tr><td width="100px" align="center"><a href="junshi.jsp" id="a">军事</a></td></tr>
		<tr><td><hr/></td></tr>
		<tr><td width="100px" align="center"><a href="lishi.jsp" id="a">历史</a></td></tr>
		<tr><td><hr/></td></tr>
		<tr><td width="100px" align="center"><a href="youxi.jsp" id="a">游戏</a></td></tr>
		<tr><td><hr/></td></tr>
		<tr><td width="100px" align="center"><a href="tiyu.jsp" id="a">体育</a></td></tr>
		<tr><td><hr/></td></tr>
		<tr><td width="100px" align="center"><a href="kehuan.jsp" id="a">科幻</a></td></tr>
		<tr><td><hr/></td></tr>
		<tr><td width="100px" align="center"><a href="nvshengwang.jsp" id="a">女生网</a></td></tr>
		<tr><td><hr/></td></tr>
		<tr><td width="100px" align="center"><a href="erciyuan.jsp" id="a">二次元</a></td></tr>
		</table>
	</div>
	<div id="content">
	<font size="5">小编推荐</font>
 	<hr/>
	<jsp:useBean id="dbso" class="dao.db_seekOperation" scope="page"></jsp:useBean>
	<%
		String bookType="erciyuan";
		ResultSet booklist=dbso.getBooklist(bookType);
	%>
		<table>
	<%
		int i=0;
		while(booklist.next()){
			String href="bookMessages.jsp?id="+booklist.getString(1);
			if((i+1)%4==0||i==0) out.println("<tr>");
	%>
		<td align="center" width=260px>
		<a href=<%=href %>  id="a" >
		<img src=<%=booklist.getString(4) %> width="150px" height="200px"><br/>
		<h3><%=booklist.getString(2) %></h3></a>
		</td>
	<%
			if((i+1)%3==0) out.println("</tr><tr><td><br/></td></tr>");
			i++;
		}

	%>
		</table>
	</div>
</body>
</html>