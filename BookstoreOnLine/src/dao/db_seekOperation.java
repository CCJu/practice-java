package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Iterator;
import java.util.Vector;

import model.book;
import model.user;

public class db_seekOperation extends db_operation{
	//判断用户的密码和id是否在数据库中保存（即核对用户信息，判断密码是否正确）
	public boolean UserExists(String id ,String password)throws Exception{
		Connection con=getConnection();
		Statement st=con.createStatement();
		String sql="select * from bsol_user where user_id=\""+id+"\" and user_password=\""+password+"\"";
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()){
			con.close();
			return true;
		}
		con.close();
		return false;
	}
	public boolean AdministratorExists(String id ,String password)throws Exception{
		Connection con=getConnection();
		Statement st=con.createStatement();
		String sql="select * from bsol_administrator where administrator_id=\""+id+"\" and administrator_password=\""+password+"\"";
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()){
			con.close();
			return true;
		}
		con.close();
		return false;
	}
	//判断该id是否在数据库中存在（即判断该ID是否被占用）
	public boolean UserExists(String id)throws Exception{
		Connection con=db_operation.getConnection();
		Statement st=con.createStatement();
		String sql="select * from bsol_user where user_id=\""+id+"\"";
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()){
			con.close();
			return true;
		}
		con.close();
		return false;
	}
	//根据书的id返回该书的所有信息组成的数组
	public String[] getBookMessages(String id){
		String mess[] = null;
		try{
		Connection con=db_operation.getConnection();
		Statement st=con.createStatement();
		String sql="select * from bsol_book where book_id=\""+id+"\"";
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()){
			mess=new String[6];
			for(int i=0;i<6;i++)
				mess[i]=rs.getString(i+1);
		}
		con.close();
		}catch(Exception e){
			return mess;
		}
		return mess;
	}
	//根据书的类型在数据库中查询数据，直接返回ResultSet结果集
	public ResultSet getBooklist(String bookType){
		ResultSet booklist=null;
		try{
		Connection con=db_operation.getConnection();
		Statement st=con.createStatement();
		String sql="select * from bsol_book where book_type=\""+bookType+"\"";
		booklist=st.executeQuery(sql);
		}catch(Exception e){
			return booklist;
		}
		return booklist;
	}
	//在当前用户下查询，返回所有书籍id构成的数组
	public String[] getOwnBooklist(String userId){
		String booklist[]=null;
		try{
		Connection con=db_operation.getConnection();
		Statement st=con.createStatement();
		String sql="select * from bsol_buyBookList where user_id=\""+userId+"\"";
		ResultSet b=st.executeQuery(sql);
		if(b.next())
			booklist=b.getString(2).split("#");
		con.close();
		}catch(Exception e){
			return booklist;
		}
		return booklist;
	}
	//返回用户账户上剩余的星辰（用于购买书籍）数目
	public int getUserBalance(String user_id){
		int i=0;
		try{
		Connection con=getConnection();
		Statement st=con.createStatement();
		String sql="select * from bsol_user where user_id=\""+user_id+"\"";
		ResultSet rs=st.executeQuery(sql);
		if(rs.next())
			i=rs.getInt(4);
		con.close();
		return i;
		}catch(Exception e){
			return i;
		}
	}
	//返回该书籍价值多少星辰
	public int getBookPrice(String book_id){
		int i=0;
		try{
		Connection con=getConnection();
		Statement st=con.createStatement();
		String sql="select * from bsol_book where book_id=\""+book_id+"\"";
		ResultSet rs=st.executeQuery(sql);
		if(rs.next())
			i=(int)rs.getDouble(3);
		con.close();
		return i;
		}catch(Exception e){
			return i;
		}
	}
	public String getOwnBuyBookNum(String user_id){
		String num=null;
		try{
		Connection con=getConnection();
		Statement st=con.createStatement();
		String sql="select * from bsol_buyBookList where user_id=\""+user_id+"\"";
		ResultSet rs=st.executeQuery(sql);
		if(rs.next())
			num=rs.getString(2);
		return num;
		}catch(Exception e){
			return num;
		}		
	}
	//判断该用户是否购买了书籍
	public boolean isBuyBookNumEmpty(String user_id){
		try{
		Connection con=getConnection();
		Statement st=con.createStatement();
		String sql="select * from bsol_buyBookList where user_id=\""+user_id+"\"and book_num=\""+""+"\"";
		ResultSet rs=st.executeQuery(sql);
		if(rs.next()){
			con.close();
			return true;
		}
		else{
			con.close();
			return false;
		}
		}catch(Exception e){
			return false;
		}
	}
	public Vector<book> getAllBookList(){
		Vector<book> v=null;
		try{
			v=new Vector<book>();
			Connection con=getConnection();
			Statement st=con.createStatement();
			String sql="select * from bsol_book";
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				book b=new book();
				b.setBook_id(rs.getString(1));
				b.setBook_name(rs.getString(2));
				b.setBook_author(rs.getString(5));
				b.setBook_price(rs.getDouble(3));
				b.setBook_type(rs.getString(7));
				v.addElement(b);
			}
			return v;
		}catch(Exception e){
			return v;
		}
	}
	public Vector<user> getAllUserList(){
		Vector<user> v=null;
		try{
			v=new Vector<user>();
			Connection con=getConnection();
			Statement st=con.createStatement();
			String sql="select * from bsol_user";
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
				user u=new user();
				u.setUser_id(rs.getString(1));
				u.setUser_name(rs.getString(2));
				if(rs.getInt(5)==0)
					u.setUser_isVip(false);
				else
					u.setUser_isVip(true);
				u.setUser_balance(rs.getInt(4));
				v.addElement(u);
			}
			return v;
		}catch(Exception e){
			return v;
		}
	}
	public Vector<String> getAdviceBookNumVector(){
		Vector<String> v=null;
		String id=null;
		try{
			v=new Vector<String>();
			Connection con=getConnection();
			Statement st=con.createStatement();
			String sql="select *from bsol_advicebook";
			ResultSet rs =st.executeQuery(sql);
			while(rs.next()){
				id=rs.getString(1);
				v.addElement(id);
			}
			return v;
		}catch(Exception e){
			return v;
		}
	}
	public Vector<book> getAdviceBookMessageVector(Vector<String> bookNum){
		Vector<book> v=null;
		try{
			v=new Vector<book>();
			Iterator<String> it=bookNum.iterator();
			Connection con=getConnection();
			Statement st=con.createStatement();
			String sql;	
			while(it.hasNext()){
				sql="select *from bsol_book where book_id=\""+it.next()+"\"";
				ResultSet rs=st.executeQuery(sql);
				if(rs.next()){
					book b=new book();
					b.setBook_id(rs.getString(1));
					b.setBook_image(rs.getString(4));
					b.setBook_name(rs.getString(2));
					b.setBook_author(rs.getString(5));
					b.setBook_price(rs.getDouble(3));
					b.setBook_type(rs.getString(7));
					v.addElement(b);
				}else
					continue;
			}
			return v;
		}catch(Exception e){
			return v;
		}
	}
}
