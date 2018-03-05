<%@page import="java.sql.SQLIntegrityConstraintViolationException"%>
<%
String e=request.getParameter("email");
String n=request.getParameter("name");
String p=request.getParameter("phone");
String d=request.getParameter("dob");
String pass=request.getParameter("pass");
String cpass=request.getParameter("cp");
if(pass.equals(cpass)){
try{
	java.sql.Statement st=(java.sql.Statement)application.getAttribute("stmt");
	st.executeUpdate("insert into User_info values('"+e+"','"+n+"','"+p+"','"+d+"','"+pass+"')");
	java.util.HashMap userDetails=new java.util.HashMap();
	userDetails.put("email", e);
	userDetails.put("name", n);
	userDetails.put("phone", p);
	userDetails.put("dob", d);
	
	session.setAttribute("userDetails",userDetails);
	response.sendRedirect("Profile.jsp");
}catch(java.sql.SQLIntegrityConstraintViolationException ex){
	response.sendRedirect("already.html");
}catch(Exception ex){
	ex.printStackTrace();
	response.sendRedirect("index.html");
}
}else{
	response.sendRedirect("notmatch.html");
}
%>