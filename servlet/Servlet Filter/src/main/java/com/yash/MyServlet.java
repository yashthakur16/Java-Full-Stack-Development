package com.yash;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpResponse;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addAlien")

public class MyServlet extends HttpServlet 
{
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
    {
         int name1 = Integer.parseInt(req.getParameter("aid"));
        String name2 = req.getParameter("aname");

        PrintWriter out=res.getWriter();
        
        out.print("<html><head><style>body-color:black</style><head></html>");
        out.println("Hello " + name1 + " " + name2);

        
    }
}
