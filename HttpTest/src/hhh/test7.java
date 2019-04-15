package hhh;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class test7
 */
@WebServlet("/test7")
public class test7 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public test7() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		HashMap hm=new HashMap();
		hm.put("AUTH_TYPE",request.getAuthType());
		hm.put("Content_LENGTH", request.getContentLength());
		hm.put("CONTENT_TYPE", request.getContentType());
		hm.put("DOCUMENT_ROOT", request.getServletContext().getRealPath("/"));
		hm.put("PATH_INFO",request.getPathInfo() );
		hm.put("PATH_TRANSLATED", request.getPathTranslated());
		hm.put("QUERY_String", request.getQueryString());
		Set s=hm.keySet();
		Iterator it=s.iterator();
		while(it.hasNext()){
			out.println(it.next()+" "+hm.get(it.next())+"<br/>");
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
