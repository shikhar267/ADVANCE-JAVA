import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
public class login extends HttpServlet
{
public void service(HttpServletRequest request,HttpServletResponse response)
{
PrintWriter out=null;
try{
response.setContentType("text/html");
out=response.getWriter();
String i=request.getParameter("email");
String j=request.getParameter("password");
ServletContext ctx=getServletContext();
Statement st=(Statement)ctx.getAttribute("stmt");
//Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from user_info where email='" + i + "' and password='"+ j +"'");
if(rs.next())
{
	HttpSession hs=request.getSession();
	hs.setAttribute("uid",i);
	response.sendRedirect("as");
}
else
{
	response.sendRedirect("loginError.html");
}
}
catch(Exception ex)
{
	out.println("exception:"+ex);
	
}
out.println("</body></html>");
}
}