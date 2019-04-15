package 学生选课系统;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Course {
	private String courseName;
	static List<Course> courseList=new <Course> ArrayList();
	Course(String courseName){
		this.courseName =courseName;
	}
	static void addCourseList(){
		Course []str={new Course("java"),new Course("C#"),new Course("PHP"),new Course("HTML"),new Course("C"),new Course("C++")};
		Course.courseList.addAll(Arrays.asList(str));
	}
	static void showList(){
		int n=0;
		for(Course c:courseList){
			System.out.println(n+1+"."+c.getCourseName());
			n++;
		}
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
}
