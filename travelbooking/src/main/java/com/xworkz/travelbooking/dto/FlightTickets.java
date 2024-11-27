package com.xworkz.travelbooking.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flightdetails")
public class FlightTickets {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "source")
	private String source;
	@Column(name = "destination")
	private String destination;
	@Column(name = "price")
	private double price;
	@Column(name = "seat")
	private int seat;

	public FlightTickets(String name, String source, String destination, double price, int seat) {
		this.name = name;
		this.source = source;
		this.destination = destination;
		this.price = price;
		this.seat = seat;
	}
	
	public FlightTickets() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getSeatNo() {
		return seat;
	}

	public void setSeatNo(int seat) {
		this.seat = seat;
	}

}
