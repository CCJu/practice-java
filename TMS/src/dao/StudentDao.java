package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.Student;

public class StudentDao extends BaseDao {
	
	public ArrayList<Student> queryForPage(Student stu){
		try{
			ArrayList<Student> al=new ArrayList<Student>();
			Connection con= getCon();
			Statement st=con.createStatement();
			StringBuffer sql=new StringBuffer();
			sql.append("select * from Student where snum like "
						+ "\""+(stu.getSno()==null?"%%":(stu.getSno())+"%")+"\" and name like "
						+ "\""+(stu.getSname()==null?"%%":(stu.getSname())+"%")+"\"");
			ResultSet rs=st.executeQuery(sql.toString());
			while(rs.next()) {
				Student s=new Student();
				s.setSno(rs.getString(1));
				s.setSname(rs.getString(2));
				s.setSex(rs.getString(3));
				s.setBirthdate(rs.getString(4));
				s.setSdept(rs.getString(6));
				al.add(s);
			}
			//con.close();
			return al;
		}catch(Exception e){
			return null;
		}
	}
	
	synchronized public boolean add(Student stu) {
		try{
			Connection con=getCon();
			Statement st=con.createStatement();
			StringBuffer sql=new StringBuffer();
			sql.append("INSERT INTO Student (snum,name,sex,birthdate,Sdept) values(\""
			+stu.getSno()+"\",\""+stu.getSname()+"\",\""+stu.getSex()+"\",\""+stu.getBirthdate()+"\",\""+stu.getSdept()+"\""+")");
			st.executeUpdate(sql.toString());
			//con.close();
			return true;
		}catch(Exception e){
			return false;
		}
	}
	
	public boolean exists(Student stu) {
		try{
			Connection con=getCon();
			Statement st=con.createStatement();
			StringBuffer sql=new StringBuffer();
			sql.append("select * from student where snum=\""+stu.getSno()+"\"");
			ResultSet rs=st.executeQuery(sql.toString());
			if(rs.next()) //已存在
				return true;
			else //不存在
				return false;
			
		}catch(Exception e){
			return false;
		}
	}
	
	public Student queryForClass(Student stu){
		try{
			Connection con= getCon();
			Statement st=con.createStatement();
			StringBuffer sql=new StringBuffer();
			sql.append("select * from Student where snum = \""+stu.getSno()+"\"");
			ResultSet rs=st.executeQuery(sql.toString());
			Student s=new Student();
			while(rs.next()) {
				s.setSno(rs.getString(1));
				s.setSname(rs.getString(2));
				s.setSex(rs.getString(3));
				s.setBirthdate(rs.getString(4));
				s.setSdept(rs.getString(6));
			}
			return s;
		}catch(Exception e){
			return null;
		}
	}
	
	public boolean update(Student stu){
		try{
			Connection con= getCon();
			Statement st=con.createStatement();
			StringBuffer sql=new StringBuffer();
			sql.append("update Student set name=\""+stu.getSname()+"\",sex=\""+stu.getSex()+"\",birthdate=\""+stu.getBirthdate()+"\",Sdept=\""+stu.getSdept()+"\" where snum = \""+stu.getSno()+"\"");
			st.executeUpdate(sql.toString());
			return true;
		}catch(Exception e){
			return false;
		}
	}
	
	public boolean delete(Student stu){
		try{
			Connection con= getCon();
			Statement st=con.createStatement();
			StringBuffer sql=new StringBuffer();
			sql.append("delete from Student where snum = \""+stu.getSno()+"\"");
			st.executeUpdate(sql.toString());
			return true;
		}catch(Exception e){
			return false;
		}
	}
}
