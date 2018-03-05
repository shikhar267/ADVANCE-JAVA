<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
try{
java.util.HashMap userDetails=(java.util.HashMap)session.getAttribute("userDetails");
if(userDetails!=null){
	int count=(Integer)application.getAttribute("count");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Login-Logout App</h1>
<hr>
No. of Times Website Visited <b><%=count %></b> <hr>
welcome: <%=userDetails.get("name") %> <a href='Logout.jsp'>Logout</a><br>
Email:<b><%=userDetails.get("email") %></b><br>
Phone:<b><%=userDetails.get("phone") %></b><br>
DOB:<b><%=userDetails.get("dob") %></b>	
</body>
</html>
<%
}else{
	response.sendRedirect("sessionerror.html");
}
}catch(Exception ex){
	ex.printStackTrace();
}
%>