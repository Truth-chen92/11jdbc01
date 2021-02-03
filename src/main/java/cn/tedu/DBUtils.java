package cn.tedu;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtils {
//    获取连接的代码封装到此方法中
    public static Connection getConn() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb3?characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai&rewriteBatchedStatements=true","root","truth");
        return conn;
    }
}
