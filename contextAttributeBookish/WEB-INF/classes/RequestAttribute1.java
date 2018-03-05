import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
public class RequestAttribute1 extends HttpServlet
{
public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
{
	PrintWriter out=null;
	
	
response.setContentType("text/html");
out=response.getWriter();
out.println("hello first servlet </br>");
ServletContext context=getServletContext();
context.setAttribute("company","INCAPP");
out.println("<a href='s2'> second servlet</a>");
out.println("byyyyyyyyyyeeeeeeeee");

}
}