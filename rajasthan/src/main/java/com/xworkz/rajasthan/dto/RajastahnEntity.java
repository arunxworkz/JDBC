package com.xworkz.rajasthan.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "producttable")
public class RajastahnEntity {
	@Id
	int id;
	String producttablename;
	String producttabletype;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProducttablename() {
		return producttablename;
	}
	public void setProducttablename(String producttablename) {
		this.producttablename = producttablename;
	}
	public String getProducttabletype() {
		return producttabletype;
	}
	public void setProducttabletype(String producttabletype) {
		this.producttabletype = producttabletype;
	}

	

}
