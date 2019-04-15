import java.util.ArrayList;

public class Student implements Comparable<Student>{
	private String year;
	private String name;
	private String sex;
	private String num;
	private String grade;
	static ArrayList<Student> al=new ArrayList<Student>();
	Student(String stuGrade,String stuClass,String stuId,String stuName){
		this.year=stuClass;
		this.grade=stuGrade;
		this.name=stuName;
		this.num=stuId;
	}
	public int compareTo(Student o){
		int  result;
		result=o.getYear().compareTo(this.grade);
		if(result==0) result=o.getGrade().compareTo(this.grade);
		if(result==0) result=o.getNum().compareTo(this.num);
		return result;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
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
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
}
