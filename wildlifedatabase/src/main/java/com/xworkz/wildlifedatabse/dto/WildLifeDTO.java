package com.xworkz.wildlifedatabse.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "details")
public class WildLifeDTO {
	
	@Id
	int id;
	@Column(name = "speciesname")
	String speciesname;
	@Column(name = "tagnumber")
	String tagnumber;
	@Column(name = "healthdetails")
	String healthdetails;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSpeciesname() {
		return speciesname;
	}
	public void setSpeciesname(String speciesname) {
		this.speciesname = speciesname;
	}
	public String getTagnumber() {
		return tagnumber;
	}
	public void setTagnumber(String tagnumber) {
		this.tagnumber = tagnumber;
	}
	public String getHealthdetails() {
		return healthdetails;
	}
	public void setHealthdetails(String healthdetails) {
		this.healthdetails = healthdetails;
	}
	
	
	
	
}
