package dao;

import java.sql.*;

public class db_deleOperation extends db_operation{
	synchronized public boolean deleTableMessages(String []id,String tableName){
		try{
			Connection con=getConnection();
			Statement st=con.createStatement();
			String sql=null;
			if(tableName.equals("bsol_user"))
				sql="delete from "+tableName+" where user_id=\"";
			else
				sql="delete from "+tableName+" where book_id=\"";
			String sql1=sql;
			for(int i=0;i<id.length;i++){
				sql=sql1;
				sql+=id[i]+"\"";
				st.executeUpdate(sql);
			}
			con.close();
			return true;
		}catch(Exception e){
			return false;
		}
	}
}
