package com.xworkz.lory.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle")
public class vehicle {
	
	@Id
	int id;
	String make ;
	String model ;
	String year ;
	String ownername ;
	String vehiclecol ;
	String color ; 
	String enginetype ;
	String trrasmission ;
	String furltype ;
	String mileage ;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public String getVehiclecol() {
		return vehiclecol;
	}
	public void setVehiclecol(String vehiclecol) {
		this.vehiclecol = vehiclecol;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getEnginetype() {
		return enginetype;
	}
	public void setEnginetype(String enginetype) {
		this.enginetype = enginetype;
	}
	public String getTrrasmission() {
		return trrasmission;
	}
	public void setTrrasmission(String trrasmission) {
		this.trrasmission = trrasmission;
	}
	public String getFurltype() {
		return furltype;
	}
	public void setFurltype(String furltype) {
		this.furltype = furltype;
	}
	public String getMileage() {
		return mileage;
	}
	public void setMileage(String mileage) {
		this.mileage = mileage;
	}
	
	
}
