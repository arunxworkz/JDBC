package com.xworkz.standupcomedy.runner;

public enum DBConnection1 {
	URL("jdbc:mysql://localhost:3306/vehicleregistration"), USERNAME("root"), PASSWORD("7483079907");
	
	private String value;
	
	private DBConnection1(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
