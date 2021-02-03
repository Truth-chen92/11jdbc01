package cn.tedu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo02 {
    public static void main(String[] args) throws Exception {
        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb3?characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai&rewriteBatchedStatements=true","root","truth");
        Statement s=conn.createStatement();
        s.execute("drop table jdbct1");
        s.close();
    }

}
