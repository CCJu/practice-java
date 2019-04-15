package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IsUserOnLine
 */
@WebServlet("/IsUserOnLine")
public class IsUserOnLine extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IsUserOnLine() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id=request.getParameter("id");
		PrintWriter out=response.getWriter();
		String user_id=(String)request.getSession().getAttribute("user_id");
		if(user_id==null){
			response.setContentType("text/html");
			out.println("<h1 align='center'>您未登陆，请重新登陆！<br/><br/><br/>5秒后自动跳转到登陆界面<h1>");
			response.setHeader("Refresh", "5;URL=/BookstoreOnLine/com/bookstore/view/logIn/land.jsp");
		}else
			response.sendRedirect("/BookstoreOnLine/com/bookstore/view/buybook/buy.jsp?id="+id);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
