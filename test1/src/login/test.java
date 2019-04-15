package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class test {
	
	public static void lok() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/xiaolian";
        Connection con =DriverManager.getConnection(url, "root", "sjl935166424");
		Statement st=con.createStatement();
		String sql="select * from sys_user where userName='luke'";
		ResultSet rs=st.executeQuery(sql);
		while(rs.next())
			System.out.println(rs.getString("password"));
	}
	public static void main(String args[]) {
		try {
			lok();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
