package hhh;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletUtilities
 */
@WebServlet("/ServletUtilities")
public class ServletUtilities extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletUtilities() {
        super();
        // TODO Auto-generated constructor stub
    }
    public static String filter(String input){
    	if(!hasSpecialChars(input))
    		return input;
    	StringBuffer filtered=new StringBuffer(input.length());
    	for(int i=0;i<input.length();i++){
    		switch(input.charAt(i)){
    			case '<':filtered.append("&lt;");break;
    			case '>':filtered.append("&gt;");break;
    			case '"':filtered.append("&quot");break;
    			case '&':filtered.append("");break;
    			default :filtered.append(i);
    		}
    	}
    	return filtered.toString();
    }
    public static boolean hasSpecialChars(String input){
    	boolean flag=false;
    	if(input!=null&&!input.equals("")){
    		for(int i=0;i<input.length();i++){
        		switch(input.charAt(i)){
        			case '<':flag=true;break;
        			case '>':flag=true;break;
        			case '"':flag=true;break;
        			case '&':flag=true;break;
        		}
        	}
    	}
    	return flag;
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
