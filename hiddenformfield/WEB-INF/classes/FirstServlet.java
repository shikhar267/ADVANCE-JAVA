import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class FirstServlet extends HttpServlet
{
public void service(HttpServletRequest request,HttpServletResponse response)
{
PrintWriter out=null;
try{
response.setContentType("text/html");
out=response.getWriter();
String n1=request.getParameter("name");
String n2=request.getParameter("roll");
out.print("Hello"+n1);
out.print("your roll number="+n2);
out.print("<form action ='servlet2'>");
out.print("<input type='hidden' name='name' value =' "+ n1 +" '>");
out.print("<input type='hidden' name='roll' value =' "+ n2 + " '>");
out.print("<input type='submit' value='go'>");
out.print("</form>");
}
catch(Exception ex)
{
	out.println("exception:"+ex);
	
}
out.println("</body></html>");
out.close();
}
}