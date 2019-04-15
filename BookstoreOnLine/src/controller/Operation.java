package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.db_deleOperation;

/**
 * Servlet implementation class Operation
 */
@WebServlet("/Operation")
public class Operation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Operation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		String []id=request.getParameterValues("button");
		String submitValue=request.getParameter("submit");
		if(id==null){
			out.print("<script type='text/javascript'>alert('No choice, please choose again.');");
            out.print("window.onload = function(){setTimeout('window.history.back(-1)',1500);}");
            out.print("</script>");
		}
		else{
			String tableName=null;
			if(submitValue.equals("delete user"))
				tableName="bsol_user";
			else if(submitValue.equals("delete book"))
				tableName="bsol_book";
			else{
				
			}
			db_deleOperation dbdo=new db_deleOperation();
			if(dbdo.deleTableMessages(id, tableName)){
				out.print("<script type='text/javascript'>alert('Deleted successfully, return 1 seconds..');");
				out.print("window.onload = function(){setTimeout('window.history.back(-1)',1500);}");
				out.print("</script>");
			}else{
				out.print("<script type='text/javascript'>alert('Unknown error, Delete failed, return 1 seconds..');");
				out.print("window.onload = function(){setTimeout('window.history.back(-1)',1500);}");
				out.print("</script>");
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
