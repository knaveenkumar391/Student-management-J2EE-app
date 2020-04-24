package com.pst.sms.services;

import java.sql.ResultSet;
import java.util.ArrayList;

import com.pst.sms.dblogic.DB_logic;
import com.pst.sms.studentVo.StudentVo;

public class Student_business_logic {
	public void saveStudent(StudentVo svo)
	{
		DB_logic db=new DB_logic();
		db.connect_to_db(svo);
		
			
	}
	public ArrayList retrive()
	{
		DB_logic db=new DB_logic();
		ArrayList x=db.Retrive_data_from_db();
		
		return x;
		
	}

	
	
	
	

}
