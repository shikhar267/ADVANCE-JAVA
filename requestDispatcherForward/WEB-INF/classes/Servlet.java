import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class Servlet extends HttpServlet
{
public void service(HttpServletRequest request,HttpServletResponse response)throws IOException
{
	PrintWriter out=null;

	//PrintWriter out=null;
response.setContentType("text/html");
out=response.getWriter();
String n=request.getParameter("Name");
out.println("welcome"+n);
}

}