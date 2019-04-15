package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.db_addOperation;
import dao.db_seekOperation;
import service.UserLogonMessageError;

/**
 * Servlet implementation class SaveNewUser
 */
@WebServlet("/SaveNewUser")
public class SaveNewUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveNewUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		db_seekOperation seop=new db_seekOperation();
		db_addOperation adop=new db_addOperation();
		//从表单获取用于注册的信息
		String logon_name=request.getParameter("logon_name");
		String logon_email=request.getParameter("logon_email");
		String logon_password=request.getParameter("logon_password");
		String logon_password1=request.getParameter("logon_password1");
		//调用工具类的方法，判断用户提交的信息格式是否正确
		UserLogonMessageError ulme=new UserLogonMessageError();
		String name_error=ulme.getErrorMessage(logon_name,false);
		String password_error=ulme.getPasswordErrorMessage(logon_password, logon_password1);
		String email_error=ulme.getErrorMessage(logon_email, true); 
		if(name_error==null&&email_error==null&&password_error==null){
			//判断该Email是否已经被用于注册过
			try {
				if(!seop.UserExists(logon_email)){
					if(adop.saveUserMessages(logon_name, logon_email, logon_password))
						response.sendRedirect("land.jsp");
					else{
						request.setAttribute("error","Save failed");
						request.getRequestDispatcher("logon.jsp").forward(request, response);	
					}
				}else{
					request.setAttribute("error","email exist");
					request.getRequestDispatcher("logon.jsp").forward(request, response);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			//将错误信息带回到注册页面显示给用户
			request.setAttribute("name_error",name_error);
			request.setAttribute("password_error",password_error);
			request.setAttribute("email_error", email_error); 
			request.getRequestDispatcher("logon.jsp").forward(request, response);
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
