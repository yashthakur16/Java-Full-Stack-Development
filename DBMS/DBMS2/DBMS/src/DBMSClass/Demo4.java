package DBMSClass;
import java.sql.*;

public class Demo4 {

	public static void main(String[] args) throws Exception
	{
//		String url="jdbc:mysql://localhost:3306/db1";
//		String username="root";
//		String password="yash1616";
//		String query="Insert into Student_info values(?,?,?);";
//		String name="Vishrut";
//		int roll=69;
//		int marks=80;
//		
//		
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		Connection con=DriverManager.getConnection(url,username,password);
//		PreparedStatement st=con.prepareStatement(query);
//		st.setString(1, name);
//		st.setInt(2, roll);
//		st.setInt(3, marks);
//		
//		int count=st.executeUpdate();
//		
//		System.out.println(count+" rows affected");
//		
//		st.close();
//		con.close();
		
		String url="jdbc:mysql://localhost:3306:loginSystem";
		String uname="root";
		String pass="root";
		String query="select * from logindata where username='yash' and password='yash121';";	
		
		
		try
		{
			
		Class.forName("jdbc.mysql.cj");
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
			
		}

		

	}

}
