package com.nt.webservice.Model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Restaurant {

	private int restaurantId;
	private String restaurantName;
	private String address;
	public int getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(int restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
