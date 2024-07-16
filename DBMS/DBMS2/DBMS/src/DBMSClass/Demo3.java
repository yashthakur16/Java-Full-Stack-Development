package DBMSClass;

import java.sql.*;

public class Demo3 
{
	public static void main(String[] args) throws Exception
	{
//		String query="Select name from Student_info where rollno=96;";
//		String url="jdbc:mysql://localhost:3306/db1";
//		String username="root";
//		String password="yash1616";
//		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		Connection con=DriverManager.getConnection(url,username,password);
//		
//		Statement st=con.createStatement();
//		
//		ResultSet rs=st.executeQuery(query);
//		
//		rs.next();
//		
//		System.out.println(rs.getString(1));
		
		String url="jdbc:mysql://localhost:3306/loginSystem";
		String uname="root";
		String pass="yash1616";
		
		String username="yash";
		String password="yash121";
		String query="select * from logindata where username='"+username+"' and password='"+password+"';";
		
		
		try
		{
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		if(rs.next())
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("not");
		}
		
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		

		
		
		
	}
}
