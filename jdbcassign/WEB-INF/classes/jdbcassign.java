import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class jdbcassign extends HttpServlet
{
public void service(HttpServletRequest request,HttpServletResponse response)
{
	PrintWriter out=null;
	try{
	//PrintWriter out=null;
response.setContentType("text/html");
out=response.getWriter();
String i=request.getParameter("ee");
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","testdb","incapp");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from emp_info where eid='" + i + "'");
while(rs.next())
{
out.print("<br>"+rs.getString(1)+"   :   "+rs.getString(2)+ " : "+rs.getInt(3)+ " : "+rs.getInt(4));

}

}
catch(Exception ex)
{
	out.println("exception:"+ex);
	
}
out.println("</body></html>");
}
}