import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
public class RequestAttribute2 extends HttpServlet
{
public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
{
	PrintWriter out=null;
	
	
response.setContentType("text/html");
out=response.getWriter();
out.println("hello second servlet server");
String c=(String)request.getAttribute("company");
out.println("hello"+c);
out.println("after request dispatcher");
}
}