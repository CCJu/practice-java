package Service;

import java.util.ArrayList;

import dao.CourseDao;
import model.Course;

public class CourseManageService {
	public ArrayList<Course> queryForPage(Course cou){
		CourseDao cd=new CourseDao();
		return cd.queryForPage(cou);
	}
	
	public boolean add(Course cou) {
		CourseDao cd=new CourseDao();
		if(cd.exists(cou))
			return false;
		else {
			if(cou.getCno()!=null&&!"".equals(cou.getCno()))
				return cd.add(cou);
			else return false;
		}
	}
	public Course queryForClass(Course cou){
		CourseDao cd=new CourseDao();
		return cd.queryForClass(cou);
	}
	
	public boolean update(Course cou){
		CourseDao cd=new CourseDao();
		return cd.update(cou);
	}
	
	public boolean delete(Course cou){
		CourseDao cd=new CourseDao();
		return cd.delete(cou);
	}
}
