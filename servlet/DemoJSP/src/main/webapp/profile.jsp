<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"   %>
    
<%@ page  import="java.sql.*"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <%
    String url="jdbc:mysql://localhost:3306/db1";
    String username="root";
    String password="yash1616";
    String query="select * from Student_info;";
    try{
    	 Class.forName("com.mysql.cj.jdbc.Driver");

    	    Connection conn = DriverManager.getConnection(url, username, password);

    	    Statement st=conn.createStatement();

    	    ResultSet rs=st.executeQuery(query);

    	    while(rs.next())
    	    {
    	        String Output = rs.getString(1)+" "+rs.getInt(2)+" "+rs.getInt(3);

    	        out.println(Output);

    	    }
    }
    catch(Exception e){
    	out.print("bhai file load kar");
    }
    %>
</body>
</html>