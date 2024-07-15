package com.yash.web;

import java.io.IOException;
import java.io.PrintWriter;

//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import com.yash.web.dao.AlienDao;
//import com.yash.web.model.Alienmodel;

//import java.sql.*;

/**
 * Servlet implementation class Alien
 */
public class Alien extends HttpServlet {
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		
		PrintWriter out= response.getWriter();
		out.println("hey");
//		int roll =Integer.parseInt(request.getParameter("roll"));
//
//		AlienDao dao = new AlienDao();
//		Alienmodel alien = dao.getAlien(roll);
//
//		RequestDispatcher rd = request.getRequestDispatcher("show.jsp");
//		rd.forward(request,response);

		
		
//		String url="jdbc:mysql://localhost:3306";
//		String uname="root";
//		String pass="root";
//		String query="select * from alien where roll='"+roll+"';";
//		try
//		{
//			
//		
//		Class.forName("jdbc.mysql.cj");
//		Connection con=DriverManager.getConnection(url,uname,pass);
//		Statement st=con.createStatement();
//		ResultSet rs=st.executeQuery(query);
//
//		rs.next();
//		String name=rs.getString("name");
//		int marks=rs.getInt("marks");
//		
//		}
//		catch(Exception e)
//		{
//		}
//		
	}



}
