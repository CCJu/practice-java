package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.CourseManageService;
import model.Course;


/**
 * Servlet implementation class CourseManageController
 */
@WebServlet("/CourseManageController")
public class CourseManageController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CourseManageController() {
        super();
        // TODO Auto-generated constructor stub
    }
    /**
     * 执行查询请求
     * @param request
     * @param response
     * @param cms
     * @param cou
     * @throws IOException 
     * @throws ServletException 
     */
    protected void query(HttpServletRequest request, HttpServletResponse response,CourseManageService cms,Course cou) throws ServletException, IOException {
    	ArrayList<Course> couPage=cms.queryForPage(cou);
    	request.setAttribute("couPage", couPage);
    	request.getRequestDispatcher("WEB-INF/view/CourseManage/CourseManageList.jsp").forward(request, response);
    }
    /**
     * 执行添加请求
     * @param request
     * @param response
     * @param cms
     * @param cou
     * @throws IOException 
     * @throws ServletException 
     */
    protected void add(HttpServletRequest request, HttpServletResponse response,CourseManageService cms,Course cou) throws ServletException, IOException {
    	String way=request.getParameter("way");
    	if("into".equals(way)) {
    		request.getRequestDispatcher("WEB-INF/view/CourseManage/CourseManageAdd.jsp").forward(request, response);
    	}else {
    		boolean b=cms.add(cou);
    		if(!b) {
    			request.setAttribute("error", "标示已存在");
    			request.getRequestDispatcher("WEB-INF/view/CourseManage/CourseManageAdd.jsp").forward(request, response);
    		}else {
    			query(request, response, cms, new Course());
    		}
    	}
    }
    /**
     * 执行修改请求
     * @param request
     * @param response
     * @param cms
     * @param cou
     * @throws IOException 
     * @throws ServletException 
     */
    protected void update(HttpServletRequest request, HttpServletResponse response,CourseManageService cms,Course cou) throws ServletException, IOException {
    	if(cou.getCname()!=null&&!"".equals(cou.getCname())) {
    		cms.update(cou);
    		query(request, response, cms, new Course());
    	}else {
    		Course c=cms.queryForClass(cou);
    		request.setAttribute("course", c);
    		request.getRequestDispatcher("WEB-INF/view/CourseManage/CourseManageModify.jsp").forward(request, response);
    	}
    }
    
    protected void delete(HttpServletRequest request, HttpServletResponse response,CourseManageService cms,Course cou) throws ServletException, IOException {
    	cms.delete(cou);
    	query(request, response, cms, new Course());
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		String requestType=request.getParameter("type");
		CourseManageService cms=new CourseManageService();
		
		Course cou=new Course();
		String name=request.getParameter("cname");
		cou.setCno(request.getParameter("cno"));
		cou.setCname(name==null?"":new String(name.getBytes("iso-8859-1")));
		String timelength=request.getParameter("timelength");
		String credits=request.getParameter("credits");
		if(timelength!=null)
			cou.setTimelength("".equals(timelength)?0:Integer.parseInt(timelength));
		if(credits!=null)
			cou.setCredits("".equals(credits)?0:Integer.parseInt(credits));
		
		if(requestType==null||requestType.equals("select")) {
			query(request,response, cms,cou);
		}else if(requestType.equals("add")) {
			add(request, response,cms, cou);
		}else if(requestType.equals("update")) {
			update(request, response, cms, cou);
		}else if(requestType.equals("delete")) {
			delete(request, response, cms, cou);
		}
//		StringBuffer s=new StringBuffer(request.getHeader("Referer"));
//		if(s.substring(s.lastIndexOf("/")+1, s.length()).equals("index.jsp")||
//				s.substring(s.lastIndexOf("/")+1, s.length()).equals("CourseManageList.jsp")) {
//			if("modify".equals(request.getParameter("select"))) {
//				String key=request.getParameter("key");
//				Course cou=new Course();
//				if(key!=null&&!"".equals(key)) {
//					cou.setCno(key);
//					HttpSession session=request.getSession();
//					session.removeAttribute("course");
//					cou=cd.queryForClass(cou);
//					session.setAttribute("course", cou);
//					response.sendRedirect("com/tms/view/CourseManage/CourseManageModify.jsp");
//				}
//			}else if("delete".equals(request.getParameter("select"))){
//				String key=request.getParameter("key");
//				Course cou=new Course();
//				if(key!=null&&!"".equals(key)) {
//					cou.setCno(key);
//					cd.delete(cou);
//					HttpSession session=request.getSession();
//					session.removeAttribute("couPage");
//					cou=new Course();
//					session.setAttribute("couPage", cd.queryForPage(cou));
//					response.sendRedirect("com/tms/view/CourseManage/CourseManageList.jsp");
//				}
//			}else {
//				Course cou=new Course();
//				cou.setCno(request.getParameter("cnum"));
//				String name=request.getParameter("name");
//				if(name!=null&&!"".equals(name))
//					cou.setCname(new String(request.getParameter("name").getBytes("iso8859-1"),"UTF-8"));
//				else
//					cou.setCname(name);
//				HttpSession session=request.getSession();
//				session.removeAttribute("couPage");
//				session.setAttribute("couPage", cd.queryForPage(cou));
//				response.sendRedirect("com/tms/view/CourseManage/CourseManageList.jsp");
//			}
//		}else if(s.substring(s.lastIndexOf("/")+1, s.length()).equals("CourseManageAdd.jsp")) {
//			//增加
//			Course cou=new Course();
//			cou.setCno(request.getParameter("cnum"));
//			cou.setCname(request.getParameter("name"));
//			cou.setTimelength(Integer.parseInt(request.getParameter("timelength")));
//			cou.setCredits(Integer.parseInt(request.getParameter("credits")));
//			//判断cnum是否存在
//			if(cd.exists(cou)) {
//				request.getSession().setAttribute("miss","已被占有");
//				response.sendRedirect("com/tms/view/CourseManage/CourseManageAdd.jsp");
//			}else{
//				//写入
//				cd.add(cou);
//				HttpSession session=request.getSession();
//				session.removeAttribute("couPage");
//				cou=new Course();
//				session.setAttribute("couPage", cd.queryForPage(cou));
//				response.sendRedirect("com/tms/view/CourseManage/CourseManageList.jsp");
//			}
//		}else if(s.substring(s.lastIndexOf("/")+1, s.length()).equals("CourseManageModify.jsp")||"modify".equals(request.getParameter("select"))) {
//			//修改
//			Course cou=new Course();
//			cou.setCno(request.getParameter("key"));
//			cou.setCname(new String(request.getParameter("name").getBytes("iso8859-1"),"UTF-8"));
//			cou.setTimelength(Integer.parseInt(request.getParameter("timelength")));
//			cou.setCredits(Integer.parseInt(request.getParameter("credits")));
//			cd.update(cou);
//			HttpSession session=request.getSession();
//			session.removeAttribute("couPage");
//			cou=new Course();
//			session.setAttribute("couPage", cd.queryForPage(cou));
//			response.sendRedirect("com/tms/view/CourseManage/CourseManageList.jsp");
//		}else {
//			HttpSession session=request.getSession();
//			session.removeAttribute("couPage");
//			session.setAttribute("couPage", cd.queryForPage(new Course()));
//			response.sendRedirect("com/tms/view/CourseManage/CourseManageList.jsp");
//		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
