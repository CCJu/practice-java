package 学生选课系统;
import java.util.*;
public class Main {
	static Set<Student> stu=new HashSet<Student>();
	public static void Menu(){
		Scanner input=new Scanner(System.in);
		Course.addCourseList();
		System.out.println("请输入学生的ID：");
		String str1=input.next();
		System.out.println("请输入学生的姓名：");
		String str2=input.next();
		Student s1=new Student(str1,str2);
		stu.add(s1);
		System.out.println("欢迎学生  "+s1.getName()+" 选课！！" );
		System.out.println("--------------------------------------------");
		System.out.println("待选课程：");
		Course.showList();
		s1.addCourse();
		s1.show();
		input.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Menu();
			
	}

}
