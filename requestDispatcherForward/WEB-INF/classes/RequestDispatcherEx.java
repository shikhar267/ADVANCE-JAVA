import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
public class RequestDispatcherEx extends HttpServlet
{
public void service(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
{
	PrintWriter out=null;
	
	//PrintWriter out=null;
response.setContentType("text/html");
out=response.getWriter();
out.println("before request dispatcher");
String n=request.getParameter("Name");
String r=request.getParameter("Roll");
if(n.equals("incapp")&&r.equals("1234")){
RequestDispatcher rd=request.getRequestDispatcher("s2");
rd.forward(request,response);
out.println("after request dispatcher");
}
else{
response.sendRedirect("indexError.html");
}
}
}