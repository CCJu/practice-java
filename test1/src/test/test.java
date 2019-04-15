package test;

import java.sql.*;

public class test {
	public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/db_bookstoreonline";
        return DriverManager.getConnection(url, "root", "sjl935166424");
    }
    public void insert() throws Exception {
        Connection con = getConnection();
        Statement stmt = con.createStatement();
        String sql = "insert into user values('zhangSan', '123')";
        stmt.executeUpdate(sql);
        System.out.println("插入成功！");
    }
    public void update() throws Exception {
        Connection con = getConnection();
        Statement stmt = con.createStatement();
        String sql = "update user set password='456' where username='zhangSan'";
        stmt.executeUpdate(sql);
        System.out.println("修改成功！");
    }
    public void delete() throws Exception {
        Connection con = getConnection();
        Statement stmt = con.createStatement();
        String sql = "delete from user where username='zhangSan'";
        stmt.executeUpdate(sql);
        System.out.println("删除成功！");
    }
    public void query() throws Exception {
        Connection con = getConnection();
        Statement stmt = con.createStatement();
        String sql = "select * from user";
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()) {
            String username = rs.getString(1);
            String password = rs.getString(2);
            System.out.println(username + ", " + password);
        }
    }
}
