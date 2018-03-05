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

Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","testdb","incapp");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from user_info where email='" + i + "' and password='"+ j +"'");
if(rs.next())
{
	RequestDispatcher rd=request.getRequestDispatcher("as");
			rd.forward(request,response);
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