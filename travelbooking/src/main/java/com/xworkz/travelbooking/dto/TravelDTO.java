package com.xworkz.travelbooking.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "traveldetails")
public class TravelDTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "name")
	String name;
	@Column(name = "email")
	String email;
	@Column(name = "destination")
	String destination;
	@Column(name = "departuredate")
	String departuredate;
	@Column(name = "returndate")
	String returndate;
	@Column(name = "totalcost")
	String totalcost;
	@Column(name = "bookingstatus")
	String bookingstatus;
	public TravelDTO(String name, String email, String destination, String departuredate, String returndate,
			String totalcost, String bookingstatus) {
		super();
		this.name = name;
		this.email = email;
		this.destination = destination;
		this.departuredate = departuredate;
		this.returndate = returndate;
		this.totalcost = totalcost;
		this.bookingstatus = bookingstatus;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDeparturedate() {
		return departuredate;
	}
	public void setDeparturedate(String departuredate) {
		this.departuredate = departuredate;
	}
	public String getReturndate() {
		return returndate;
	}
	public void setReturndate(String returndate) {
		this.returndate = returndate;
	}
	public String getTotalcost() {
		return totalcost;
	}
	public void setTotalcost(String totalcost) {
		this.totalcost = totalcost;
	}
	public String getBookingstatus() {
		return bookingstatus;
	}
	public void setBookingstatus(String bookingstatus) {
		this.bookingstatus = bookingstatus;
	}
	
}
