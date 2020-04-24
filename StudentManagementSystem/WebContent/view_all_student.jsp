<%@page import="com.pst.sms.dblogic.DB_logic"%>
<%@page import="com.pst.sms.services.Student_business_logic"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.ArrayList" %>
    
    
    
    
    
    
    
    
  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View all students</title>
</head>
<body>
<%
request.getAttribute("list");
%>

<center>
<table border="1px";>
<thead>
<tr><td>Roll no<td><td> Full Name<td><td>Gender<td><td>Course<td></tr>
</thead>

</table>
</center>
</body>
</html>