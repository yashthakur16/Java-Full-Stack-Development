package com.yash;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlienResource 
{
	
	@Autowired
	AlienRepository repo;
	
	@GetMapping("aliens")
	public List<Alien> getAlien()
	{
		List<Alien> aliens=(List<Alien>) repo.findAll();
		return aliens;
	}
}
