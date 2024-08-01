package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Alien;


@Controller
public class HomeController 
{
	
	
	@ModelAttribute
	public void name(Model m)
	{
		m.addAttribute("name", "Aliens");
	}
	
	
	
	@GetMapping("/")
	public String home()
	{
		return "index";
	}
	
	@PostMapping("add")
	public String add(@RequestParam("name1")  int index,@RequestParam("name2") int index2,Model m)
	{
		
		
		int ans=index+index2;

		m.addAttribute("ans", ans);

		return "result";
	}
	
	@PostMapping("addAlien")
	public String addAlien(@ModelAttribute("a1") Alien a)
	{
		
		
		
		
//		Alien a=new Alien();
//		a.setId(id);
//		a.setName(name);
		
//		m.addAttribute("Alien", a);
		
		return "result";
	}
}
