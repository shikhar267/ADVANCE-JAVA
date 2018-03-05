import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class SecondServlet extends HttpServlet
{
public void service(HttpServletRequest request,HttpServletResponse response)
{
PrintWriter out=null;
try{
response.setContentType("text/html");
out=response.getWriter();
String n1=request.getParameter("name");
String n2=request.getParameter("roll");
out.print("your name "+n1);
out.print("your roll number="+n2);

}
catch(Exception ex)
{
	out.println("exception:"+ex);
	
}
out.println("</body></html>");
out.close();
}
}