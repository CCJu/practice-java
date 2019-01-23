package model;

public class Course {
	private String cno;
	private String cname;
	private int timelength;
	private int credits;
	public String getCno() {
		return cno;
	}
	public void setCno(String cno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getTimelength() {
		return timelength;
	}
	public void setTimelength(int timelength) {
		this.timelength = timelength;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public String toString() {
		return "Course [cno=" + cno + ", cname=" + cname + ", timelength=" + timelength + ", credits=" + credits + "]";
	}
	
}
