package com.yash;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/login")
public class loginServlet extends HttpServlet {

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		String user= request.getParameter("username");
		String userpass= request.getParameter("password");
		String url="jdbc:mysql://localhost:3306/loginSystem";
        String username="root";
        String password="yash1616";
        String query="select password from logindata where username='"+user+"';";
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		

		Connection conn = DriverManager.getConnection(url, username, password);

        Statement st=conn.createStatement();

        ResultSet rs=st.executeQuery(query);

        rs.next();

                
        
        
        String pass = rs.getString("password");


		if(userpass.equals(pass))
		{
			HttpSession session=request.getSession();
            session.setAttribute("username", user);
			response.sendRedirect("Welcome.jsp");	
		}
		else
		{
			
			response.sendRedirect("login.jsp");
		}
        }
		catch(Exception e)
		{
			out.println(e);
		}
		

}
}