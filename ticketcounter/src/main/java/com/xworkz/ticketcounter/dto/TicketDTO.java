package com.xworkz.ticketcounter.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ticket")

public class TicketDTO {

	@Id
	int id;
	@Column(name = "noofticket")
	int noofticket;
	@Column(name = "matchname")
	String matchname;
	@Column(name = "seatnumber")
	int seatnumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNoofticket() {
		return noofticket;
	}
	public void setNoofticket(int noofticket) {
		this.noofticket = noofticket;
	}
	public String getMatchname() {
		return matchname;
	}
	public void setMatchname(String matchname) {
		this.matchname = matchname;
	}
	public int getSeatnumber() {
		return seatnumber;
	}
	public void setSeatnumber(int seatnumber) {
		this.seatnumber = seatnumber;
	}
	
	
	
}
