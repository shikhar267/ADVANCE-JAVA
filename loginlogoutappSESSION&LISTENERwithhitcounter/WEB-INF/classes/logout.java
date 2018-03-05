import javax.servlet.http.*;
import java.io.*;
import javax.servlet.*;
import java.sql.*; 
public class logout extends HttpServlet
{
public void service(HttpServletRequest request,HttpServletResponse response)
{
PrintWriter out=null;
try{
response.setContentType("text/html");
out=response.getWriter();
HttpSession hs=request.getSession(false);

hs.invalidate();
response.sendRedirect("index.html");
}
catch(Exception ex)
{
	out.print(""+ex);
}}}