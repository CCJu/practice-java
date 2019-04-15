package 通讯录;

public class Contact {
	private String num;
	private String name;
	private String phoneNumber;
	private String emailAddress;
	private String address;
	private String sex;
	private String relationship;
	/**
	 * 将成员变量连接为一个字符串返回
	 */
	public String toString(){
		String str=num+"##"+name+"##"+phoneNumber+"##"+emailAddress+"##"+address+"##"+sex+"##"+relationship;
		return str;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
}
