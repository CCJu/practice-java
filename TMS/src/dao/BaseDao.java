package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class BaseDao {
	public Connection getCon() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/helloworld?useUnicode=true&characterEncoding=UTF-8";
        return DriverManager.getConnection(url, "root", "sjl935166424");
	}
}
