<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript">

function DoValidate()
{	
	var textbox1_roll=document.getElementById("textBox1").value;
	var textbox2_name=document.getElementById("textBox2").value;
	var Course=document.getElementById("co").value;
	if(textbox1_roll == "" || textbox2_name == "" ||Course == "")
		{
		return false;
		}
	else{
		return true;
	}
	
	

	
	
}



</script>
<% String msg=(String)request.getAttribute("msg");
if(msg==null)
{
	msg="";
}
%>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div><%@include file="headder.html" %></div>

<div> 
<center>
<h1>Add Student</h1>
<h4 style="color: green"><%=msg %></h4>
<form action="./AddStudentController" name="student_form" method="post" onsubmit="return DoValidate()">

<table>
<tr><td> Student Roll no</td><td><input id="textBox1" type="text" placeholder="Enter your Roll no" name="roll_no" required="required"><span id="rollmsg"></span> </td> </tr>
<tr><td> Student Name</td><td><input id="textBox2" type="text" placeholder="Enter your Name" name="name" required="required"><span id="namemsg"></span> </td> </tr>
<tr><td>Gender</td><td><input type="radio" name="Gender" value="male">Male &nbsp&nbsp&nbsp <input type="radio" name="Gender" value="female"> Female </tr>
<tr><td>Course</td><td><select name="course" id="co" required="required">
<option value="">------select------</option>
<option value="java">Java</option>
<option value="html">HTML</option>
<option value="dotnet">.Net</option>

</select><span id="coursemsg"></span></td> </tr>
<tr><td><input type="submit" value="add student" /> </td><td> <input type="button" value="cancle"/></td></tr>


</table>


</form>
</center>








</div>
<div><%@include file="footer.html" %></div>

</body>
</html>