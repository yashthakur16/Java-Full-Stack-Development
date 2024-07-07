package com.Yash;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/square")
public class squareServlet extends HttpServlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
    {
//        int b=(int)req.getAttribute("k");

        // int c=Integer.parseInt(req.getParameter("number2"));

        // HttpSession session=req.getSession();
        // int a=(int)session.getAttribute("k");

        int a=0;

        Cookie cookies[]=req.getCookies();

        for(Cookie c : cookies)
        {
            if(c.getName().equals("k"))
            {
                a=Integer.parseInt(c.getValue());
            }
        }

        
        PrintWriter out=res.getWriter();

        out.println("<html><body bgcolor:black>");
        out.println(a*a);
        out.println("</body></html>");
        
    }
    
}
