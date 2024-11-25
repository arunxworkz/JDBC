package com.xworkz.ryzex.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "details")
public class RyzenEntity {
	@Id
	private int id;
	private double ratings;
	private int series;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getRatings() {
		return ratings;
	}
	public void setRatings(double ratings) {
		this.ratings = ratings;
	}
	public int getSeries() {
		return series;
	}
	public void setSeries(int series) {
		this.series = series;
	}
	
	
}
