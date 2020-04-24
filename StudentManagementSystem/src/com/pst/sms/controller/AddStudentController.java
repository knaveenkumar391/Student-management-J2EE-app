package com.pst.sms.controller;
import java.sql.*;
import java.util.ArrayList;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.pst.sms.services.Student_business_logic;
import com.pst.sms.studentVo.StudentVo;

/**
 * Servlet implementation class AddStudentController
 */
@WebServlet("/AddStudentController")
public class AddStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	StudentVo studentvo=null;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int Roll=Integer.parseInt(request.getParameter("roll_no"));
		String Name=request.getParameter("name");
		String Gen=request.getParameter("Gender");
		String Course=request.getParameter("course");
		
	    StudentVo studentVo=new StudentVo(); 
		studentVo.setRollno(Roll);
		studentVo.setName(Name);
		studentVo.setGender(Gen);
		studentVo.setCourse(Course);
		
		
		Student_business_logic studentService=new Student_business_logic();
		studentService.saveStudent(studentVo);
		String msg="Successfully Added";
		request.setAttribute("msg",msg);
		request.getRequestDispatcher("./add_student.jsp").forward(request, response);
		//response.getWriter().println(" Successfully added");
		//response.getWriter().println(rs);
		
		
	}

}
