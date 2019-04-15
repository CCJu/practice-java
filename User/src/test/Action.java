package test;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class Action extends ActionSupport implements SessionAware{
	private Map session;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("this is Action");
		return SUCCESS;
	}
	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		session=arg0;
	}
	@Override
	public void validate() {
		if(session.get("username")==null)
			this.addFieldError("username", "未登录");
	}
	
}
