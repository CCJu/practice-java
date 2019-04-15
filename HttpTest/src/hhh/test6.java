package hhh;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.zip.GZIPOutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class test6
 */
@WebServlet("/test6")
public class test6 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public test6() {
        super();
        // TODO Auto-generated constructor stub
    }
    public static boolean isGzipSupported(HttpServletRequest request){
    	String s=request.getHeader("Accept-Encoding");
    	return (s!=null&&s.indexOf("gzip")!=-1);
    }
    
    public static boolean isGzipDisable(HttpServletRequest request){
    	String s=request.getParameter("disableGzip");
    	return (s!=null&&!s.equalsIgnoreCase("false"));
    }
    public static PrintWriter getGzipWriter(HttpServletResponse response) throws Exception{
    	return new PrintWriter(new GZIPOutputStream(response.getOutputStream()));
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
