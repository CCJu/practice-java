package model;

public class user {
	private String user_name;
	private String user_id;
	private String user_password;
	private int user_balance;
	private boolean user_isVip;
	public int getUser_balance() {
		return user_balance;
	}
	public void setUser_balance(int user_balance) {
		this.user_balance = user_balance;
	}
	// 支付账号，收货地址。。等
	public boolean isUser_isVip() {
		return user_isVip;
	}
	public void setUser_isVip(boolean user_isVip) {
		this.user_isVip = user_isVip;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	
}
