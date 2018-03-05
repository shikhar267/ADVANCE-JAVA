                          import javax.servlet.*;
import java.io.*;
public class result implements Servlet{
public void init(ServletConfig con){}
public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
res.setContentType("text/html");
PrintWriter out=res.getWriter();
out.println("<html><body>");
String s1=req.getParameter("num1");
String s2=req.getParameter("num2");
int n1=Integer.parseInt(s1);
int n2=Integer.parseInt(s2);
int n=n1+n2;
out.println("<html><body>");
out.println("<p>my number is</p>");
out.println("sum="+n);
out.println("</body></html>");
}
public void destroy(){}
public ServletConfig getServletConfig(){
return null;
}
public String getServletInfo(){
return null;
}

}

