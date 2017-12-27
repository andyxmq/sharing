package com.sharing.test;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
 
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
 
public class MBGTest {
 
	public static void main(String args[])  
    {  
          
            String url = "jdbc:mysql://localhost/sharing?autoReconnect=true&useSSL=true";  
            String driver = "com.mysql.jdbc.Driver";  
            try{  
                Class.forName(driver);  
            }catch(Exception e){  
                System.out.println("无法加载驱动");  
            }  
              
    try {  
            Connection con = DriverManager.getConnection(url,"root","123456");  
            if(!con.isClosed())  
                System.out.println("success");  
        } catch (Exception e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }  
    }  

 
}
