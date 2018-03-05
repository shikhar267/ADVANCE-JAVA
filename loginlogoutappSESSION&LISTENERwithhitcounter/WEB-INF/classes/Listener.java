import javax.servlet.http.*;
import java.io.*;
import javax.servlet.*;
import java.sql.*; 
public class Listener implements ServletContextListener
{
public void contextInitialized(ServletContextEvent event)
{
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","testdb","incapp");
		Statement st=con.createStatement();
		ServletContext ctx=event.getServletContext();
		ctx.setAttribute("dbCon",con);
		ctx.setAttribute("stmt",st);
	}
	catch(Exception ex){
		System.out.println(ex);
	}
}
public void contextDestroyed(ServletContextEvent e){}
}