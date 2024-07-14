package com.yash;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class loginServlet extends HttpServlet 
{
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
    {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        PrintWriter out=res.getWriter();
        
        if(username.equals("yash") && password.equals("abc"))
        {
            HttpSession session=req.getSession();
            session.setAttribute("username", username);
            res.sendRedirect("welcome.jsp");
        }
        else
        {
            out.println("wrong username or password");
        }

    }
}
