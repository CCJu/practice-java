package hhh;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

/**
 * Servlet implementation class test
 */
@WebServlet("/test")
public class test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//    private void showPreview(HttpServletRequest request,PrintWriter out){
//    	String headingFont =request.getParameter("headingFont");
//    	headingFont=replaceIfMissing(headingFont, "");
//    }
//    public void storeResume(HttpServletRequest request){
//    	
//    }
//    public void showConfirmation(HttpServletRequest request,PrintWriter out){
//    	
//    }
//    private String replaceIfMissing(String orig,String replacement){
//    	if((orig==null)||(orig.trim().equals(""))){
//    		return replacement;
//    	}else
//    		return orig;
//    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		InsuranceInfo i=new InsuranceInfo();
		try {
			BeanUtils.populate(i, request.getParameterMap());
			out.println(i.getName());
			out.println(i.getEmployeeID());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
