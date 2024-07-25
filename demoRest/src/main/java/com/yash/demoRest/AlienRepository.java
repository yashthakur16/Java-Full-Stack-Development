package com.yash.demoRest;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;


public class AlienRepository 
{
	
	
	Connection con = null;
	
	public AlienRepository()
	{
		String url="jdbc:mysql://localhost:3306/db3";
		String username="root";
		String password="yash1616";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,username,password);
		} catch (Exception e) {
			
			System.out.println(e);
			
		}
	}
	
	public List<Alien> getLAliens()
	{
		List<Alien> aliens= new ArrayList<>();
		String query="Select * from alien";
		
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(query);
			
			while(rs.next())
			{
				Alien a =new Alien();
				a.setId(rs.getInt("id"));
				a.setName(rs.getString("name"));
				a.setPoints(rs.getInt("points"));
				
				aliens.add(a);
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return aliens;
		
		
		
		
	}
	
	public Alien getAliens(int id)
	{
      String query="Select * from alien where id="+id;
		
		Statement st;
		try {
			st = con.createStatement();
			ResultSet rs=st.executeQuery(query);
			
			if(rs.next())
			{
				Alien a =new Alien();
				a.setId(rs.getInt("id"));
				a.setName(rs.getString("name"));
				a.setPoints(rs.getInt("points"));
				
				return a;
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
		
		
		
	}

	public void create(Alien a3) 
	{
		String query="insert into alien values(?,?,?)";
		
		PreparedStatement st;
		try {
			st = con.prepareStatement(query);
			
			
			st.setInt(1, a3.getId());
			st.setString(2, a3.getName());
			st.setInt(3,a3.getPoints());
			
			st.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		
		
	}

	public void updateA(Alien a) {
String query="update alien set name=?, points=? where id=?";
		
		PreparedStatement st;
		try {
			st = con.prepareStatement(query);
			
			
			st.setInt(3, a.getId());
			st.setString(1, a.getName());
			st.setInt(2,a.getPoints());
			
			st.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public void deleteA(Alien a) 
	{
String query="delete from alien where id=?";
		
		PreparedStatement st;
		try {
			st = con.prepareStatement(query);
			
			
			st.setInt(1, a.getId());
			
			st.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
