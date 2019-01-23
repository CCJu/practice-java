package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.Grade;
import model.Record;

public class GradeDao extends BaseDao {
	
	public ArrayList<Record> queryForPage(Record rec){
		try{
			ArrayList<Record> al=new ArrayList<Record>();
			Connection con= getCon();
			Statement st=con.createStatement();
			StringBuffer sql=new StringBuffer();
			sql.append("select Student.snum,Student.name,Course.name,SC.grade,Student.Sdept from Student,Course,SC where Student.snum like "
						+ "\""+(rec.getSnum()==null?"%%":(rec.getSnum())+"%")+"\" and Student.name like "
						+ "\""+(rec.getSname()==null?"%%":(rec.getSname())+"%")+"\" and Course.name like "
						+ "\""+(rec.getCname()==null?"%%":(rec.getCname())+"%")+"\" and Student.Sdept like "
						+ "\""+(rec.getSdept()==null?"%%":(rec.getSdept())+"%")+"\" and Student.snum=SC.snum and Course.cnum=SC.cnum ");
			ResultSet rs=st.executeQuery(sql.toString());
			while(rs.next()) {
				Record r=new Record();
				r.setSnum(rs.getString(1));
				r.setSname(rs.getString(2));
				r.setCname(rs.getString(3));
				r.setGrade(rs.getDouble(4));
				r.setSdept(rs.getString(5));
				al.add(r);
			}
			//con.close();
			return al;
		}catch(Exception e){
			return null;
		}
	}
	
	synchronized public boolean add(Grade gra) {
		try{
			Connection con=getCon();
			Statement st=con.createStatement();
			StringBuffer sql=new StringBuffer();
			sql.append("INSERT INTO SC (snum,cnum,grade) values(\""
			+gra.getSno()+"\",\""+gra.getCno()+"\",\""+gra.getResult()+"\""+")");
			st.executeUpdate(sql.toString());
			//con.close();
			return true;
		}catch(Exception e){
			return false;
		}
	}
	
	public boolean exists(Grade gra) {
		try{
			Connection con=getCon();
			Statement st=con.createStatement();
			StringBuffer sql=new StringBuffer();
			sql.append("select * from SC where snum=\""+gra.getSno()+"\" and cnum=\""+gra.getCno()+"\"");
			ResultSet rs=st.executeQuery(sql.toString());
			if(rs.next()) //已存在
				return true;
			else //不存在
				return false;
			
		}catch(Exception e){
			return false;
		}
	}
	
	public boolean stuExists(Grade gra) {
		try{
			Connection con=getCon();
			Statement st=con.createStatement();
			StringBuffer sql=new StringBuffer();
			sql.append("select snum,name from Student where snum=\""+gra.getSno()+"\"");
			ResultSet rs=st.executeQuery(sql.toString());
			if(rs.next()) //已存在
				return true;
			else //不存在
				return false;
			
		}catch(Exception e){
			return false;
		}
	}
	
	public boolean couExists(Grade gra) {
		try{
			Connection con=getCon();
			Statement st=con.createStatement();
			StringBuffer sql=new StringBuffer();
			sql.append("select cnum,name from Course where cnum=\""+gra.getCno()+"\"");
			ResultSet rs=st.executeQuery(sql.toString());
			if(rs.next()) //已存在
				return true;
			else //不存在
				return false;
			
		}catch(Exception e){
			return false;
		}
	}
	
	public Record queryForClass(Record rec){
		try{
			Connection con= getCon();
			Statement st=con.createStatement();
			StringBuffer sql=new StringBuffer();
			sql.append("select Student.snum,Student.name,Course.name,SC.grade,Student.Sdept from Student,Course,SC where Student.snum ="
					+ "\""+rec.getSnum()+"\" and Course.name ="
					+ "\""+rec.getCname()+"\" and Student.snum=SC.snum and Course.cnum=SC.cnum ");
			ResultSet rs=st.executeQuery(sql.toString());
			Record r=new Record();
			while(rs.next()) {
				r.setSnum(rs.getString(1));
				r.setSname(rs.getString(2));
				r.setCname(rs.getString(3));
				r.setGrade(rs.getDouble(4));
				r.setSdept(rs.getString(5));
			}
			return r;
		}catch(Exception e){
			return null;
		}
	}
	
	public boolean update(Record rec){
		try{
			Connection con= getCon();
			Statement st=con.createStatement();
			StringBuffer sql=new StringBuffer();
			sql.append("update SC set grade=\""+rec.getGrade()+"\" where snum = \""+rec.getSnum()+"\"and cnum=(select cnum from Course where Course.name=\""+rec.getCname()+"\")");
			st.executeUpdate(sql.toString());
			return true;
		}catch(Exception e){
			return false;
		}
	}
	
	public boolean delete(Record rec){
		try{
			Connection con= getCon();
			Statement st=con.createStatement();
			StringBuffer sql=new StringBuffer();
			sql.append("delete from SC where snum = \""+rec.getSnum()+"\" and cnum=(select cnum from Course where Course.name=\""+rec.getCname()+"\")");
			st.executeUpdate(sql.toString());
			return true;
		}catch(Exception e){
			return false;
		}
	}
}
