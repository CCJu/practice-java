package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.GradeManageService;
import model.Grade;
import model.Record;

/**
 * Servlet implementation class GradeManageController
 */
@WebServlet("/GradeManageController")
public class GradeManageController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GradeManageController() {
        super();
        // TODO Auto-generated constructor stub
    }
    /**
     * 执行查询请求
     * @param request
     * @param response
     * @param gms
     * @param r
     * @throws ServletException
     * @throws IOException
     */
    protected void query(HttpServletRequest request, HttpServletResponse response,GradeManageService gms,Record r) throws ServletException, IOException {
    	ArrayList<Record> recPage=gms.queryForPage(r);
    	request.setAttribute("recPage", recPage);
		request.getRequestDispatcher("WEB-INF/view/GradeManage/GradeManageList.jsp").forward(request, response);
	}
    /**
     * 执行增加请求
     * @param request
     * @param response
     * @param gms
     * @param g
     * @throws ServletException
     * @throws IOException
     */
    protected void add(HttpServletRequest request, HttpServletResponse response,GradeManageService gms,Grade gra) throws ServletException, IOException {
    	String way=request.getParameter("way");
    	if("into".equals(way))
    		request.getRequestDispatcher("WEB-INF/view/GradeManage/GradeManageAdd.jsp").forward(request, response);
    	else {
    		HashMap<String, String> hm=gms.add(gra);
    		if(hm!=null) {
    			request.setAttribute("error", hm);
        		request.getRequestDispatcher("WEB-INF/view/GradeManage/GradeManageAdd.jsp").forward(request, response);
    		}else {
        		query(request, response, gms, new Record());
    		}
    	}
	}
    /**
     * 执行更新请求
     * @param request
     * @param response
     * @param gms
     * @param rec
     * @throws ServletException
     * @throws IOException
     */
    protected void update(HttpServletRequest request, HttpServletResponse response,GradeManageService gms,Record rec) throws ServletException, IOException {
    	String way=request.getParameter("way");
    	if("into".equals(way)) {
    		Record record=gms.queryForClass(rec);
    		request.setAttribute("record", record);
    		request.getRequestDispatcher("WEB-INF/view/GradeManage/GradeManageModify.jsp").forward(request, response);
        }else {
        	gms.update(rec);
        	query(request, response, gms, new Record());
        }
    }
    
    protected void delete(HttpServletRequest request, HttpServletResponse response,GradeManageService gms,Record rec) throws ServletException, IOException {
    	gms.delete(rec);
    	query(request, response, gms, new Record());
    }
    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		GradeManageService gms=new GradeManageService();
		String requestType=request.getParameter("type");
		Record r=new Record();
		r.setSnum(request.getParameter("snum"));
		r.setCname(request.getParameter("cname"));
		r.setSdept(request.getParameter("sdept"));
		r.setSname(request.getParameter("sname"));
		String grade=request.getParameter("grade");
		if(grade!=null&&!"".equals(grade))
			r.setGrade((Double.parseDouble(grade)));
		if(requestType==null||requestType.equals("select")) {
			query(request, response, gms,r);
		}else if(requestType.equals("add")) {
			Grade g=new Grade();
			g.setSno(request.getParameter("snum"));
			g.setCno(request.getParameter("cnum"));
			grade=request.getParameter("grade");
			if(grade!=null&&!"".equals(grade))
				g.setResult((Double.parseDouble(grade)));
			add(request, response, gms, g);
		}else if(requestType.equals("update")) {
			update(request, response, gms, r);
		}else if(requestType.equals("delete")) {
			delete(request, response, gms, r);
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
