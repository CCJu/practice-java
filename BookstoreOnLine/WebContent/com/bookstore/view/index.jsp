<%@page import="java.util.Iterator"%>
<%@page import="model.book"%>
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
		text-align: right;
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
	#adviceArea{
    		width:900px;
    		float:left;
    		padding:30px; 
	}
	#nav{
		background-color: #eeeeee;
		line-height:30px;
		height:710px;
		width:100px;
		float:left;
		border:2px solid #CCCCCC;
	}
	#button{
		color:#0072E3;
		border:1px solid #0072E3;
		width:100px;
		height:40px;
		background-color:#eeeeee;
		-webkit-appearance: button;
		font-size:15px;
		margin-top: 3px;
		border-radius: 15px;
	}
	#button:HOVER {
		background-color:#97CBFF;
	}
		
	a{ text-decoration: none;
		color:black;
	}
 	a:hover{color:#ff0000}
</style>
<script>
	function fun_a(){
		location.href="booklist/bookMessages.jsp?id=00000";
	}
	function fun_b(){
		location.href="booklist/bookMessages.jsp?id=00001";
	}
	function fun_c(){
		location.href="booklist/bookMessages.jsp?id=00002";
	}
	function fun_d(){
		location.href="booklist/bookMessages.jsp?id=00003";
	}
</script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
	<div id="header">
		<img src="img/book.png" align="left" width="110" height="45">
 		<form action="/BookstoreOnLine/RegisterOrLogon" method="get" name="form">
		<%
			if(session.getAttribute("user_id")!=null)
				out.println(session.getAttribute("user_id"));
		%>
		<a href="/BookstoreOnLine/GetUserAllBuyBookList"><input type="button" value="书架" id="button"></a>	
		<a></a>
		<input type="submit" value="登陆" name="submit" id="button">
		<input type="submit" value="注册" name="submit" id="button">
		</form>
	</div>
	<div id="nav">
		<table >
		<tr><td width="100px" align="center" ><a href="booklist/xuanhuan.jsp" id="a">玄幻</a></td></tr>
		<tr><td><hr/></td></tr>
		<tr><td width="100px" align="center"><a href="booklist/qihuan.jsp" id="a">奇幻</a></td></tr>
		<tr><td><hr/></td></tr>
		<tr><td width="100px" align="center"><a href="booklist/wuxia.jsp" id="a">武侠</a></td></tr>
		<tr><td><hr/></td></tr>
		<tr><td width="100px" align="center"><a href="booklist/xianxia.jsp" id="a">仙侠</a></td></tr>
		<tr><td><hr/></td></tr>
		<tr><td width="100px" align="center"><a href="booklist/dushi.jsp" id="a">都市</a></td></tr>
		<tr><td><hr/></td></tr>
		<tr><td width="100px" align="center"><a href="booklist/xianshi.jsp" id="a">现实</a></td></tr>
		<tr><td><hr/></td></tr>
		<tr><td width="100px" align="center"><a href="booklist/junshi.jsp" id="a">军事</a></td></tr>
		<tr><td><hr/></td></tr>
		<tr><td width="100px" align="center"><a href="booklist/lishi.jsp" id="a">历史</a></td></tr>
		<tr><td><hr/></td></tr>
		<tr><td width="100px" align="center"><a href="booklist/youxi.jsp" id="a">游戏</a></td></tr>
		<tr><td><hr/></td></tr>
		<tr><td width="100px" align="center"><a href="booklist/tiyu.jsp" id="a">体育</a></td></tr>
		<tr><td><hr/></td></tr>
		<tr><td width="100px" align="center"><a href="booklist/kehuan.jsp" id="a">科幻</a></td></tr>
		<tr><td><hr/></td></tr>
		<tr><td width="100px" align="center"><a href="booklist/nvshengwang.jsp" id="a">女生网</a></td></tr>
		<tr><td><hr/></td></tr>
		<tr><td width="100px" align="center"><a href="booklist/erciyuan.jsp" id="a">二次元</a></td></tr>
		</table>
	</div>
	<div id="adviceArea">
		<font size="4">小编推荐</font>
 		<hr/>
 		<jsp:useBean id="dbso" class="dao.db_seekOperation" scope="page">
 		</jsp:useBean>
 		<%
			Vector<book> bl=dbso.getAdviceBookMessageVector(dbso.getAdviceBookNumVector());
			Iterator<book> it=bl.iterator();
			out.println("<table>");
			int i=0;
			while(it.hasNext()){
			book b=it.next();
			String href="booklist/bookMessages.jsp?id="+b.getBook_id();
			if((i+1)%4==0||i==0) out.println("<tr>");
		%>
			<td align="center" width=260px>
			<a href=<%=href %>  id="a" >
			<img src=<%=b.getBook_image() %> width="150px" height="200px"><br/>
			<h3><%=b.getBook_name() %></h3></a>
			</td>
		<%
			if((i+1)%3==0) out.println("</tr><tr><td><br/></td></tr>");
			i++;
		}
		%>
		</table>
	</div>
	<div id="section">
	</div>
	<div id="footer">
		<font size="2">当您使用本站时，代表您以接受了本站的使用条款和隐私条款。版权所有，保留一切权利，违权必究。
		<br/>联系我们：QQ：935166424 电话：15797362645
		</font>		
	</div>
</body>
</html>