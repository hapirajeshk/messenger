package com.nt.webservice.database;

import java.util.HashMap;
import java.util.Map;

import com.nt.webservice.Model.Message;
import com.nt.webservice.Model.Profile;

public class MessageDatabase {
	
	public static Map<Long,Message> messages=new HashMap<>();
	public static Map<Long,Profile> profiles=new HashMap<>();
	
	public static Map getAllMessages(){
	  return messages;
	}
	public static Map getAllProfiles(){
		return profiles;
	}
}
