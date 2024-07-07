package com.Yash;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class addServlet extends HttpServlet
{
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
    {
    	
        int a = Integer.parseInt(req.getParameter("number1"));
        int b = Integer.parseInt(req.getParameter("number2"));

        int k=a+b;

        // PrintWriter out= res.getWriter();
        // out.println("Sum is "+k);

        // req.setAttribute("k",k);
        // RequestDispatcher rd =req.getRequestDispatcher("square");
        // rd.forward(req, res);

        // HttpSession session = req.getSession();
        // session.setAttribute("k",k);

        Cookie cookie=new Cookie("k",k+"");
        res.addCookie(cookie);


        res.sendRedirect("square");
    }
}