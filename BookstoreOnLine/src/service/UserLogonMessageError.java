package service;

public class UserLogonMessageError extends error {
	public boolean isNull(String str){
		if(str==null)
			str="";
		if(str.equals(""))
			return true;
		else
			return false;
	}
	public boolean emailIsQualified(String email){
		if(email.length()>12&&email.length()<20)
			if(email.endsWith("@qq.com")) return true;
			else return false;
		else 
			return false;
	}
	public boolean nameIsQualified(String name){
		if(name.length()>0&&name.length()<10)
			return true;
		else return false;
	}
	public String getPasswordErrorMessage(String password,String password1){
		String error=null;
		if(password!=null&&password1!=null){
			if(!password.equals(password1))
				error="password don't match";
			else{ 
				if(password.length()<8)
					error="Invalid format";
				else;
			}
		}
		else
			error="null";
		return error;
	}
	public String getErrorMessage(String str,boolean isEmail){
		String error=null;
		if(isNull(str))
			error="null";
		else{ 
			if(isEmail)
				if(!emailIsQualified(str))
					error="Invalid format";
				else;
			else 
				if(!nameIsQualified(str))
					error="Invalid format";
				else;
		}
		return error;		
	}
}
