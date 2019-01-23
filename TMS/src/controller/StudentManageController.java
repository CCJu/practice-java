package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.StudentManageService;
import model.Student;

/**
 * Servlet implementation class StudentManageController
 */
@WebServlet("/StudentManageController")
public class StudentManageController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public StudentManageController() {
        // TODO Auto-generated constructor stub
    }
    
    /**
	 * 控制查询请求执行
	 * @param request
	 * @param sms
	 * @param s
     * @throws IOException 
     * @throws ServletException 
	 */
    protected void query(HttpServletRequest request,HttpServletResponse response,StudentManageService sms,Student s) throws ServletException, IOException {
    	request.removeAttribute("stuPage");
		request.setAttribute("stuPage", sms.queryForPage(s));
		request.getRequestDispatcher("WEB-INF/view/StudentManage/StudentManageList.jsp").forward(request, response);
    }
	/**
	 * 控制添加请求执行
	 * @param request
	 * @param sms
	 * @param s
	 * @throws IOException 
	 * @throws ServletException 
	 */
    protected void add(HttpServletRequest request,HttpServletResponse response,StudentManageService sms,Student s) throws ServletException, IOException {
    	String message=sms.add(s);
    	if(message.equals("exists")) {
    		request.setAttribute("error","被占用");
			request.getRequestDispatcher("WEB-INF/view/StudentManage/StudentManageAdd.jsp").forward(request, response);
    	}else if(message.equals("false")) {
			request.getRequestDispatcher("WEB-INF/view/StudentManage/StudentManageAdd.jsp").forward(request, response);
    	}else {
			query(request, response, sms, new Student());
    	}
    }
    /**
     * 执行修改请求
     * @param request
     * @param response
     * @param sms
     * @param s
     * @throws ServletException
     * @throws IOException
     */
    protected void update(HttpServletRequest request,HttpServletResponse response,StudentManageService sms,Student s) throws ServletException, IOException {
    	Student stu=sms.update(s);
    	if(stu==null)
    		query(request, response, sms, new Student());
    	else {
    		request.setAttribute("student", stu);
    		request.getRequestDispatcher("WEB-INF/view/StudentManage/StudentManageModify.jsp").forward(request, response);
    	}
    }
    /**
     * 执行删除请求
     * @param request
     * @param response
     * @param sms
     * @param s
     * @throws ServletException
     * @throws IOException
     */
    protected void delete(HttpServletRequest request,HttpServletResponse response,StudentManageService sms,Student s) throws ServletException, IOException {
    	sms.delete(s);
    	query(request, response, sms, new Student());
    }
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		StudentManageService sms=new StudentManageService();
		String requestType=request.getParameter("type");
		
		Student stu=new Student();
		stu.setSno(request.getParameter("snum"));
		String name=request.getParameter("name");
		String sex=request.getParameter("sex");
		String sdept=request.getParameter("sdept");
		stu.setSname(name==null?"":new String(name.getBytes("iso-8859-1")));
		stu.setSex(sex==null?"":new String(sex.getBytes("iso-8859-1")));
		stu.setBirthdate(request.getParameter("birthdate"));
		stu.setSdept(sdept==null?"":new String(sdept.getBytes("iso-8859-1")));
		
		if(requestType==null||requestType.equals("select")) {
			query(request,response, sms,stu);
		}else if(requestType.equals("add")) {
			add(request, response,sms, stu);
		}else if(requestType.equals("update")) {
			update(request, response, sms, stu);
		}else if(requestType.equals("delete")) {
			delete(request, response, sms, stu);
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
