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

public class SqServlet extends HttpServlet 
{
   
    public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
    {
//        HttpSession session=req.getSession();
//        int k=(int)session.getAttribute("k value");
        
        /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
        
        //int k=Integer.parseInt(req.getParameter("k value"));
        int k=0;
        Cookie cookies[]=req.getCookies();
        for(Cookie c:cookies)
        {
            if(c.getName().equals("k cookie"))
                    
                        k=Integer.parseInt(c.getValue());
                        
                    
      
        }
       k=k*k;
        PrintWriter out=res.getWriter();
        out.println("Sq Called!");
        out.println("Result is "+k);
        
        
    }
}
    

