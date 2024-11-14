package com.xworkz.standupcomedy.runner;

public class StandUpComedyDTO {

	private int id;
	private String name;
	private String location;
	private String price;
	
	public StandUpComedyDTO(int id, String name, String location, String price) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.price = price;
	}

	@Override
	public String toString() {
		return "StandUpComedyDTO [id=" + id + ", name=" + name + ", location=" + location + ", price=" + price + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	
	
	
}
