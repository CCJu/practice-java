package Service;

import java.util.ArrayList;
import java.util.HashMap;


import dao.GradeDao;
import model.Grade;
import model.Record;

public class GradeManageService {
	
	public ArrayList<Record> queryForPage(Record rec){
		GradeDao gd=new GradeDao();
		return gd.queryForPage(rec);
	}
	
	public HashMap<String, String> add(Grade gra) {
		GradeDao gd=new GradeDao();
		StringBuffer s=new StringBuffer("");
		if(!gd.stuExists(gra)) s.append("学生不存在:");
		else s.append(":");
		if(!gd.couExists(gra)) s.append("学科不存在: ");
		else s.append(": ");
		if(gd.exists(gra)) s.append("该科成绩已添加");
		if(s.toString().equals(":: ")) {
			gd.add(gra);
			return null;
		}
		String args[]=s.toString().split(":");
		HashMap<String, String> hm=new HashMap<String, String>();
		hm.put("stuerror", args[0]);
		hm.put("couerror", args[1]);
		hm.put("graerror", args[2]);
		return hm;
	}
	
	public Record queryForClass(Record rec){
		GradeDao gd=new GradeDao();
		return gd.queryForClass(rec);
	}
	
	
	public boolean update(Record rec){
		GradeDao gd=new GradeDao();
		return gd.update(rec);
	}
	
	public boolean delete(Record rec){
		GradeDao gd=new GradeDao();
		return gd.delete(rec);
	}
}
