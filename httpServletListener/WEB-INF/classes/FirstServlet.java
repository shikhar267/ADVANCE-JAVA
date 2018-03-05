import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
public class FirstServlet extends HttpServlet{
public void service(HttpServletRequest request,HttpServletResponse response){
response.setContentType("text/html");
PrintWriter out=null;
try{
out=response.getWriter();
String n=request.getParameter("uname");

out.print("welcome"+n);
HttpSession session=request.getSession();
session.setAttribute("uname",n);
ServletContext ctx=getServletContext();
int t=(Integer)ctx.getAttribute("Total session");
int c=(Integer)ctx.getAttribute("Current session");
out.print("<br>total session="+t);
out.print("<br>current session="+c);
out.print("<br><a href='logout'>logout</a>");
out.close();
}
catch(Exception ex)
{
	out.print(""+ex);
}
}
}