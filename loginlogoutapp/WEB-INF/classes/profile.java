import javax.servlet.http.*;
import java.io.*;
import javax.servlet.*;
import java.sql.*; 
public class profile extends HttpServlet
{
public void service(HttpServletRequest request,HttpServletResponse response)
{
PrintWriter out=null;
try{
response.setContentType("text/html");
out=response.getWriter();

String n=request.getParameter("email");

Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","testdb","incapp");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from user_info where email='" + n + "'");
if(rs.next()){
	out.print("<html lang='en'><head><meta charset='utf-8'><meta name='viewport' content='width=device-width, initial-scale=1, shrink-to-fit=no'>	<title>Login Logout App</title><link href='bootstrap/css/bootstrap.min.css' rel='stylesheet'><link href='signin.css' rel='stylesheet'></head><body><header class='header'><div class='container'> <span class='text'>Login Logout App</span>  </div> </header><div class='container'>");
      
out.print("<br><br><b>email</b> :&nbsp;&nbsp;&nbsp;"   +rs.getString(1)+"  </br></br> <br> <br><b>Name:</b>&nbsp;&nbsp;&nbsp;"+rs.getString(2)+ "  </br></br>:  <br> <br><b> Phone Number</b>"+rs.getString(3)+ "  </br></br>:  <br> <br><b> date of birth </b>"+rs.getString(4));
out.print("<a href='index.html'>home");
}
}
catch(Exception ex)
{
	out.println("exception:"+ex);
	
}
out.println("</body></html>");
}
}