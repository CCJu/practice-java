package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.db_seekOperation;
import service.UserLandMessageError;

/**
 * Servlet implementation class UserExists
 */
@WebServlet("/UserExists")
public class UserExists extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserExists() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		db_seekOperation op=new db_seekOperation();
		//获取用户登陆时输入的信息
		String id=request.getParameter("land_id");
		String password=request.getParameter("land_password");
		String user=request.getParameter("user");
//		String value=request.getParameter("land_message_save");
		//调用工具类的方法，判断登陆信息是否有格式错误
		UserLandMessageError ume=new UserLandMessageError();
		String id_error=ume.getErrorMessage(id, true);
		String password_error=ume.getErrorMessage(password, false);
		if(id_error==null&&password_error==null){
			//判断登陆用户的密码是否正确
			try {
				if(user.equals("1")){
					if(op.UserExists(id,password)){
						request.getSession().setAttribute("user_id", id);
						response.sendRedirect("/BookstoreOnLine/com/bookstore/view/index.jsp");
					}else{
						request.setAttribute("error","Account or password error");
						request.getRequestDispatcher("com/bookstore/view/logIn/land.jsp").forward(request, response);
					}
				}else{
					if(op.AdministratorExists(id, password)){
						request.getSession().setAttribute("administrator_id", id);
						response.sendRedirect("/BookstoreOnLine/com/bookstore/view/administer/administrator.jsp");
					}
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			//将错误信息带回登陆页面，显示给用户
			request.setAttribute("id_error", id_error);
			request.setAttribute("password_error",password_error);
			request.getRequestDispatcher("com/bookstore/view/logIn/land.jsp").forward(request, response);
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
