import javax.servlet.*;
import javax.servlet.http.*;
public class SessionListenerEx implements HttpSessionListener{
	ServletContext ctx=null;
	private static int sessionCurrent=0,sessionTotal=0;
	public void sessionCreated(HttpSessionEvent e){
		sessionCurrent++;
		sessionTotal++;
		ctx=e.getSession().getServletContext();
		ctx.setAttribute("Total session",sessionTotal);
			ctx.setAttribute("Current session",sessionCurrent);
}
public void sessionDestroyed(HttpSessionEvent e)
{
	sessionCurrent--;
	ctx.setAttribute("Current Session",sessionCurrent);
}}
	