package service;

public class UserLandMessageError extends error {
	public boolean isNull(String str){
		if(str==null)
			str="";
		if(str.equals(""))
			return true;
		else
			return false;
	}
	public boolean idIsQualified(String id){
		if(id.length()>12&&id.length()<20)
			if(id.endsWith("@qq.com")) return true;
			else return false;
		else 
			return false;
	}
	public boolean passwordIsQualified(String password){
		if(password.length()>7) return true;
		else return false;
	}
	public String getErrorMessage(String str,boolean isId){
		String error=null;
		if(isNull(str))
			error="null";
		else{ 
			if(isId)
				if(!idIsQualified(str))
					error="Invalid format";
				else;
			else 
				if(!passwordIsQualified(str))
					error="Invalid format";
				else;
		}
		return error;		
	}
}
