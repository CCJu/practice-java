package test;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import tt.people;

public class loginAction extends ActionSupport implements ModelDriven<people> {
//	private String username;
//	private String password;
	
	private people p=new people();
	
//	
//	private people p;
//	
//	public people getP() {
//		return p;
//	}
//
//	public void setP(people p) {
//		this.p = p;
//	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		//System.out.println(p.getUsername());
//		if(p.getUsername().equals("")||p.getUsername()==null){
//			this.addFieldError("username", "username不能为空");
//			return INPUT;
//					
//		}
		
		System.out.println(p.getBookList().get(0).getUsername());
		System.out.println(p.getBookList().get(1).getUsername());
		
		return SUCCESS;
	}
//	public String getUsername() {
//		return username;
//	}
//	public void setUsername(String username) {
//		this.username = username;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
	
	@Override
	public people getModel() {
		// TODO Auto-generated method stub
		return p;
	}

	@Override
	public void validate() {

		if(p.getUsername().equals("")||p.getUsername()==null){
			this.addFieldError("username", "username不能为空");
								
		}
	}
	
}	
