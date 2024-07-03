package DBMSClass;

import java.sql.*;


public class Demo1 {

	public static void main(String[] args) {
		
		  try
	        {
	            String url="jdbc:mysql://localhost:3306/db1";
	        String username="root";
	        String password="yash1616";
	        String query="select * from Student_info;";
	        Class.forName("com.mysql.cj.jdbc.Driver");

	        Connection conn = DriverManager.getConnection(url, username, password);

	        Statement st=conn.createStatement();

	        ResultSet rs=st.executeQuery(query);

	        while(rs.next())
	        {
	        	String Output = rs.getString(1)+" "+rs.getInt(2)+" "+rs.getInt(3);

		        System.out.println(Output);

	        }

	        	        
	        
	        st.close();

	        conn.close();
	        }
	        catch(Exception e)
	        {
	            System.out.println(e);
	        }

	}

}
