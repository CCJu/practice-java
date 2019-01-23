package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.Course;

public class CourseDao extends BaseDao {
	
	public ArrayList<Course> queryForPage(Course cou){
		try{
			ArrayList<Course> al=new ArrayList<Course>();
			Connection con= getCon();
			Statement st=con.createStatement();
			StringBuffer sql=new StringBuffer();
			sql.append("select * from Course where cnum like "
						+ "\""+(cou.getCno()==null?"%%":(cou.getCno())+"%")+"\" and name like "
						+ "\""+(cou.getCname()==null?"%%":(cou.getCname())+"%")+"\"");
			ResultSet rs=st.executeQuery(sql.toString());
			while(rs.next()) {
				Course c=new Course();
				c.setCno(rs.getString(1));
				c.setCname(rs.getString(2));
				c.setTimelength(rs.getInt(3));
				c.setCredits(rs.getInt(4));
				al.add(c);
			}
			return al;
		}catch(Exception e){
			return null;
		}
	}
	
	synchronized public boolean add(Course cou) {
		try{
			Connection con=getCon();
			Statement st=con.createStatement();
			StringBuffer sql=new StringBuffer();
			sql.append("INSERT INTO Course (cnum,name,timelength,credits) values(\""
			+cou.getCno()+"\",\""+cou.getCname()+"\",\""+cou.getTimelength()+"\",\""+cou.getCredits()+"\""+")");
			st.executeUpdate(sql.toString());
			//con.close();
			return true;
		}catch(Exception e){
			return false;
		}
	}
	
	public boolean exists(Course cou) {
		try{
			Connection con=getCon();
			Statement st=con.createStatement();
			StringBuffer sql=new StringBuffer();
			sql.append("select * from Course where cnum=\""+cou.getCno()+"\"");
			ResultSet rs=st.executeQuery(sql.toString());
			if(rs.next()) //已存在
				return true;
			else //不存在
				return false;
			
		}catch(Exception e){
			return false;
		}
	}
	
	public Course queryForClass(Course cou){
		try{
			Connection con= getCon();
			Statement st=con.createStatement();
			StringBuffer sql=new StringBuffer();
			sql.append("select * from Course where cnum = \""+cou.getCno()+"\"");
			ResultSet rs=st.executeQuery(sql.toString());
			Course c=new Course();
			while(rs.next()) {
				c.setCno(rs.getString(1));
				c.setCname(rs.getString(2));
				c.setTimelength(rs.getInt(3));
				c.setCredits(rs.getInt(4));
			}
			return c;
		}catch(Exception e){
			return null;
		}
	}
	
	public boolean update(Course cou){
		try{
			Connection con= getCon();
			Statement st=con.createStatement();
			StringBuffer sql=new StringBuffer();
			sql.append("update Course set name=\""+cou.getCname()+"\",timelength=\""+cou.getTimelength()+"\",credits=\""+cou.getCredits()+"\" where cnum = \""+cou.getCno()+"\"");
			st.executeUpdate(sql.toString());
			return true;
		}catch(Exception e){
			return false;
		}
	}
	
	public boolean delete(Course cou){
		try{
			Connection con= getCon();
			Statement st=con.createStatement();
			StringBuffer sql=new StringBuffer();
			sql.append("delete from Course where cnum = \""+cou.getCno()+"\"");
			st.executeUpdate(sql.toString());
			return true;
		}catch(Exception e){
			return false;
		}
	}
}
