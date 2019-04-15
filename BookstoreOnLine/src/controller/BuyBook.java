package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.db_addOperation;

/**
 * Servlet implementation class BuyBook
 */
@WebServlet("/BuyBook")
public class BuyBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuyBook() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected boolean getBuyResult(String user_id,String book_id){
		db_addOperation dbao=new db_addOperation();
		return dbao.saveBuyBookNum(user_id, book_id);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String user_id=request.getParameter("user_id");
		String book_id=request.getParameter("book_id");
		boolean result=getBuyResult(user_id, book_id);
		if(!result){
			out.print("<script type='text/javascript'>alert('Your balance is insufficient, buy failure, return after 3 seconds.');");
            out.print("window.onload = function(){setTimeout('window.history.back(-1)',1500);}");
            out.print("</script>");
		}else{
			out.print("<script type='text/javascript'>alert('Buy success, welcome next time to buy.');");
            out.print("window.onload = function(){setTimeout('window.history.back(-1)',500);}");
            out.print("</script>");
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
