package com.travel.Tour.entity;

import jakarta.persistence.*;

@Entity
public class Travel {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String state;
	private String place;
	private String mode;
	public Travel(int id, String state, String place, String mode) {
		super();
		this.id = id;
		this.state = state;
		this.place = place;
		this.mode = mode;
	}
	public Travel() {
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
