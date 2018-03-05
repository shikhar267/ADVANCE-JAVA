import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class GetDataFromDB extends HttpServlet{
public void service(HttpServletRequest request,HttpServletResponse response){
response.setContentType("text/html");
PrintWriter out=null;
try{
out=response.getWriter();
ServletContext ctx=getServletContext();
Statement st=(Statement)ctx.getAttribute("stmt");
ResultSet rs=st.executeQuery("select * from emp_info");
while(rs.next()){
	out.print("<br> "+ rs.getString(1)+ " :" +rs.getString(2));
}
}
catch(Exception e)
{
	out.print(e);
}
out.close();
}
}
