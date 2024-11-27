package com.xworkz.wildlifedatabse.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "recipes")
public class CookingDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column(name = "name")
	String name;
	@Column(name = "cuisinetype")
	String cuisinetype;
	@Column(name = "preptime")
	String preptime;
	public CookingDTO(String name, String cuisinetype, String preptime) {
		super();
		this.name = name;
		this.cuisinetype = cuisinetype;
		this.preptime = preptime;
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
	public String getCuisinetype() {
		return cuisinetype;
	}
	public void setCuisinetype(String cuisinetype) {
		this.cuisinetype = cuisinetype;
	}
	public String getPreptime() {
		return preptime;
	}
	public void setPreptime(String preptime) {
		this.preptime = preptime;
	}
	
	
	
	
}
