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
		height:720px;
		width:100px;
		float:left;
		border:2px solid #CCCCCC;
	}
	#content{
		padding :6px;
		margin: 0 auto;
		/* background-color: #eeeeee; */
		line-height:15px;
		height:710px;
		width:79%;
		float:center;
		border:1px solid #CCCCCC;
	}
	#message_area{
		padding :5px;
		margin: 0 auto;
		width:95%;
		/* background-color: red; */ 
		height:200px;
	}
	#bookmess_area{
		padding :5px;
		margin: 0 auto;
		width:60%;
	}
	#bookmess_area1{
		padding :5px;
		margin: 0 auto;
		width:90%;
	}
	#bookmess_index{
		padding :5px;
		margin: 0 auto;
		width:95%;
		
	}
	#footer{
		background-color: #7f2f00;
		width:100%;
		color:white;
		clear:both;
		text-align: center;
        padding:5px
	}
	#font{
		margin-top: 6px;
		font-style:oblique;
		font-size: 30px;
		font-weight: bold;
	}
	#button{
		color:white;
		border:1px solid red;
		background-color:red;
		width:100px;
		height:40px;
		-webkit-appearance: button;
		font-size:15px;
		margin-top: 6px;
	}
	#button:HOVER {
		background-color:#FF5151;
	}
	#button1{
		color:#0072E3;
		border:1px solid #0072E3;
		width:100px;
		height:40px;
		background-color:#eeeeee;
		-webkit-appearance: button;
		font-size:15px;
		margin-top: 6px;
	}
	#button1:HOVER {
		background-color:#97CBFF;
	}
	#button2{
		color:#0072E3;
		border:1px solid #0072E3;
		width:100px;
		height:40px;
		background-color:#eeeeee;
		-webkit-appearance: button;
		font-size:15px;
		margin-top: 6px;
		border:none;
	}
	#button2:HOVER {
		color:#97CBFF;
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
		<tr><td width="100px" align="center" ><a href="/BookstoreOnLine/com/bookstore/view/booklist/xuanhuan.jsp" id="a">玄幻</a></td></tr>
		<tr><td><hr/></td></tr>
		<tr><td width="100px" align="center"><a href="/BookstoreOnLine/com/bookstore/view/booklist/qihuan.jsp" id="a">奇幻</a></td></tr>
		<tr><td><hr/></td></tr>
		<tr><td width="100px" align="center"><a href="/BookstoreOnLine/com/bookstore/view/booklist/wuxia.jsp" id="a">武侠</a></td></tr>
		<tr><td><hr/></td></tr>
		<tr><td width="100px" align="center"><a href="/BookstoreOnLine/com/bookstore/view/booklist/xianxia.jsp" id="a">仙侠</a></td></tr>
		<tr><td><hr/></td></tr>
		<tr><td width="100px" align="center"><a href="/BookstoreOnLine/com/bookstore/view/booklist/dushi.jsp" id="a">都市</a></td></tr>
		<tr><td><hr/></td></tr>
		<tr><td width="100px" align="center"><a href="/BookstoreOnLine/com/bookstore/view/booklist/xianshi.jsp" id="a">现实</a></td></tr>
		<tr><td><hr/></td></tr>
		<tr><td width="100px" align="center"><a href="/BookstoreOnLine/com/bookstore/view/booklist/junshi.jsp" id="a">军事</a></td></tr>
		<tr><td><hr/></td></tr>
		<tr><td width="100px" align="center"><a href="/BookstoreOnLine/com/bookstore/view/booklist/lishi.jsp" id="a">历史</a></td></tr>
		<tr><td><hr/></td></tr>
		<tr><td width="100px" align="center"><a href="/BookstoreOnLine/com/bookstore/view/booklist/youxi.jsp" id="a">游戏</a></td></tr>
		<tr><td><hr/></td></tr>
		<tr><td width="100px" align="center"><a href="/BookstoreOnLine/com/bookstore/view/booklist/tiyu.jsp" id="a">体育</a></td></tr>
		<tr><td><hr/></td></tr>
		<tr><td width="100px" align="center"><a href="/BookstoreOnLine/com/bookstore/view/booklist/kehuan.jsp" id="a">科幻</a></td></tr>
		<tr><td><hr/></td></tr>
		<tr><td width="100px" align="center"><a href="/BookstoreOnLine/com/bookstore/view/booklist/nvshengwang.jsp" id="a">女生网</a></td></tr>
		<tr><td><hr/></td></tr>
		<tr><td width="100px" align="center"><a href="/BookstoreOnLine/com/bookstore/view/booklist/erciyuan.jsp" id="a">二次元</a></td></tr>
		</table>
	</div>
	<%
		String read=request.getParameter("read"); 
		if(read==null){
	%>
	<div id="content">
	<div id="message_area">
	<jsp:useBean id="dbso" class="dao.db_seekOperation" scope="page"></jsp:useBean>
	<%
		String s=request.getParameter("id");
		String ss[]=dbso.getBookMessages(s);
	%>
	<img src="<%=ss[3] %>" width="150px" height="200px" align="left">
	<div id="bookmess_area">
	<h2><%=ss[1]%></h2>
	<h3><%=ss[4] %></h3>
	<% 
		String url1="/BookstoreOnLine/IsUserOnLine?id="+ss[0];
		String url="/BookstoreOnLine/com/bookstore/view/buybook/shoppingCart.jsp?id="+ss[0];
	%>
	<input type="button" value="点击购买" id="button" onclick="window.location='<%=url1%>'">
	<input type="button" value="加入购物车" id="button1" onclick="window.location='<%=url%>'">
	</div>
	</div>
	<div id="bookmess_index">
	<input type="button" value="作品信息" id="button2">
	</div>
	<div id="bookmess_area1">
	<p><%=ss[5] %></p>
	</div>
	</div>
	<%
		}else
			out.println("hello");
	%>
	<div id="footer">
		<font size="2">当您使用本站时，代表您以接受了本站的使用条款和隐私条款。版权所有，保留一切权利，违权必究。
		<br/>联系我们：QQ：935166424 电话：15797362645
		</font>		
	</div>
</body>
</html>