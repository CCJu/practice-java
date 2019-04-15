package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.db_seekOperation;
import model.order;
import service.BookNumToOrder;

/**
 * Servlet implementation class GetUserAllBuyBookList
 */
@WebServlet("/GetUserAllBuyBookList")
public class GetUserAllBuyBookList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetUserAllBuyBookList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out=response.getWriter();
		String user_id=(String)request.getSession().getAttribute("user_id");
		if(user_id==null){
			response.setContentType("text/html");
			out.println("<h1 align='center'>You do not log in, please login again!<br/><br/><br/>After 5 seconds automatically jump to the login page.<h1>");
			response.setHeader("Refresh", "5;URL=/BookstoreOnLine/com/bookstore/view/logIn/land.jsp");
		}else{
			db_seekOperation dbso=new db_seekOperation();
			if(dbso.isBuyBookNumEmpty(user_id)){
				response.setContentType("text/html");
				out.println("<h1 align='center'>Not to buy, please buy!<br/><br/><br/>Jump to the home page automatically after 5 seconds<h1>");
				response.setHeader("Refresh", "5;URL=/BookstoreOnLine/com/bookstore/view/index.jsp");
			}
			else{
				BookNumToOrder bnto=new BookNumToOrder();
				String bookList[]=dbso.getOwnBooklist(user_id);
				ArrayList al=bnto.to(bookList);
				request.setAttribute("al", al);
				response.setContentType("text/html; charset=UTF-8");
				request.setCharacterEncoding("UTF-8");
				request.getRequestDispatcher("/com/bookstore/view/buybook/shoppingCart.jsp").forward(request, response);;
			}			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
