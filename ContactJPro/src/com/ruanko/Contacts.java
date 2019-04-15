package com.ruanko;
import java.util.*;

public class Contacts {
	private String num;
	private String name;
	private String phoneNumber;
	private String emailAddress;
	private String address;
	private String sex;
	private String relationship;
	private static List<Contacts> contactsList=new ArrayList<Contacts>();
	/**
	 * 将字符串截取并转化为Contacts对象
	 * @param str
	 * @return Contacts对象
	 */
	static final Contacts strToContacts(String str){
		Contacts c=new Contacts();
		String []s=str.split("##");
		c.num=s[0];
		c.name=s[1];
		c.phoneNumber=s[2];
		c.emailAddress=s[3];
		c.address=s[4];
		c.sex=s[5];
		c.relationship=s[6];	
		return c;
	}
	/**
	 * 重写equals方法（只要联系人电话相同两个Contacts对象就相同）
	 */
	public boolean equals(Object obj){
		if(this==obj) 
			return true;
		if(obj==null)
			return false;
		if(!(obj instanceof Contacts))
			return false;
		Contacts other=(Contacts)obj;
		if(other.getPhoneNumber()==null)
			if(this.getPhoneNumber()==null)
				return true;
			else
				return false;
		else
			if(other.getPhoneNumber().equals(this.getPhoneNumber()))
				return true;
			else 
				return false;
	}
	public String toString(){
		String str=num+"##"+name+"##"+phoneNumber+"##"+emailAddress+"##"+address+"##"+sex+"##"+relationship;
		
		return str;
	}
	public static List<Contacts> getContactsList() {
		return contactsList;
	}
	public static void setContactsList(List<Contacts> contactsList) {
		Contacts.contactsList = contactsList;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
