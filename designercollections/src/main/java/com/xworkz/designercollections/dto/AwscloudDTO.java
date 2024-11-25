package com.xworkz.designercollections.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "instancecreation")
public class AwscloudDTO {

	@Id
	int id;
	@Column(name = "servername")
	String servername;
	@Column(name  = "instancetype")
	String instancetype;
	@Column(name = "os")
	String os;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getServername() {
		return servername;
	}
	public void setServername(String servername) {
		this.servername = servername;
	}
	public String getInstancetype() {
		return instancetype;
	}
	public void setInstancetype(String instancetype) {
		this.instancetype = instancetype;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	
	
	
	
}
