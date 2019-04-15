package 学生选课系统;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
	private String name;
	private String id;
	private List <Course> ownCourse;
	Student(String id,String name){
		this.id =id;
		this.name=name;
		ownCourse=new <Course> ArrayList();
	}
	public void addCourse(){
		Scanner input=new Scanner(System.in);
		System.out.println("*********每人最多选择3门课程！！！***********");
		System.out.println("请输入待选课程列表中课程的序号来选择课程!!!!!!!");
		for(int i=0;i<=2;i++)
			while(true){
				System.out.print("课程：   ");
				int n=input.nextInt();
				if(n<=Course.courseList.size()){
					if(!ownCourse.contains(Course.courseList.get(n-1))){
						ownCourse.add(Course.courseList.get(n-1));
						break;
					}else{
						System.out.println("该课程已经选择过，不能重复选择！！");
						continue;
					}
				}else System.out.println("输入错误！！！！！！！");
			}
		
	}
	
	public void show(){
		for(Course n:ownCourse)
			System.out.println("成功添加课程："+n.getCourseName());
	}
	public List<Course> getOwnCourse() {
		return ownCourse;
	}
	public void setOwnCourse(List<Course> ownCourse) {
		this.ownCourse = ownCourse;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}
