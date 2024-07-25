package com.yash.demoRest;


import java.util.*;

import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



@Path("aliens")
public class AlienResource 
{
	
	AlienRepository repo=new AlienRepository();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Alien> getAlien()
	{
		
		
		return repo.getLAliens();
	}
	
	@GET
	@Path("tree/{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Alien getAlien1()
	{
	    int id=3;
		return repo.getAliens(id);
	}
	
	
	@POST
	@Path("alien")
	@Consumes(MediaType.APPLICATION_XML)
	public Alien createAlien(Alien a3)
	{
		System.out.println(a3);
		repo.create(a3);
		return a3;
	}
	
	@PUT
	@Path("updatealien")
	public void update(Alien a)
	{
		repo.updateA(a);
		return ;
	}
	
	@DELETE
	@Path("deletealien")
	public void delete(Alien a)
	{
		repo.deleteA(a);
		return ;
	}
	
}
