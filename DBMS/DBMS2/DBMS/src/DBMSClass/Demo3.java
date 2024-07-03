package DBMSClass;

import java.sql.*;

public class Demo3 
{
	public static void main(String[] args) throws Exception
	{
		String query="Select name from Student_info where rollno=96;";
		String url="jdbc:mysql://localhost:3306/db1";
		String username="root";
		String password="yash1616";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(url,username,password);
		
		Statement st=con.createStatement();
		
		ResultSet rs=st.executeQuery(query);
		
		rs.next();
		
		System.out.println(rs.getString(1));

		
		
		
	}
}
