package com.ruanko.bms.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
public class Customer {
	private String serialNum;
	private String name;
	private String sex;
	private String date;
	private String id;
	private String address;
	private String tel;
	private String emailAddress;
	private int credit;
	private Date createDate;
	private String information="";
	public Customer(String name, String sex, String date, String id, String address, String tel,
			String emailAddress) {
		this.serialNum = "";
		this.name = name;
		this.sex = sex;
		this.date = date;
		this.id = id;
		this.address = address;
		this.tel = tel;
		this.emailAddress = emailAddress;
		this.credit=100;
		createDate=new Date();
	}
	public boolean creat(){
		boolean a=false;
		if(!name.equals(""))
		if(!sex.equals(""))
		if(!date.equals(""))
		if(!id.equals(""))
		if(!address.equals(""))
		if(!tel.equals(""))
		if(!emailAddress.equals("")){
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			try {
				if(information.equals("")){
					sdf.parse(date);
					a=true;
					this.serialNum=this.generateSerialNum();
				}
			} catch (ParseException e) {
				information=" 格式错误！！！出生日期格式错误！！！";
			}	
		}								
		return a;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}
	public String generateSerialNum(){
		SimpleDateFormat myFmt=new SimpleDateFormat("yyyyMMddHHmmss");
		String str="A"+myFmt.format(new Date());
		Random random=new Random();
		for(int i=1;i<=5;i++)
			str+=random.nextInt(10);
		return str;
	}
	public String toString(){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		return serialNum+"##"+name+"##"+sex+"##"+date+"##"+id+"##"+address+
				"##"+tel+"##"+emailAddress+"##"+credit+"##"+sdf.format(createDate);
	}
	public String getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
}
