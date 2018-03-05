import javax.servlet.http.*;
import java.io.*;
import javax.servlet.*;
import java.sql.*; 
public class Logout extends HttpServlet
{
public void service(HttpServletRequest request,HttpServletResponse response)
{
PrintWriter out=null;
try{
response.setContentType("text/html");
out=response.getWriter();
HttpSession hs=request.getSession(false);

hs.invalidate();
out.print("logout successfully");
}
catch(Exception ex)
{
	out.print(""+ex);
}}}