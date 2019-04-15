import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student implements Comparable<Student>{
	public String stuGrade;
	public String stuClass;
	public String stuId;
	public String stuName;
	static List <Student> stuList=new ArrayList<Student>();
	Student(String stuGrade,String stuClass,String stuId,String stuName){
		this.stuClass=stuClass;
		this.stuGrade=stuGrade;
		this.stuName=stuName;
		this.stuId=stuId;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		int result;
		result=this.stuGrade.compareTo(o.stuGrade);
		if(result==0) result=this.stuClass.compareTo(o.stuClass);
		if(result==0) result=this.stuId.compareTo(o.stuId);
		return result;
	}
	public static void show(){
		Iterator<Student> it=stuList.iterator();
		while(it.hasNext()){
			Student s=it.next();
			System.out.println("年级："+s.stuGrade+" 班级："+s.stuClass+" 学号："+s.stuId+" 姓名："+s.stuName);
		}
	}
	
	
}
