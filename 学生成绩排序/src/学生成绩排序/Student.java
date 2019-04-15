package 学生成绩排序;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Student {
	private String name;
	private String id;
	private double []score;
	private double average;
	static List <Student> stu=new  ArrayList<Student>();
	Student(String id,String name,double []a){
		this.id=id;
		this.name=name;
		score=new double[3];
		score=Arrays.copyOf(a, score.length);
		toAverage();
	}
	Student(String id,String name){
		this.id=id;
		this.name=name;
	}
	public void toAverage()
	{
		double s=0;
		for(double n:score)
			s+=n;
		this.average =s/score.length;
	}
	public static void sortByAverage(){
		for(int i=0;i<stu.size();i++)
			for(int n=i+1;n<stu.size();n++){
				Student m;
				if(stu.get(n).average<stu.get(i).average){
					m=stu.get(i);
					stu.set(i,stu.get(n));
					stu.set(n, m);
				}
			}		
			
			
	}
	public static void show(){
		for(Student st:stu){
			System.out.println("学生ID："+st.id+"  学生姓名："+st.name );
			for(double n:st.score )
				System.out.print("成绩："+n+" ");
			System.out.println("平均成绩："+st.average );
			System.out.println("******************************************");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void check(){
		System.out.println("请输入学生姓名： ");
		Scanner in=new Scanner(System.in);
		String name=in.next();
		Student s=new Student("",name);
		if(stu.contains(s))
			show();
		else
			System.out.println("不存在该对象");
			
	}
	/**
	 * 
	 * public int hashCode(){
	 * 		final int prime=31;
	 * 		int result=1;
	 * 		result=prime*result+((name==null)?0:name.hashCode());
	 * }
	 */
	public boolean equals(Object obj){
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(!(obj instanceof Student ))
			return false;
		Student other=(Student)obj;
		if(this.name==null){
			if(other.name==null)
				return true;
			else 
				return false;
		}else{
			if(this.name.equals(other.name))
				return true;
			else
				return false;
		}
	}
}
