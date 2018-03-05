import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class jdbcex extends HttpServlet
{
public void service(HttpServletRequest request,HttpServletResponse response)
{
	PrintWriter out=null;
	try{
	//PrintWriter out=null;
response.setContentType("text/html");
out=response.getWriter();

Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/DATABASE","root","incapp");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from emp_info");
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



