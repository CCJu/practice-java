<%@page import="dao.db_addOperation"%>
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
	#nav{
		background-color: #eeeeee;
		line-height:30px;
		height:720px;
		width:100px;
		float:left;
		border:2px solid #CCCCCC;
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
		<p id="font">BSOL</p>
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
	<div id="content">
	<jsp:useBean id="dbso" class="dao.db_seekOperation" scope="page"></jsp:useBean>
	<%
		String ss[]=dbso.getBookMessages(request.getParameter("id"));
	%>	
		<h2>全部商品</h2><hr/>
		<center>
		<table border="1">
		<tr><td>
		<img src="<%=ss[3] %>" width="150px" height="200px" align="left">
		</td><td><table >
		<tr><td height="10px"><h2><%=ss[1] %></h2><h4><%=ss[4] %></h4></td></tr>
		<tr><td><h4><%=ss[5] %></h4></td></tr><tr><td><font size="10" color="#EA0000"><%=ss[2] %></font></td></tr>
		</table></td>
		</tr>
		</table>
		<%String url="/BookstoreOnLine/BuyBook?user_id="+session.getAttribute("user_id")+"&book_id="+ss[0]; %>
		<a href=<%=url%>><input type="submit" id="button" value="立即购买"></a>
		</center>
	</div>
	<div id="footer">
		<font size="2">当您使用本站时，代表您以接受了本站的使用条款和隐私条款。版权所有，保留一切权利，违权必究。
		<br/>联系我们：QQ：935166424 电话：15797362645
		</font>		
	</div>
</body>
</html>