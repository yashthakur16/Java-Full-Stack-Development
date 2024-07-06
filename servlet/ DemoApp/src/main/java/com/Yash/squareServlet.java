package com.Yash;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class squareServlet extends HttpServlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
    {
        int b=(int)req.getAttribute("k");
     
        PrintWriter out=res.getWriter();
        out.println(b*b);
        
    }
    
}
