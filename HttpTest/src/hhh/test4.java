package hhh;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class test4
 */
@WebServlet("/test4")
public class test4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public test4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("ContentType:"+request.getContentType()+"<br/>");
		out.println("RequestURl:"+request.getRequestURI()+"<br/>");
		out.println("Method:"+request.getMethod()+"<br/>");
		out.println("Protocol:"+request.getProtocol()+"<br/>");
		Enumeration e=request.getHeaderNames();
		out.println("<table border='1'>");
		while(e.hasMoreElements()){
			String headerName=(String)e.nextElement();
			out.println("<tr><td>");
			out.println(headerName+"</td>");
			out.println("<td>"+request.getHeader(headerName));
			out.println("</td></tr>");
		}
		out.println("</table>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
