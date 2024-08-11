package com.yash.ProductManagementApp.service;

import java.util.ArrayList;
import java.util.List;

import com.yash.ProductManagementApp.DB.productDB;
import com.yash.ProductManagementApp.model.Product;

public class ProductService 
{
	productDB db=new productDB();
	
	public void addProduct(Product p)
	{
		db.save(p);
		System.out.println("Added successfully");
	}

	public List<Product> getProduct() {
		List<Product> products=db.getProduct();
		return products;
		
	}

	public Product getProductByName(String str) {
	Product p= db.getProductByName(str);
	return p;
	}
}
