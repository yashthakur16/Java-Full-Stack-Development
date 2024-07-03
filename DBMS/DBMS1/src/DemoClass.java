import java.sql.*;

public class DemoClass 
{
    public static void main(String[] args) 
    {

        try
        {
            String url="jdbc:mysql://localhost:3306/db1";
        String username="root";
        String password="yash1616";
        String query="select marks from Student_info where name='Yash';";
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection(url, username, password);

        Statement st=conn.createStatement();

        ResultSet rs=st.executeQuery(query);

        rs.next();

        int marks = rs.getInt("marks");

        System.out.println(marks);

        st.close();

        conn.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }    
}
