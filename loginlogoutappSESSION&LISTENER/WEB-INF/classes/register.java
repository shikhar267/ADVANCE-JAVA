import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
public class register extends HttpServlet
{
	
public void service(HttpServletRequest request,HttpServletResponse response)
{
PrintWriter out=null;
try{
response.setContentType("text/html");
out=response.getWriter();
String s1=request.getParameter("email");
String s2=request.getParameter("name");
String s3=request.getParameter("phone");
String s4=request.getParameter("dob");
String s5=request.getParameter("password");
String s6=request.getParameter("confirmpassword");
ServletContext ctx=getServletContext();
Statement st=(Statement)ctx.getAttribute("stmt");
//you can do this by prepared statement
//Connection con=(Connection)ctx.getAttribute("dbCon");
int i =st.executeUpdate("insert into user_info(email,name,phone,dob,password) values ('" + s1 + "','" + s2 + "','" + s3 + "','" + s4 + "','" + s5 + "')");
//PreparedStatement ps1=con.prepareStatement("insert into user_info values(?,?,?,?,?)");
//ps1.setString(1,s1);
//ps1.setString(2,s2);
//ps1.setString(3,s3);


if(s5.equals(s6)){
	
	
//ps1.setString(4,s4);

//ps1.setString(5,s5);

//int i = st.executeUpdate();

      if(i!=0){
       HttpSession hs=request.getSession();
	hs.setAttribute("uid",s1);
	response.sendRedirect("as");
      }
      else{
        response.sendRedirect("registerFailed.html");
      }
    }
	else{
		        response.sendRedirect("passmismatch.html");
}
}
    catch (Exception e){
      out.println(e);
}

}}