package dao;

import java.sql.*;
public class db_addOperation extends db_operation{
	//将一个新的用户的所有信息插入数据库中保存起来
	synchronized public boolean saveUserMessages(String name,String id,String password){
		try{
		Connection con= getConnection();
		Statement st=con.createStatement();
		String sql="insert into bsol_user values(\""+id+"\",\""+name+"\",\""+password+"\","+"50,0)";
		st.executeUpdate(sql);
		con.close();
		return true;
		}catch(Exception e){
			return false;
		}
	}
	synchronized public boolean saveBuyBookNum(String user_id,String book_id){
		try{
		Connection con=getConnection();
		Statement st=con.createStatement();
		db_seekOperation dbso=new db_seekOperation();
		int bookPrice=dbso.getBookPrice(book_id);
		int userBalance=dbso.getUserBalance(user_id);
		if(bookPrice<=userBalance){
			String sql=null;
			if(dbso.isBuyBookNumEmpty(user_id))
				sql="update bsol_buyBookList set book_num=\""+book_id+"\"";
			else
				sql="update bsol_buyBookList set book_num=\""+dbso.getOwnBuyBookNum(user_id)+"#"+book_id+"\"";
			String sql1="UPDATE `bsol_user` SET `user_balance`=\""+(userBalance-bookPrice)+"\" WHERE `user_id`=\""+user_id+"\"";
			st.executeUpdate(sql);
			st.executeUpdate(sql1);
		}else
			return false;
		con.close();
		return true;
		}catch(Exception e){
			return false;
		}
	}
}
