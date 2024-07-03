package DBMSClass;

import java.sql.*;

public class Demo2 {

	public static void main(String[] args) throws Exception
	{
		String query="Insert into student_info values('Omkar',12,85)";
		String url="jdbc:mysql://localhost:3306/db1";
		String username="root";
		String password="yash1616";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(url,username,password);
		
		Statement st=con.createStatement();
		st.executeUpdate(query);
		
		 st.close();

	        con.close();
		
		
		

	}

}
