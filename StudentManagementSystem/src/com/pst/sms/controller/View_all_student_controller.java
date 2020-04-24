package com.pst.sms.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pst.sms.services.Student_business_logic;

@WebServlet("/View_all_student_controller")
public class View_all_student_controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
	         PrintWriter out = res.getWriter();  
	         res.setContentType("text/html");  
	         out.println("<html><body>");  
	         try 
	         {  
	             Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");  
	             Connection con = DriverManager.getConnection("jdbc:odbc:mydsn", "system", "pintu");  
	             // Here dsnname- mydsn,user id- system(for oracle 10g),password is pintu.  
	             Statement stmt = (Statement) con.createStatement();  
	             ResultSet rs = ((java.sql.Statement) stmt).executeQuery("select * from Student10");  
	             out.println("<table border=1 width=50% height=50%>");  
	             out.println("<tr><th>Rollno</th><th>Name</th><th>Gender</th><th>Course</th><tr>");  
	             while (rs.next()) 
	             {  
	                 int n = rs.getInt("Rollno");  
	                 String nm = rs.getString("Name");  
	                 String s = rs.getString("Gender");
	                 String k=rs.getString("Course");
	                 out.println("<tr><td>" + n + "</td><td>" + nm + "</td><td>" + s + "</td></tr>"+k+"</td></tr>");   
	             }  
	             out.println("</table>");  
	             out.println("</html></body>");  
	             con.close();  
	            }  
	             catch (Exception e) 
	            {  
	             out.println("error");  
	         }  
	     
		*/ //the above one is useless code
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Student_business_logic sbl=new Student_business_logic();
		//ArrayList all_data=sbl.retrive();
	//	System.out.println(all_data);
		
		/*
		//System.out.println(all_data.size());
		System.out.println(" the data are");
		request.setAttribute("list",all_data );
		request.getRequestDispatcher("./view_all_student.jsp").forward(request, response);
		//response.getWriter().println(all_data);
		 * 
		 
		DB_logic db=new DB_logic();
		ArrayList<DB_logic> list=db.Retrive_data_from_db();
		request.setAttribute("list",list );
		request.getRequestDispatcher("./view_all_student.jsp").forward(request, response);
		*/
		
		Student_business_logic sbl=new Student_business_logic();
		ArrayList all_data=sbl.retrive();
		System.out.println(all_data);
				
		//request.getRequestDispatcher("./view_all_student.jsp").forward(request, response);
		response.getWriter().println(all_data.get(0)+" "+all_data.get(1)+" "+all_data.get(2)+" "+all_data.get(3));
		response.getWriter().println(all_data.get(4)+" "+all_data.get(5)+" "+all_data.get(6)+" "+all_data.get(7));
		int x=(int) all_data.get(0);
		request.setAttribute("list",x );
		//request.getRequestDispatcher("./view_all_student.jsp").forward(request, response);
	}


	
	}

