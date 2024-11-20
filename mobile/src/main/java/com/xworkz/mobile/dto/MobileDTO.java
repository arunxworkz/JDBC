package com.xworkz.mobile.dto;

public class MobileDTO {
	
	String name;
	String email;
	int age;
	String phNo;
	public MobileDTO(String name, String email, int age, String phNo) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhNo() {
		return phNo;
	}
	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}
	
	
}
