<%
try{

	Integer count=(Integer)application.getAttribute("count");
	if(count==null)
	{
		count=0;
	}
	count++;
	application.setAttribute("count",count);
	String e=request.getParameter("email");
	String p=request.getParameter("pass");
	
	java.sql.Statement st=(java.sql.Statement)application.getAttribute("stmt");
	java.sql.ResultSet rs=st.executeQuery("select * from user_info where email='"+e+"' and password='"+p+"'");
	if(rs.next()){
		java.util.HashMap userDetails=new java.util.HashMap();
		userDetails.put("email", e);
		userDetails.put("name", rs.getString(2));
		userDetails.put("phone", rs.getString(3));
		userDetails.put("dob", rs.getString(4));
		
		session.setAttribute("userDetails",userDetails);
		response.sendRedirect("Profile.jsp");
		 
	}else{
	   
		response.sendRedirect("loginerror.html");
		 
		 
	}
}catch(Exception ex){
%>
<%=ex%>
<%	
}
%>