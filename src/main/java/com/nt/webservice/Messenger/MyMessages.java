package com.nt.webservice.Messenger;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.nt.webservice.Model.Message;
import com.nt.webservice.Model.Restaurant;
import com.nt.webservice.service.MessageService;

@Path("/message")
public class MyMessages {
	
	MessageService ms=new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages(){
		return ms.getAllmessage();
	}
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message addMessage(Message msg){
		return ms.addMessage(msg);
	}
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message updateMessage(@PathParam("id") long id, Message msg){
		msg.setId(id);
		return ms.updateMessage(msg);
		
	}
	@DELETE
	@Path("/{id}")
	public void deleteMessage(@PathParam("id")long id){
		ms.remove(id);
	}
	@GET
	@Path("/par")
	@Produces(MediaType.TEXT_PLAIN)
	public String queryTest(@QueryParam("name")String name){
		return name;
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("id") long id){
		System.out.println(id);
		return ms.getMessage(id);
	}
	@GET
	@Path("/southindian")
	@Produces(MediaType.APPLICATION_XML)
	public List<Restaurant> getRestname() {
		return ms.getAllRestaurant();
		
		//return new ObjectMapper().writeValueAsString(ls);
	}
}
