package hello;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class test0
 */
@WebServlet("/test0")
public class test0 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private Long modetime;
    private int []number=new int[10];
    /**
     * @see HttpServlet#HttpServlet()
     */
    public test0() {
        super();
        // TODO Auto-generated constructor stub
    }
    public int randomNum(){
    	Random r=new Random();
    	return r.nextInt(100);
    }
    public void init() throws ServletException{
    	modetime=System.currentTimeMillis()/1000*1000;
    	for(int i=0;i<10;i++){
    		number[i]=randomNum();
    	}
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<h1>hello world</h1>");
		for(int i=0;i<number.length;i++)
			out.println(number[i]);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
