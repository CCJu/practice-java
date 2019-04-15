package Action;

import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String user_name;
	private String user_password;
	private String tip;
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String login() throws SQLException{
		if(getUser_name().equalsIgnoreCase("sql"))
			throw new java.sql.SQLException("用户不能为sql");
		if(getUser_name().equals("aaa")&&getUser_password().equals("bbb"))
		{	
			setTip("服务器提示：");
			return SUCCESS;
		}else 
			return ERROR;
	}
//	@Override
//	public String execute() throws Exception {
//		// TODO Auto-generated method stub
//		System.out.println("成功访问");
//		return SUCCESS;
//	}
	
}
