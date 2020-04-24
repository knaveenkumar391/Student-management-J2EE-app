package com.pst.sms.dblogic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class example {

	public static void main(String[] args) {
		try{  
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  
			//step2 create  the connection object  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:xe","system","system");  
			  
			//step3 create the statement object  
			Statement stmt=con.createStatement();  
			  
			//step4 execute query 
			int update=stmt.executeUpdate("insert into Student10 values(2,'Akashkulkarni','male','java')");
			System.out.println(update+"Row Inserted");
			  
			//step5 close the connection object  
			con.close();  
			  
			}catch(Exception e){ System.out.println(e);}  
			  
			}  
			

	}


