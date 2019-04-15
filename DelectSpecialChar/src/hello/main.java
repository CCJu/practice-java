package hello;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class main
 */
@WebServlet("/main")
public class main extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public main() {
        super();
        // TODO Auto-generated constructor stub
    }
    public static boolean hasSpecialChar(String str){
    	boolean a=false;
    	StringBuffer sb=new StringBuffer(str);
    	for(int i=0;i<str.length();i++){
    		switch(sb.charAt(i)){
    			case '<':a=true;break;
    			case '>':a=true;break;
    			case '"':a=true;break;
    			case '&':a=true;break;
    		}
    	}
    	return a;
    }
    public static String filter(String input){
    	if(hasSpecialChar(input))
    		return input;
    	else{
    		StringBuffer sb=new StringBuffer(input.length());
    		for(int i=0;i<input.length();i++){
    			switch(sb.charAt(i)){
    				case '<':sb.append("&lt");break;
    				case '>':sb.append("&gt");break;
    				case '"':sb.append("&quot");break;
    				case '&':sb.append("&amp");break;
    				default :sb.append(sb.charAt(i));
    			}
    		}
    		return sb.toString();
    	}
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
