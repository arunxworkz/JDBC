package com.xworkz.sports.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sports_table")
public class SportsDto {

	
	@Id
	private int id;
	@Column(name = "sports_name")
	private String sportsName;
	@Column(name = "no_0f_players")
	private int noOfPlayers;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSportsName() {
		return sportsName;
	}
	public void setSportsName(String sportsName) {
		this.sportsName = sportsName;
	}
	public int getNoOfPlayers() {
		return noOfPlayers;
	}
	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}
}
