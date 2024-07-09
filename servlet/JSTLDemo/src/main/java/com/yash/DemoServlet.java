package com.yash;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet
{
    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

//
//        List<Student> stud=Arrays.asList(new Student("yash",16),new Student("Rohan",29), new Student("Neha",92), new Student("Kaushal",43));
//        request.setAttribute("stud",stud);

        RequestDispatcher rd=request.getRequestDispatcher("display.jsp");
        rd.forward(request,response);

    }

}
