package com.Yash2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet 
{
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
    {
        String user=req.getParameter("username");
        String pass=req.getParameter("password");
        if(user.equals("yash") && pass.equals("123"))
        {
            PrintWriter out=res.getWriter();
            out.println("Welcome "+user);
        }
        else
        {
            PrintWriter out=res.getWriter();
            out.println("Invalid username or password");
        }
    }
}
