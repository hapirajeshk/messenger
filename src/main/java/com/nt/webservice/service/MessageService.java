package com.nt.webservice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.nt.webservice.Model.Message;
import com.nt.webservice.Model.Restaurant;
import com.nt.webservice.database.MessageDatabase;

public class MessageService {
	
	private Map<Long,Message> messages=MessageDatabase.getAllMessages();
	
	public MessageService(){
		messages.put(1l,new Message(10l,"badboy","happy"));
		messages.put(2l, new Message(30l,"goodboy","lucky"));
	}
	
	public List<Message> getAllmessage(){
		
		return new ArrayList<Message>(messages.values());
	}
	public Message getMessage(long id){
		return messages.get(id);
	}
	public Message updateMessage(Message msg){
		if(msg.getId()<=0){
			return null;
		}
		messages.put(msg.getId(),msg);
		return msg;
	}
	public Message addMessage(Message msg){
		msg.setId(messages.size()+1);
		messages.put(msg.getId(),msg);
		return msg;
	}
	public Message remove(long id){
		return messages.remove(id);
	}
	public List<Restaurant> getAllRestaurant(){
		Restaurant r1=new Restaurant();
		r1.setRestaurantId(1);
		r1.setRestaurantName("bahar cafe");
		r1.setAddress("hyderbad");
		
		Restaurant r2=new Restaurant();
		r2.setRestaurantId(2);
		r2.setAddress("bangalore");
		r2.setRestaurantName("biriyai central");
		List<Restaurant> lr=new ArrayList<>();
		lr.add(r1);
		lr.add(r2);
		return lr;
	}

}
