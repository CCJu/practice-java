package 用户信息;

public class UnserInfo {
	private String unsername;
	private String password;
	public String getUnsername() {
		return unsername;
	}
	public void setUnsername(String unsername) {
		this.unsername = unsername;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((unsername == null) ? 0 : unsername.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UnserInfo other = (UnserInfo) obj;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (unsername == null) {
			if (other.unsername != null)
				return false;
		} else if (!unsername.equals(other.unsername))
			return false;
		return true;
	}
	
}
