package com.xworkz.universalbusiness.dto;

import lombok.AllArgsConstructor;


public class BusinessDTO {
	String name;
	String email;
	String phNo;
	int age;
	String addNo;
	String panNo;
	
	public BusinessDTO(String name, String email, String phNo, int age, String addNo, String panNo) {
		this.name = name;
		this.email = email;
		this.panNo = panNo;
		this.age = age;
		this.addNo = addNo;
		this.phNo = phNo;
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

	public String getPhNo() {
		return phNo;
	}

	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddNo() {
		return addNo;
	}

	public void setAddNo(String addNo) {
		this.addNo = addNo;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	
	
	
	
	
}
