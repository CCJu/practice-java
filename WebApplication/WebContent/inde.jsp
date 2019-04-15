<%-- 
    Document   : inde
    Created on : 2017-10-26, 10:24:07
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body> 
    <%!
    	public 
    %>
    	<form action="newjsp.jsp" method="post" name="name">
        <table >    
            <tr align="left">
            	<td>name:<input type="text" name="name"></td>
            </tr>
            <%
            	if (request.getAttribute("a") == null)
                	out.print("");
                else {
                	if (request.getAttribute("a").equals("null")) 
                    	out.println(request.getAttribute("a"));
                }
            %>
            <tr align="left">
            	<td></td>
            </tr>
        </table>
        </form>>   
    </body>
</html>
