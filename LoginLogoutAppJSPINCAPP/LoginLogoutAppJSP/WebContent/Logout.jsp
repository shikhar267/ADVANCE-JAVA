<%
java.util.HashMap userDetails=(java.util.HashMap)session.getAttribute("userDetails");
if(userDetails!=null){
	session.invalidate();
	response.sendRedirect("index.html");
}
else{
	response.sendRedirect("sessionerror.html");
}
%>