package com.xworkz.flowsync.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.NoArgsConstructor;

@Entity
@Table(name = "user")
@NoArgsConstructor

//Get all
@NamedQuery(name = "readAll", query = "select fl from FlowSyncDTO fl")

//Hard coded
@NamedQuery(name = "getByRatings", query = "select fl.accbal from FlowSyncDTO fl where fl.rating = 10.5")

//Soft coded with wnrire row
@NamedQuery(name = "getByBankName", query = "select fl from FlowSyncDTO fl where fl.bankname= :bankname")

@NamedQuery(name = "getByRating", query = "select fl from FlowSyncDTO fl where"
		+ " fl.rating> :ratings")

@NamedQuery(name = "getByName", query = "select fl.name, fl.accbal from FlowSyncDTO fl where fl.bankname='Kotak Mahindra'")



public class FlowSyncDTO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name = "name")
	String name;
	
	@Column(name = "accbal")
	double accbal;
	
	@Column(name = "rating")
	float rating;
	
	@Column(name = "bankname")
	String bankname;

/*	public FlowSyncDTO() {
	If we are using annotation of loambok 
	@NoAgrument then no need of creating the default constructor
}*/

	
	public FlowSyncDTO(String name, double accbal, float rating, String bankname) {
//		super();
		this.name = name;
		this.accbal = accbal;
		this.rating = rating;
		this.bankname = bankname;
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

	public double getAccbal() {
		return accbal;
	}

	public void setAccbal(double accbal) {
		this.accbal = accbal;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "FlowSyncDTO [id=" + id + ", name=" + name + ", accbal=" + accbal + ", rating=" + rating + ", bankname="
				+ bankname + "]";
	}

	
}
