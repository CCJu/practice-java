package model;

import java.util.List;

public class Student {
	private String sno;
	private String sname;
	private String sex;
	private String birthdate;
	private String sdept;
	private List<Course> selectCourse;
	private List<Grade> sgrade;
	public String toString() {
		return sno+" "+sname+" "+sex+" "+birthdate+" "+sdept;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
	public String getSdept() {
		return sdept;
	}
	public void setSdept(String sdept) {
		this.sdept = sdept;
	}
	public List<Course> getSelectCourse() {
		return selectCourse;
	}
	public void setSelectCourse(List<Course> selectCourse) {
		this.selectCourse = selectCourse;
	}
	public List<Grade> getSgrade() {
		return sgrade;
	}
	public void setSgrade(List<Grade> sgrade) {
		this.sgrade = sgrade;
	}
	
}
