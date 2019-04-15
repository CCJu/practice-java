package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.db_seekOperation;

/**
 * Servlet implementation class AdministerFeatureselection
 */
@WebServlet("/AdministerFeatureselection")
public class AdministerFeatureselection extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdministerFeatureselection() {
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
		String str=request.getParameter("function");
		if(str==null)
			str="";
		else{
			str=new String(str.getBytes("ISO-8859-1"));
		}
		if(str.equals("修改推荐书籍")){
			db_seekOperation op=new db_seekOperation();
			request.setAttribute("advice_bookList", op.getAdviceBookMessageVector(op.getAdviceBookNumVector()));
			request.getRequestDispatcher("/com/bookstore/view/administer/administrator.jsp").forward(request, response);
		}else if(str.equals("管理书籍")){
			db_seekOperation op=new db_seekOperation();
			request.setAttribute("book_list", op.getAllBookList());
			request.getRequestDispatcher("/com/bookstore/view/administer/administrator.jsp").forward(request, response);
		}else if(str.equals("管理用户")){
			db_seekOperation op=new db_seekOperation();
			request.setAttribute("user_list", op.getAllUserList());
			request.getRequestDispatcher("/com/bookstore/view/administer/administrator.jsp").forward(request, response);
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
