package Service;

import java.util.ArrayList;

import dao.StudentDao;
import model.Student;

public class StudentManageService {
	
	public ArrayList<Student> queryForPage(Student stu){
		StudentDao sd=new StudentDao();
		return sd.queryForPage(stu);
	}
	
	public String add(Student stu) {
		if(stu.getSno()==null||"".equals(stu.getSno()))
			return "false";
		StudentDao sd=new StudentDao();
		if(sd.exists(stu))
			return "exists";
		return sd.add(stu)+"";
	}
	
	public Student update(Student stu){
		StudentDao sd=new StudentDao();
		if(stu.getBirthdate()==null||"".equals(stu.getBirthdate())) {
			return sd.queryForClass(stu);
		}else {
			sd.update(stu);
			return null;
		}
	}
	
	public boolean delete(Student stu){
		StudentDao sd=new StudentDao();
		return sd.delete(stu);
	}
}
