package cn.tedu;

import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo04 {
    @Test
    public void findAll(){
        try (Connection conn = DBUtils.getConn()){
            Statement s=conn.createStatement();
            //如果这里不是*那下面的数字就是这里的顺序
            ResultSet rs=s.executeQuery("select * from emp");
            while (rs.next()){
                //如果上面是* 数字就是表里的顺序
                String name=rs.getString(5);
                System.out.println(name);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
