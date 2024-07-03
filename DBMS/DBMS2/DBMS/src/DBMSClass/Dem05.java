package DBMSClass;

import java.sql.*;



class Student
{
	String name="";
	int marks=0;
	
	public String getName(int roll)
	{
		String query="Select name from Student_info where rollno="+roll+";";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","yash1616");
			
			Statement st=con.createStatement();
			
			ResultSet rs=st.executeQuery(query);
			rs.next();
			
			return rs.getString(1);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return null;
	}
	
	public void addName(String Name, int roll,int marks)
	{
		String query="insert into student_info values (?,?,?);";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","yash1616");
			
			PreparedStatement st=con.prepareStatement(query);
			st.setString(1, Name);
			st.setInt(2, roll);
			st.setInt(3, marks);
			
			int count=st.executeUpdate();
			
			System.out.println(count +"rows updated");
			
			return;
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return ;
		

	}
}

public class Dem05 {

	public static void main(String[] args) 
	{
		Student s1=new Student();
		System.out.println(s1.getName(69));
		
		s1.addName("Krutik", 16, 67);

	}

}
