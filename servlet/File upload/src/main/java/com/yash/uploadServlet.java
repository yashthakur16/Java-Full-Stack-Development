package com.yash;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;



@WebServlet("/upload")

public class uploadServlet extends HttpServlet {


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		ServletFileUpload sf=new ServletFileUpload(new DiskFileItemFactory());
		List<FileItem> multifiles= sf.parseRequest(request);
		
		for(FileItem item : multifiles)
		{
			item.write(new File("C:\\Users\\hp\\OneDrive\\Desktop\\Java Full Stack Development\\servlet\\File upload "+ item.getName()));
		}
	}

}
