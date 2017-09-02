package com.nt.webservice.Model;

public class Profile {
	
	private long id;
	private String firstname;
	private String lastname;
	
	public Profile() {
		// TODO Auto-generated constructor stub
		System.out.println("0-arg constructor");
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	

}
