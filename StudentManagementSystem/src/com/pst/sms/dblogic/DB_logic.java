package com.pst.sms.dblogic;


import java.sql.*;
import java.util.ArrayList;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;


import com.pst.sms.studentVo.StudentVo;

public class DB_logic {
	public   void connect_to_db(StudentVo dbvo) {
		ResultSet rs=null;
		
		  ArrayList ar=new ArrayList();
		{
			System.out.println(dbvo.getRollno());
			int x=dbvo.getRollno();
			System.out.println(dbvo.getName());
			String y=dbvo.getName();
			System.out.println(dbvo.getGender());
			String z=dbvo.getGender();
			System.out.println(dbvo.getCourse());
			String a=dbvo.getCourse();
			
			
			
			try{  
				//step1 load the driver class  
				Class.forName("oracle.jdbc.driver.OracleDriver");  
				  
				//step2 create  the connection object  
				Connection con=DriverManager.getConnection(  
				"jdbc:oracle:thin:@localhost:1521:xe","system","system");  
				  
				//step3 create the statement object  
				Statement stmt=con.createStatement();  
				  
				//step4 execute query 
				int update=stmt.executeUpdate(String.format("insert into Student10 values(%d,'%s','%s','%s')",x,y,z,a));
				System.out.println(update+"Row Inserted");
				
	
				//step5 close the connection object  
				con.close();  
				  
				}catch(Exception e){ System.out.println(e);}  
				  
				}
		  
		
	
	}
	public ArrayList Retrive_data_from_db()
	{
		ResultSet rs=null;
	
		ArrayList ar=new ArrayList();
		StudentDTO dto=new StudentDTO();
		
		try{  
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			  
			//step2 create  the connection object  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:xe","system","system");  
			  
			//step3 create the statement object  
			Statement stmt=con.createStatement();  
			  
	
			// resending all the data to front end 
			 rs=stmt.executeQuery("select * from Student10");  
			while(rs.next()) 
			{	
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4)); 
				ar.add(rs.getInt(1));
				ar.add(rs.getString(2));
				ar.add(rs.getString(3));
				ar.add(rs.getString(4));
			
			}

			//step5 close the connection object  
			con.close();  
			  
			}catch(Exception e){ System.out.println(e);}  
			 
		return ar;
		
		
			}
	
		
	}
	
	
