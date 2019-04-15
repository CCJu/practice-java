package test;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

public class Action extends ActionSupport  implements ServletRequestAware{
	private HttpServletRequest request;
	public String add(){
		request.setAttribute("path", "update");
		return "add";
	}
	
	public String upDate(){
	System.out.println("执行upDateaction");
	return "update";
	}
	
	public String execute() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("执行action");
	request.setAttribute("path", "update");
	return SUCCESS;
	}

	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		request=arg0;
	}
}