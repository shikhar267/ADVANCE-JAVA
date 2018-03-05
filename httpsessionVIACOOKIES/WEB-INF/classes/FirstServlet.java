/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
public class FirstServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
  protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out=null;
        try{
        response.setContentType("text/html;charset=UTF-8");
      out=response.getWriter();
      String n1=request.getParameter("name");
      String n2=request.getParameter("roll");
      out.print("Hello" +n1);
      out.print("your roll number " +n2);
        Cookie ck1=new Cookie("name",n1);
        Cookie ck2=new Cookie("roll",n2);
        response.addCookie(ck1);
        response.addCookie(ck2);
        out.print("<form action='servlet2'>");
        out.print("submit<input type='submit' value='go'>");
        out.print("</form>");
        }
            catch(Exception e){
                out.println(e);
                
            }
        out.close();
    }
}