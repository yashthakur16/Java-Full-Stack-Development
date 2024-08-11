package com.yash.ProductManagementApp.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yash.ProductManagementApp.model.Product;

public class productDB 
{
	Connection con =null;
	
	public productDB()
	{
		try {
			con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/projectdb1","postgres","yash1616");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void save(Product p) 
	{
		String query="insert into product (name,type,place,warranty) values(?,?,?,?)";
		
		try {
			PreparedStatement st=con.prepareStatement(query);
			st.setString(1, p.getName());
			st.setString(2, p.getType());
			st.setString(3, p.getPlace());
			st.setInt(4,p.getWarranty());
			st.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public List<Product> getProduct() {
		List<Product> products=new ArrayList<>();
		 String query="Select * from product";
		 try {
			PreparedStatement st=con.prepareStatement(query);
			ResultSet rs=st.executeQuery();
			
			while(rs.next())
			{
				Product p=new Product();
				p.setId(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setType(rs.getString(3));
				p.setPlace(rs.getString(4));
				p.setWarranty(rs.getInt(5));
				products.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		return products;
	}

	public Product getProductByName(String str) 
	{
		 String query="Select * from product where name=?";
		 Product p=null;
		 try {
			PreparedStatement st=con.prepareStatement(query);
			st.setString(1, str);
			ResultSet rs=st.executeQuery();
			  if (rs.next()) { // Check if there is any result
		            p = new Product();
		            p.setId(rs.getInt(1));
		            p.setName(rs.getString(2));
		            p.setType(rs.getString(3));
		            p.setPlace(rs.getString(4));
		            p.setWarranty(rs.getInt(5));
		        }
				
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return p;
		 
	}
	
}
