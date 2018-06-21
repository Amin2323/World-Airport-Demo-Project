package com.example.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "hotel")
public class Hotel {
	
	@Id
	private String id;
	private String title;
	private String discription;
	
	
	public Hotel(){
		
	}
	
	public Hotel(String id, String title, String discription) {
		super();
		this.id = id;
		this.title = title;
		this.discription = discription;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	
	
}
