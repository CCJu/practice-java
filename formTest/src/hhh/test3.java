package hhh;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanUtils;

/**
 * Servlet implementation class test3
 */
@WebServlet("/test3")
public class test3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public test3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected boolean nameIsTrue(String name){
    	if(name.equals(""))
    		return true;
    	else
    		return false;
    }
    protected boolean idIsNull(String id){
    	if(id.equals(""))
    		return true;
    	else
    		return false;
    }
    protected InsuranceInfo get(){
    	return new InsuranceInfo();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		InsuranceInfo i=new InsuranceInfo();
		try {
			BeanUtils.populate(i, request.getParameterMap());
//			HttpSession session=request.getSession();
//			session.setAttribute("in", i);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.println(i.getName());
		out.println("<form action='' method='post'>");
		out.println("name:<input type='text' name='name' value='"+i.getName()+"'><br/>");
		out.println("ID:<input type='text' name='employeeID' value='"+i.getEmployeeID()+"'><br/>");
		out.println("Children num:<input type='text' name='numChildren' value='"+i.getNumChildren()+"'><br/>");
		out.println("<input type='submit' value='enter'><br/>");
		
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
