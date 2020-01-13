package ChandhiniPackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SubServlets extends HttpServlet 
{
   
    public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
    {
        int i=Integer.parseInt(req.getParameter("num1"));
        int j=Integer.parseInt(req.getParameter("num2"));
        int k=i-j;
        //PrintWriter out=res.getWriter();
        //out.println("Result is "+k);
        
        /* PASSING VALUE OF "K" TO SQSERVLET USING REQUEST DISPATCHER */
        
//        req.setAttribute("k value", k);
//        RequestDispatcher rd= req.getRequestDispatcher("sq");
//        rd.forward(req, res);

/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

/*PASSING VALUE USING SEND REDIRECT - URL Rewriting */

//        res.sendRedirect("sq?k value="+k);

/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

/*PASSING VALUE USING HTTPSESSION */

//HttpSession session=req.getSession();
//session.setAttribute("k value", k);
//res.sendRedirect("sq");

/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
Cookie ck=new Cookie("k cookie",k+"");
res.addCookie(ck);
res.sendRedirect("sq");




        
    }
}
    

