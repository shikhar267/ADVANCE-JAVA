import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
public class servletccex2 extends HttpServlet
{
	ServletContext ctx;
	ServletConfig con;

public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
	
	ctx=getServletContext();
	con=getServletConfig();
	String s1=con.getInitParameter("age");
	String s2=ctx.getInitParameter("email");
	
	PrintWriter out=null;

response.setContentType("text/html");
out=response.getWriter();
out.println("hye your age="+s1);
out.println("<br><br>hye your email="+s2);
out.println("</body></html>");
}
}