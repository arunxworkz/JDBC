package com.xworkz.standupcomedy.runner;

public enum DBConnection {
	
	URL("jdbc:mysql://localhost:3306/comedian"), USERNAME("root"), PASSWORD("7483079907");
	
	private String value;
	
	private DBConnection(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
