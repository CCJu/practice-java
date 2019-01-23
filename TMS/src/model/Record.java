package model;

public class Record {
	private String snum;
	private String sname;
	private String cname;
	private double grade;
	private String Sdept;
	public String getSnum() {
		return snum;
	}
	public void setSnum(String snum) {
		this.snum = snum;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public double getGrade() {
		return grade;
	}
	public void setGrade(double grade) {
		this.grade = grade;
	}
	public String getSdept() {
		return Sdept;
	}
	public void setSdept(String sdept) {
		Sdept = sdept;
	}
	
	public String toString() {
		return "Record [snum=" + snum + ", sname=" + sname + ", cname=" + cname + ", grade=" + grade + ", Sdept="
				+ Sdept + "]";
	}
	
	
}
