import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class servlet1 extends HttpServlet
{
public void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
{
PrintWriter out=null;
response.setContentType("text/html");
out=response.getWriter();
out.println("hye servlet 1");
response.sendRedirect("s2");
out.println("<br><br>bye servlet 1");
out.println("</body></html>");
}
}