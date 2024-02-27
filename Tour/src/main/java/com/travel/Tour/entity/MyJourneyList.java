package com.travel.Tour.entity;

import jakarta.persistence.*;

@Entity

@Table(name="JourneyList")
public class MyJourneyList {
	
	@Id
	private int id;
	private String state;
	//private String name;
	private String place;
	//private String price;
	private String mode;
	public MyJourneyList(int id, String state, String place, String mode) {
		super();
		this.id = id;
		this.state = state;
		this.place = place;
		this.mode = mode;
	}
	public MyJourneyList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	
	
	
}
