package dao;

import java.sql.*;
public class db_operation {
	//从数据库获取连接
	public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/db_bookstoreonline";
        return DriverManager.getConnection(url, "root", "sjl935166424");
    }
}
