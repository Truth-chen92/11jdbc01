package cn.tedu;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo03 {
    @Before
    public void fn1() {
        System.out.println("Before 初始化相关代码");
    }

    @After
    public void fn2() {
        System.out.println("After 资源释放相关代码");
    }

    @Test
    public void test01() throws Exception {
        System.out.println("test01");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb3?characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai&rewriteBatchedStatements=true", "root", "truth");
        Statement s = conn.createStatement();
        String sql = "insert into dept values(10,'财务部','北京')";
        s.executeUpdate(sql);
        conn.close();
    }

    @Test
    public void test02() throws Exception {
        System.out.println("test02");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb3?characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai&rewriteBatchedStatements=true", "root", "truth");
        Statement s = conn.createStatement();
        String sql = "update dept set dname='研发部' where dname='财务部'";
        s.executeUpdate(sql);
        conn.close();
    }

    @Test
    public void test03() throws Exception {
        System.out.println("test03");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb3?characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai&rewriteBatchedStatements=true", "root", "truth");
        Statement s = conn.createStatement();
        String sql = "delete from dept where dname='研发部'";
        s.executeUpdate(sql);
        conn.close();
    }

    @Test
    public void test04() throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb3?characterEncoding=utf8&useSSL=false&serverTimezone=Asia/Shanghai&rewriteBatchedStatements=true", "root", "truth");
        Statement s = conn.createStatement();
        String sql = "select * from emp";
        ResultSet rs = s.executeQuery(sql);
        while(rs.next()){
            String name=rs.getString("ename");
            double sal=rs.getDouble("sal");
            System.out.println(name+sal);
        }
        conn.close();
    }
}
