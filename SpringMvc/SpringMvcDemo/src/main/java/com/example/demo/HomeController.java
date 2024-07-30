package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController 
{
	@GetMapping("/")
	public String home()
	{
		return "index.jsp";
	}
	
	@PostMapping("add")
	public String add(HttpServletRequest req)
	{
		int index = Integer.parseInt(req.getParameter("name1"));
		int index2 = Integer.parseInt(req.getParameter("name2"));
		
		int ans=index+index2;

		HttpSession session = req.getSession();
		session.setAttribute("ans", ans);

		return "result.jsp";
	}
}
