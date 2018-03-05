package my;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class CtxListener
 *
 */
@WebListener
public class CtxListener implements ServletContextListener {

	java.sql.Connection con;
    public CtxListener() {
        
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
    	try {
    		con.close();
	         }catch(Exception ex) {
	        	 ex.printStackTrace();
	         }
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
         try {
Class.forName("com.mysql.jdbc.Driver");
con=java.sql.DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/lla","root","incapp");
java.sql.Statement st=con.createStatement();   
ServletContext ctx=arg0.getServletContext();
ctx.setAttribute("dbcon",con);
ctx.setAttribute("stmt",st);
         }catch(Exception ex) {
        	 ex.printStackTrace();
         }
    }
	
}
